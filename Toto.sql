go
USE master
go
DROP DATABASE if exists ToTo
GO
CREATE DATABASE ToTo
GO
USE ToTo
GO

CREATE TABLE NhanVien (
MaNhanVien INT IDENTITY(1000,1) PRIMARY KEY,
HoVaTen NVARCHAR(40) NOT NULL,
NgaySinh DATE NOT NULL,
DiaChi NVARCHAR(100) NOT NULL,
CCCD VARCHAR(12) UNIQUE NOT NULL,
TrangThai INT NOT NULL,
Email VARCHAR(50) UNIQUE NOT NULL,
SoDienThoai VARCHAR(15) UNIQUE NOT NULL,
GhiChu NVARCHAR(1000),
Anh VARBINARY(MAX),
ChucVu NVARCHAR(100) NOT NULL
);

GO

CREATE TABLE TaiKhoan (
MaTaiKhoan VARCHAR(20) PRIMARY KEY,
MaNhanVien INT UNIQUE NOT NULL,
MatKhau VARCHAR(255) NOT NULL,
VaiTro NVARCHAR(100) NOT NULL,
TrangThai INT NOT NULL,
FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

GO

CREATE TABLE SanPham (
MaSanPham INT IDENTITY(1000,1) PRIMARY KEY,
TenSanPham NVARCHAR(70) NOT NULL,
TrangThai INT NOT NULL,
MoTa NVARCHAR(200),
Anh VARBINARY(MAX)
);
GO


CREATE TABLE MaGiamGia(
MaVoucher INT IDENTITY(80293992,949) PRIMARY KEY,
PhanTramGiam INT NOT NULL ,
HoaDonToiThieu INT NOT NULL  ,
GiamToiDa DECIMAL(19,4) NOT NULL ,
SoLuong INT NOT NULL ,
MaNguoiTao INT NOT NULL,
NgayBatDau Date NOT NULL DEFAULT GETDATE(),
NgayKetThuc Date NOT NULL,
FOREIGN KEY (MaNguoiTao) REFERENCES NhanVien(MaNhanVien)
);
GO


CREATE TABLE Ban(
MaBan INT IDENTITY(1000, 1) PRIMARY KEY,
TenBan NVARCHAR(100) NOT NULL,
Tang INT NOT NULL,
TrangThai INT NOT NULL
);

GO

CREATE TABLE HoaDon (
MaHoaDon INT  PRIMARY KEY,
MaNhanVien INT NOT NULL,
ThoiGian DATETIME DEFAULT GETDATE(),
TrangThaiThanhToan INT DEFAULT 0,
TrangThaiOrder INT DEFAULT 0,
MaVoucher INT,
GhiChu NVARCHAR(MAX),
DichVuPhatSinh money DEFAULT 0
FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
FOREIGN KEY (MaVoucher) REFERENCES MaGiamGia(MaVoucher)
);
GO

CREATE TABLE Ban_HoaDon(
MaHoaDon INT NOT NULL,
MaBan INT NOT NULL,
PRIMARY KEY (MaHoaDon,MaBan),
FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
FOREIGN KEY (MaBan) REFERENCES Ban(MaBan)
);

GO
CREATE TABLE ChiTietSanPham(
MaChiTietSanPham INT IDENTITY(1000,1) PRIMARY KEY,
MaSanPham INT NOT NULL,
Size VARCHAR(15) NOT NULL,
Gia DECIMAL(19,4) NOT NULL,
FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham)
);

GO

CREATE TABLE ChiTietHoaDon(
MaHoaDon INT NOT NULL,
MaChiTietSanPham INT NOT NULL,
SoLuong INT NOT NULL,
Gia DECIMAL(19,4) NOT NULL,
PRIMARY KEY (MaHoaDon,MaChiTietSanPham),
FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
FOREIGN KEY (MaChiTietSanPham) REFERENCES ChiTietSanPham(MaChiTietSanPham)
);

go


-- nạp dữ liệu bảng nhân viên
INSERT INTO NhanVien(HoVaTen,NgaySinh,DiaChi,CCCD,TrangThai,Email,SoDienThoai,GhiChu,ChucVu)
VALUES 
(N'Dương Thanh Tùng','1999-10-10',N'Bắc Giang','020367876296',1,'tungdtph30319@fpt.edu.vn','0398345987',N'Siêng năng, chăm chỉ',N'Quản lý'),
(N'Nguyễn Hoàng Nam','1999-07-10',N'Bắc Ninh','030467897456',1,'namnhph30310@fpt.edu.vn','0375486953',N'Hoạt bát, chịu khó',N'Nhân viên'),
(N'Nguyễn Văn Duy','1999-07-10',N'Hà Nội','040154687245',1,'duynvph30146@fpt.edu.vn','0333498746',N'Nhiệt tình, chu đáo',N'Pha chế'),
(N'Nguyễn Văn Cường','2000-11-02',N'Hà Nội','020154957245',0,'cuongnvph40976@gmail.com','0865398475',N'Nhiệt tình, chu đáo',N'Nhân viên'),
(N'Nguyễn Thị Lan','2002-11-12',N'Thanh Hóa','030154957876',0,'lanntph34685@gmail.com','0865765789',N'Lanh lợi , hoạt bát',N'Pha chế')
Select * from NhanVien
GO

--nạp dữ liệu bảng tài khoản
INSERT INTO TaiKhoan(MaTaiKhoan,MaNhanVien,MatKhau,VaiTro,TrangThai)
VALUES
('TKQL1000',1000,'quanly1000',N'QuanLy',1),
('TKNV1001',1001,'nhanvien1001',N'NhanVien',1),
('TKPC1002',1002,'phache1002',N'PhaChe',1),
('TKNV1003',1003,'nhanvien1003',N'NhanVien',0),
('TKPC1004',1004,'phache1004',N'PhaChe',0)
select * from TaiKhoan
go

--nạp dữ liệu bảng sản phẩm
INSERT INTO SanPham(TenSanPham,TrangThai,MoTa,Anh)
VALUES
(N'Trà xoài bưởi hồng',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tra xoai buoi hong.png', single_blob) as T)),
(N'Choco ngũ cốc kem cafe',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\choco ngu coc kem ca phe.png', single_blob) as T)),
(N'Hồng trà sữa ngũ cốc kem cafe',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\hong tra ngu coc kem cafe.png', single_blob) as T)),
(N'Ô long xoài kem cafe',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\O long xoài kem ca phe.jpg', single_blob) as T)),
(N'Tiger sugar',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tiger sugar.jpg', single_blob) as T)),
(N'Trà đào bưởi hồng',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\Tra dao buoi hong.jpg', single_blob) as T)),
(N'Trà dứa nhiệt đới',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tra dua nhiet doi.png', single_blob) as T)),
(N'Trà sữa chân châu',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tra sua chan chau.jpg', single_blob) as T)),
(N'Trà sữa Matcha',2,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tra sua matcha.jpg', single_blob) as T)),
(N'Trà sữa ô long',1,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tra sua o long.jpg', single_blob) as T)),
(N'Trà sữa panda',0,N'thơm ngon',(select * from openrowset (bulk 'D:\Anh tra sua\tra sua panda.jpg', single_blob) as T))
go
select * from SanPham
--nạp dữ liệu bảng mã giảm giá
INSERT INTO MaGiamGia(PhanTramGiam,HoaDonToiThieu,GiamToiDa,NgayBatDau,NgayKetThuc,MaNguoiTao,SoLuong)
VALUES 
(10,1,30000,'2023-08-15','2023-08-20',1000,20),
(15,1,45000,'2023-08-13','2023-09-05',1000,50),
(18,1,55000,'2023-06-06','2023-06-15',1000,40),
(25,1,75000,'2023-08-11','2023-09-15',1000,50),
(30,1,105000,'2023-08-14','2023-08-25',1000,35)
go
select * from MaGiamGia
--nạp dữ liệu bảng bàn
INSERT INTO Ban(TenBan,Tang,TrangThai)
VALUES 
(N'MV01',0,0),
(N'MV02',0,0),
(N'MV03',0,0),
(N'B1T1',1,0),
(N'B2T1',1,0),
(N'B3T1',1,0),
(N'B4T1',1,0),
(N'B5T1',1,0),
(N'B6T1',1,0),
(N'B7T1',1,0),
(N'B8T1',1,0),
(N'B9T1',1,0),
(N'B10T1',1,0),
(N'B11T1',1,0),
(N'B12T1',1,0),
(N'B13T1',1,0),
(N'B14T1',1,0),
(N'B15T1',1,0),
(N'B16T2',2,0),
(N'B17T2',2,0),
(N'B18T2',2,0),
(N'B19T2',2,0),
(N'B20T2',2,0),
(N'B21T2',2,0),
(N'B22T2',2,0),
(N'B23T2',2,0),
(N'B24T2',2,0),
(N'B25T2',2,0),
(N'B26T2',2,0),
(N'B27T2',2,0),
(N'B28T2',2,0),
(N'B29T2',2,0),
(N'B30T2',2,0),
(N'B31T3',3,0),
(N'B32T3',3,0),
(N'B33T3',3,0),
(N'B34T3',3,0),
(N'B35T3',3,0),
(N'B36T3',3,0),
(N'B37T3',3,0),
(N'B38T3',3,0),
(N'B39T3',3,0),
(N'B40T3',3,0),
(N'B41T3',3,0),
(N'B42T3',3,0),
(N'B43T3',3,0),
(N'B44T3',3,0),
(N'B45T3',3,0),
(N'B46T4',4,0),
(N'B47T4',4,0),
(N'B48T4',4,0),
(N'B49T4',4,0),
(N'B50T4',4,0),
(N'B51T4',4,0),
(N'B52T4',4,0),
(N'B53T4',4,0),
(N'B54T4',4,0),
(N'B55T4',4,0),
(N'B56T4',4,0),
(N'B57T4',4,0),
(N'B58T4',4,0),
(N'B59T4',4,0),
(N'B60T4',4,0),
(N'B61T5',5,0),
(N'B62T5',5,0),
(N'B63T5',5,0),
(N'B64T5',5,0),
(N'B65T5',5,0),
(N'B66T5',5,0),
(N'B67T5',5,0),
(N'B68T5',5,0),
(N'B69T5',5,0),
(N'B70T5',5,0),
(N'B71T5',5,0),
(N'B72T5',5,0),
(N'B73T5',5,0),
(N'B74T5',5,0),
(N'B75T5',5,0)
go
select * from Ban
--nạp dữ liệu hóa đơn
INSERT INTO HoaDon VALUES
(1000,1001,'2023-08-15',0,1,80293992,N'Ít đường',20000),
(1001,1001,'2023-08-14',1,1,80293992,N'Nhiều đường',20000),
(1002,1001,'2023-08-14',1,1,80293992,N'Nhiều đá',20000),
(1003,1001,'2023-08-14',1,1,80293992,N'Ít đường',20000),
(1004,1001,'2023-08-14',1,1,80293992,N'Ít đường',20000),
(1005,1001,'2023-06-06',1,1,80293992,N'Ít đường',20000),
(1006,1001,'2023-06-06',1,1,80293992,N'Ít đường',20000),
(1007,1001,'2023-06-06',1,1,80293992,N'Ít đường',20000),
(1008,1001,'2023-06-06',1,1,80293992,N'Ít đường',20000),
(1009,1001,'2023-06-06',1,1,80293992,N'Ít đường',20000),
(1010,1001,'2023-06-06',1,1,80293992,N'Ít đường',20000),
(1011,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1012,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1013,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1014,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1015,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1016,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1017,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1018,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1019,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1020,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1021,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1022,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1023,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1024,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1025,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1026,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1027,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1028,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1029,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1030,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1031,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1032,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1033,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1034,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1035,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1036,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1037,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1038,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1039,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1040,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1041,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1042,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1043,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1044,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1045,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1046,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1047,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1048,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1049,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1050,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1051,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1052,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1053,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1054,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1055,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1056,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1057,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1058,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1059,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1060,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1061,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1062,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1063,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1064,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1065,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1066,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1067,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1068,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1069,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1070,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1071,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1072,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1073,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1074,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1075,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1076,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1077,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1078,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1079,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1080,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1081,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1082,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1083,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1084,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1085,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1086,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1087,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1088,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1089,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1090,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1091,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1092,1001,GETDATE(),0,1,80294941,N'Ít đường',10000),
(1093,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1094,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1095,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1096,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1097,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1098,1001,GETDATE(),0,1,80294941,N'Ít đường',10000),
(1099,1001,GETDATE(),1,1,80294941,N'Ít đường',10000),
(1100,1001,GETDATE(),0,1,80294941,N'Ít đường',10000),
(1101,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1102,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1103,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1104,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1105,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1106,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1107,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1108,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1109,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1110,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1111,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1112,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1113,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1114,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1115,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1116,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1117,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1118,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1119,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1120,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1121,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1122,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1123,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1124,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1125,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1126,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1127,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1128,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1129,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1130,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1131,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1132,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1133,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1134,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1135,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1136,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1137,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1138,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1139,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1140,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1141,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1142,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1143,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1144,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1145,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1146,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1147,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1148,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1149,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1150,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1151,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1152,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1153,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1154,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1155,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1156,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1157,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1158,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1159,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1160,1003,'2023-08-14',1,1,80295890,N'Nhiều đá',0),
(1161,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1162,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1163,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1164,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1165,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1166,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1167,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1168,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1169,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1170,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1171,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1172,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1173,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1174,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1175,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1176,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1177,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1178,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1179,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1180,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1181,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1182,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1183,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1184,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1185,1003,'2023-08-25',1,1,null,N'Ít đá',0),
(1186,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1187,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1188,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1189,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1190,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1191,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1192,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1193,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1194,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1195,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1196,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1197,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1198,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1199,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1200,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1201,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1202,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1203,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1204,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000),
(1205,1003,GETDATE(),1,1,80297788,N'Nhiều đường',25000)
go
select * from HoaDon
--nạp dữ liệu bàn-hóa đơn
INSERT INTO Ban_HoaDon(MaHoaDon,MaBan)
VALUES
(1000,1000),
(1001,1000),
(1002,1000),
(1003,1000),
(1004,1000),
(1005,1000),
(1006,1000),
(1007,1000),
(1008,1000),
(1009,1000),
(1010,1000),
(1011,1000),
(1012,1000),
(1013,1000),
(1014,1000),
(1015,1000),
(1016,1000),
(1017,1000),
(1018,1000),
(1019,1000),
(1020,1000),
(1021,1000),
(1022,1000),
(1023,1000),
(1024,1000),
(1025,1000),
(1026,1000),
(1027,1000),
(1028,1000),
(1029,1000),
(1030,1000),
(1031,1000),
(1032,1000),
(1033,1000),
(1034,1000),
(1035,1000),
(1036,1000),
(1037,1000),
(1038,1000),
(1039,1000),
(1040,1000),
(1041,1000),
(1042,1000),
(1043,1000),
(1044,1000),
(1045,1000),
(1046,1000),
(1047,1000),
(1048,1000),
(1049,1000),
(1050,1000),
(1051,1005),
(1052,1005),
(1053,1005),
(1054,1005),
(1055,1005),
(1056,1005),
(1057,1005),
(1058,1005),
(1059,1005),
(1060,1005),
(1061,1005),
(1062,1005),
(1063,1005),
(1064,1005),
(1065,1005),
(1066,1005),
(1067,1005),
(1068,1005),
(1069,1005),
(1070,1005),
(1071,1005),
(1072,1005),
(1073,1005),
(1074,1005),
(1075,1005),
(1076,1005),
(1077,1005),
(1078,1005),
(1079,1005),
(1080,1005),
(1081,1005),
(1082,1005),
(1083,1005),
(1084,1005),
(1085,1005),
(1086,1005),
(1087,1005),
(1088,1005),
(1089,1005),
(1090,1005),
(1091,1005),
(1092,1005),
(1093,1005),
(1094,1005),
(1095,1005),
(1096,1005),
(1097,1005),
(1098,1005),
(1099,1005),
(1100,1005),
(1101,1020),
(1102,1020),
(1103,1020),
(1104,1020),
(1105,1020),
(1106,1020),
(1107,1020),
(1108,1020),
(1109,1020),
(1110,1020),
(1111,1020),
(1112,1020),
(1113,1020),
(1114,1020),
(1115,1020),
(1116,1020),
(1117,1020),
(1118,1020),
(1119,1020),
(1120,1020),
(1121,1020),
(1122,1020),
(1123,1020),
(1124,1020),
(1125,1020),
(1126,1020),
(1127,1020),
(1128,1020),
(1129,1020),
(1130,1020),
(1131,1020),
(1132,1020),
(1133,1020),
(1134,1020),
(1135,1020),
(1136,1020),
(1137,1020),
(1138,1020),
(1139,1020),
(1140,1020),
(1141,1020),
(1142,1020),
(1143,1020),
(1144,1020),
(1145,1020),
(1146,1020),
(1147,1020),
(1148,1020),
(1149,1020),
(1150,1020),
(1151,1035),
(1152,1035),
(1153,1035),
(1154,1035),
(1155,1035),
(1156,1035),
(1157,1035),
(1158,1035),
(1159,1035),
(1160,1035),
(1161,1035),
(1162,1035),
(1163,1035),
(1164,1035),
(1165,1035),
(1166,1035),
(1167,1035),
(1168,1035),
(1169,1035),
(1170,1035),
(1171,1035),
(1172,1035),
(1173,1035),
(1174,1035),
(1175,1035),
(1176,1035),
(1177,1035),
(1178,1035),
(1179,1035),
(1180,1035),
(1181,1035),
(1182,1035),
(1183,1035),
(1184,1035),
(1185,1035),
(1186,1035),
(1187,1035),
(1188,1035),
(1189,1035),
(1190,1035),
(1191,1035),
(1192,1035),
(1193,1035),
(1194,1035),
(1195,1035),
(1196,1035),
(1197,1035),
(1198,1035),
(1199,1035),
(1200,1035),
(1201,1035),
(1202,1035),
(1203,1035),
(1204,1035),
(1205,1035)
go
select * from Ban_HoaDon
--nạp dữ liệu chi tiết sản phẩm
INSERT INTO ChiTietSanPham(MaSanPham,Size,Gia) VALUES
(1000,'M',35000),
(1000,'S',30000),
(1001,'S',30000),
(1001,'L',45000),
(1002,'S',25000),
(1002,'M',28000),
(1003,'S',22000),
(1003,'M',26000),
(1004,'S',25000),
(1004,'M',29000),
(1004,'L',33000),
(1005,'S',26000),
(1005,'M',30000),
(1006,'M',40000),
(1006,'L',47000),
(1007,'S',29000),
(1007,'L',35000),
(1008,'S',23000),
(1008,'M',29000),
(1009,'S',31000),
(1009,'M',37000),
(1010,'S',30000),
(1010,'M',37000),
(1010,'L',45000)
go
select * from ChiTietSanPham
--nạp dữ liệu chi tiết hóa đơn
INSERT INTO ChiTietHoaDon(MaHoaDon,MaChiTietSanPham,SoLuong,Gia)
VALUES
(1000,1000,2,35000),
(1000,1001,3,30000),
(1001,1000,2,35000),
(1002,1000,2,35000),
(1003,1000,2,35000),
(1004,1000,2,35000),
(1005,1000,2,35000),
(1006,1000,2,35000),
(1007,1000,2,35000),
(1008,1000,2,35000),
(1009,1000,2,35000),
(1010,1000,2,35000),
(1011,1000,2,35000),
(1012,1000,2,35000),
(1013,1000,2,35000),
(1014,1000,2,35000),
(1015,1000,2,35000),
(1016,1000,2,35000),
(1017,1000,2,35000),
(1018,1000,2,35000),
(1019,1000,2,35000),
(1020,1000,2,35000),
(1021,1000,2,35000),
(1022,1000,2,35000),
(1023,1000,2,35000),
(1024,1000,2,35000),
(1025,1000,2,35000),
(1026,1000,2,35000),
(1027,1000,2,35000),
(1028,1000,2,35000),
(1029,1000,2,35000),
(1030,1000,2,35000),
(1031,1000,2,35000),
(1032,1000,2,35000),
(1033,1000,2,35000),
(1034,1000,2,35000),
(1035,1000,2,35000),
(1036,1000,2,35000),
(1037,1000,2,35000),
(1038,1000,2,35000),
(1039,1000,2,35000),
(1040,1000,2,35000),
(1041,1000,2,35000),
(1042,1000,2,35000),
(1043,1000,2,35000),
(1044,1000,2,35000),
(1045,1000,2,35000),
(1046,1000,2,35000),
(1047,1000,2,35000),
(1048,1000,2,35000),
(1049,1000,2,35000),
(1050,1000,2,35000),
(1050,1003,3,45000),
(1051,1010,1,33000),
(1051,1009,3,29000),
(1052,1010,1,33000),
(1053,1010,1,33000),
(1054,1010,1,33000),
(1055,1010,1,33000),
(1056,1010,1,33000),
(1057,1010,1,33000),
(1058,1010,1,33000),
(1059,1010,1,33000),
(1060,1010,1,33000),
(1061,1010,1,33000),
(1062,1010,1,33000),
(1063,1010,1,33000),
(1064,1010,1,33000),
(1065,1010,1,33000),
(1066,1010,1,33000),
(1067,1010,1,33000),
(1068,1010,1,33000),
(1069,1010,1,33000),
(1070,1010,1,33000),
(1071,1010,1,33000),
(1072,1010,1,33000),
(1073,1010,1,33000),
(1074,1010,1,33000),
(1075,1010,1,33000),
(1076,1010,1,33000),
(1077,1010,1,33000),
(1078,1010,1,33000),
(1079,1010,1,33000),
(1080,1010,1,33000),
(1081,1010,1,33000),
(1082,1010,1,33000),
(1083,1010,1,33000),
(1084,1010,1,33000),
(1085,1010,1,33000),
(1086,1010,1,33000),
(1087,1010,1,33000),
(1088,1010,1,33000),
(1089,1010,1,33000),
(1090,1010,1,33000),
(1091,1010,1,33000),
(1092,1010,1,33000),
(1093,1010,1,33000),
(1094,1010,1,33000),
(1095,1010,1,33000),
(1096,1010,1,33000),
(1097,1010,1,33000),
(1098,1010,1,33000),
(1099,1010,1,33000),
(1100,1010,1,33000),
(1101,1015,4,29000),
(1101,1016,2,35000),
(1102,1015,4,29000),
(1103,1015,4,29000),
(1104,1015,4,29000),
(1105,1015,4,29000),
(1106,1015,4,29000),
(1107,1015,4,29000),
(1108,1015,4,29000),
(1109,1015,4,29000),
(1110,1015,4,29000),
(1111,1015,4,29000),
(1112,1015,4,29000),
(1113,1015,4,29000),
(1114,1015,4,29000),
(1115,1015,4,29000),
(1116,1015,4,29000),
(1117,1015,4,29000),
(1118,1015,4,29000),
(1119,1015,4,29000),
(1120,1015,4,29000),
(1121,1015,4,29000),
(1122,1015,4,29000),
(1123,1015,4,29000),
(1124,1015,4,29000),
(1125,1015,4,29000),
(1126,1015,4,29000),
(1127,1015,4,29000),
(1128,1015,4,29000),
(1129,1015,4,29000),
(1130,1015,4,29000),
(1131,1015,4,29000),
(1132,1015,4,29000),
(1133,1015,4,29000),
(1134,1015,4,29000),
(1135,1015,4,29000),
(1136,1015,4,29000),
(1137,1015,4,29000),
(1138,1015,4,29000),
(1139,1015,4,29000),
(1140,1015,4,29000),
(1141,1015,4,29000),
(1142,1015,4,29000),
(1143,1015,4,29000),
(1144,1015,4,29000),
(1145,1015,4,29000),
(1146,1015,4,29000),
(1147,1015,4,29000),
(1148,1015,4,29000),
(1149,1015,4,29000),
(1150,1015,4,29000),
(1151,1020,5,37000),
(1152,1020,5,37000),
(1153,1020,5,37000),
(1154,1020,5,37000),
(1155,1020,5,37000),
(1156,1020,5,37000),
(1157,1020,5,37000),
(1158,1020,5,37000),
(1159,1020,5,37000),
(1160,1020,5,37000),
(1161,1020,5,37000),
(1162,1020,5,37000),
(1163,1020,5,37000),
(1164,1020,5,37000),
(1165,1020,5,37000),
(1166,1020,5,37000),
(1167,1020,5,37000),
(1168,1020,5,37000),
(1169,1020,5,37000),
(1170,1020,5,37000),
(1171,1020,5,37000),
(1172,1020,5,37000),
(1173,1020,5,37000),
(1174,1020,5,37000),
(1175,1020,5,37000),
(1176,1020,5,37000),
(1177,1020,5,37000),
(1178,1020,5,37000),
(1179,1020,5,37000),
(1180,1020,5,37000),
(1181,1020,5,37000),
(1182,1020,5,37000),
(1183,1020,5,37000),
(1184,1020,5,37000),
(1185,1020,5,37000),
(1186,1020,5,37000),
(1187,1020,5,37000),
(1188,1020,5,37000),
(1189,1020,5,37000),
(1190,1020,5,37000),
(1191,1020,5,37000),
(1192,1020,5,37000),
(1193,1020,5,37000),
(1194,1020,5,37000),
(1195,1020,5,37000),
(1196,1020,5,37000),
(1197,1020,5,37000),
(1198,1020,5,37000),
(1199,1020,5,37000),
(1200,1020,5,37000),
(1201,1020,5,37000),
(1202,1020,5,37000),
(1203,1020,5,37000),
(1204,1020,5,37000),
(1205,1020,5,37000),
(1205,1021,2,30000)
go
select * from ChiTietHoaDon

-- Sửa bảng hóa đơn thêm cột chi dịch vụ phát sinh
--1 .NhanVien
-- SELECT MaNhanVien,HoVaTen,NgaySinh,DiaChi,CCCD,TrangThai,Email,SoDienThoai,GhiChu,Anh,ChucVu FROM NhanVien
--INSERT INTO NhanVien(HoVaTen,NgaySinh,DiaChi,CCCD,TrangThai,Email,SoDienThoai,GhiChu,Anh,ChucVu) 
--VALUES(?,?,?,?,?,?,?,?,?,?)
--DELETE FROM NhanVien WHERE 
--UPDATE NhanVien SET ? WHERE ?

--2.TaiKhoan
--SELECT MaTaiKhoan,MaNhanVien,MatKhau,VaiTro,TrangThai FROM TaiKhoan
--INSERT INTO TaiKhoan(MaNhanVien,MatKhau,VaiTro,TrangThai) 
--VALUES(?,?,?,?)
--DELETE FROM TaiKhoan WHERE
--UPDATE TaiKhoan SET =? WHERE =?

--3.SanPham
--SELECT MaSanPham,TenSanPham,TrangThai,MoTa,Anh FROM SanPham
--INSERT INTO SanPham(TenSanPham,TrangThai,MoTa,Anh)
--VALUES(?,?,?,?)
--DELETE FROM SanPham WHERE =?
--UPDATE SanPham SET =? WHERE =?

--4.MaGiamGia
--SELECT MaVoucher,PhanTramGiam,HoaDonToiThieu,GiamToiDa,HanSuDung,MaNguoiTao,TrangThai FROM MaGiamGia 
--INSERT INTO MaGiamGia(PhanTramGiam,GiamToiDa,HanSuDung,MaNguoiTao,TrangThai)
--VALUES(?,?,?,?,?)
--DELETE FROM MaGiamGia WHERE =?
--UPDATE MaGiamGia SET? WHERE?

--5.Ban
--SELECT MaBan,TenBan,Tang,TrangThai FROM Ban
--INSERT INTO BAN(TenBan,Tang,TrangThai) VALUES(?,?,?)
--DELETE FROM BAN WHERE=?
--UPDATE BAN SET =? WHERE =?
--6.HoaDon
--SELECT MaHoaDon,MaNhanVien,ThoiGian,TrangThaiThanhToan,TrangThaiOrder,MaVoucher FROM HoaDon
--INSERT INTO HoaDon(ThoiGian,TrangThaiThanhToan,TrangThaiOrder,MaVoucher)
--VALUES(?,?,?,?)
--DELETE FROM HoaDon WHERE=ThoiGian=?
--UPDATE HoaDon SET ThoiGian=? WHERE MaHoaDon=?

--7.Ban_HoaDon
--SELECT MaHoaDon,MaBan FROM Ban_HoaDon
--INSERT INTO Ban_HoaDon(MaHoaDon,MaBan) 
--VALUES(?,?)
--DELETE FROM Ban_HoaDon WHERE MaHoaDon=?
--UPDATE Ban_HoaDon SET MaBan WHERE MaHoaDon=?

--8.ChiTietSanPham
--SELECT MaChiTietSanPham,MaSanPham,Size,Gia FROM ChiTietSanPham
--INSERT INTO ChiTietSanPham(MaSanPham,Size,Gia) 
--VALUES(?,?,?) 
--DELETE FROM ChiTietSanPham WHERE MaChiTietSanPham=?
--UPDATE ChiTietSanPham SET MaChiTietSanPham=? WHERE MaChiTietSanPham=?

--9.ChiTietHoaDon
--SELECT MaHoaDon,MaChiTietSanPham,SoLuong,Gia FROM ChiTietHoaDon
--INSERT INTO ChiTietHoaDon(MaHoaDon,MaChiTietSanPham,SoLuong,Gia)
--VALUES(?,?,?,?)
--DELETE FROM ChiTietHoaDon WHERE MaHoaDon=?
--UPDATE ChiTietHoaDon SET MaChiTietSanPham=? WHERE MaHoaDon=?
select * from HoaDon
update HoaDon set TrangThaiOrder=0 where MaHoaDon=1002
select * from SanPham
select * from ChiTietSanPham
select * from HoaDon
select * from ChiTietHoaDon

