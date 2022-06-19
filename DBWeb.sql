﻿
-- Tạo Datebase DBWeb
	DROP DATABASE IF EXISTS DBWeb;
	CREATE DATABASE DBWeb;
	GO
	USE DBWeb
	GO

-- Tạo các table
	-- Product
	DROP TABLE IF EXISTS sanPham
	CREATE TABLE sanPham
	(
		id int identity(1,0001) not null primary key,
		ten nvarchar(30) not null,
		moTa nvarchar(200) not null,
		loai varchar(20) not null,
		mau nvarchar(20) not null,
		gia int not null,
		soLuong int not null,
		daBan int not null
	)
	GO

	-- User
	DROP TABLE IF EXISTS taiKhoan
	CREATE TABLE taiKhoan
	(
		id int identity(1,0001) primary key,
		ten nvarchar(30) not null,
		user_name varchar(30) not null,
		password varchar(30) not null,
		soDienThoai varchar(11) not null,
		diaChi nvarchar(30) not null,
		loai varchar(30) not null
	)
	GO

	-- Cart
	DROP TABLE IF EXISTS gioHang
	CREATE TABLE gioHang
	(
		id_user int not null references taiKhoan(id),
		id_pro int not null references sanPham(id),
		soLuong int
	)
	GO

-- Insert dữ liệu
	-- Product
	INSERT INTO sanPham values (N'Lenovo',N'Gaming','laptop',N'trắng',20000000,100,30)
	INSERT INTO sanPham values (N'Dell',N'Gaming','laptop',N'bạc',15000000,70,20)
	
	INSERT INTO sanPham values (N'Asus',N'Vivobook',N'laptop',N'đen',20000000,80,15)
	INSERT INTO sanPham values (N'MSI',N'Gaming',N'laptop',N'Đỏ',14000000,60,20)
	INSERT INTO sanPham values (N'HT',N'model',N'maytinhbang',N'đen',14000000,60,20)
	INSERT INTO sanPham values (N'MSI',N'Gaming',N'laptop',N'Đỏ',14000000,60,20)
	INSERT INTO sanPham values (N'Iphone 12 pro max',N'model','dienthoai',N'đen',20000000,50,20)
	INSERT INTO sanPham values (N'SamsungA50',N'model',N'dienthoai',N'Đen',10000000,60,30)
	INSERT INTO sanPham values (N'Iphone13 pro max',N'model',N'dienthoai',N'Xanh',25000000,60,20)
	INSERT INTO sanPham values (N'Xiaomi',N'model',N'dienthoai',N'Tím',5000000,70,10)
	INSERT INTO sanPham values (N'Nokia 1280',N'đen trắng','dienthoai',N'Xanh',1000000000,65,25)
	INSERT INTO sanPham values (N'Huawei',N'model',N'dienthoai',N'Xanh',6000000,75,35)
	INSERT INTO sanPham values (N'Samsung',N'model',N'maytinhbang',N'Đen',6000000,60,20)
	INSERT INTO sanPham values (N'JBL',N'model',N'Tai nghe',N'đen',400000,150,30)
	INSERT INTO sanPham values (N'Sony',N'model',N'Tai nghe',N'bạc',500000,120,40)
	INSERT INTO sanPham values (N'Sony',N'model',N'Tai nghe',N'đen',500000,140,30)
	INSERT INTO sanPham values (N'sạc dự phòng iphone',N'model',N'Sạc',N'đen',200000,110,30)
	INSERT INTO sanPham values (N'Airpod',N'model',N'Tai nghe không dây',N'trắng',5000000,120,30)
	INSERT INTO sanPham values (N'Chuột MSI',N'model',N'Chuột',N'đen',500000,150,30)
	INSERT INTO sanPham values (N'Máy ảnh Rekam',N'model','may anh',N'Trắng',1500000,40,30)
	INSERT INTO sanPham values (N'Máy ảnh Sony',N'model','may anh',N'Đen',2000000,60,30)
	INSERT INTO sanPham values (N'Máy ảnh Canon',N'model','may anh',N'Đen',1500000,40,30)



	-- Cart

	-- User
	INSERT INTO taiKhoan values (N'Đỗ Như Đức','admin','admin','0986172791',N'Hà Nội','admin')
	INSERT INTO taiKhoan values (N'Đỗ Như Đức','ducdonhu','123456','0986172791',N'Hà Nội','customer')
