
-- Tạo Datebase DBWeb
	DROP DATABASE IF EXISTS DBWeb;
	CREATE DATABASE DBWeb;
	GO
	USE DBWeb
	GO

-- Tạo các table
	-- Product
	DROP TABLE IF EXISTS Product
	CREATE TABLE Product
	(
		id int identity(1,0001) not null primary key,
		name nvarchar(30) not null,
		description nvarchar(200) not null,
		type varchar(20) not null,
		color nvarchar(20) not null,
		price int not null,
		quantity int not null,
		sold int not null
	)
	GO

	-- User
	DROP TABLE IF EXISTS UserWeb
	CREATE TABLE UserWeb
	(
		id int identity(1,0001) primary key,
		name nvarchar(30) not null,
		user_name varchar(30) not null,
		password varchar(30) not null,
		phoneNumber varchar(11) not null,
		address nvarchar(30) not null,
		type varchar(30) not null
	)
	GO

	-- Cart
	DROP TABLE IF EXISTS Cart
	CREATE TABLE Cart
	(
		id_user int not null references UserWeb(id),
		id_pro int not null references Product(id),
		quantity int
	)
	GO

-- Insert dữ liệu
	-- Product
	INSERT INTO Product values (N'Lenovo',N'Gaming','laptop',N'trắng',20000000,100,30)
	INSERT INTO Product values (N'Dell',N'Gaming','laptop',N'bạc',15000000,70,20)
	
	INSERT INTO Product values (N'Asus',N'Vivobook','laptop',N'đen',20000000,80,15)
	INSERT INTO Product values (N'MSI',N'Gaming','laptop',N'Đỏ',14000000,60,20)
	INSERT INTO Product values (N'HT',N'model','maytinhbang',N'đen',14000000,60,20)
	INSERT INTO Product values (N'MSI',N'Gaming','laptop',N'Đỏ',14000000,60,20)
	INSERT INTO Product values (N'Iphone 12 pro max',N'model','dienthoai',N'đen',20000000,50,20)
	INSERT INTO Product values (N'SamsungA50',N'model','dienthoai',N'Đen',10000000,60,30)
	INSERT INTO Product values (N'Iphone13 pro max',N'model','dienthoai',N'Xanh',25000000,60,20)
	INSERT INTO Product values (N'Xiaomi',N'model','dienthoai',N'Tím',5000000,70,10)
	INSERT INTO Product values (N'Nokia 1280',N'đen trắng','dienthoai',N'Xanh',1000000000,65,25)
	INSERT INTO Product values (N'Huawei',N'model','dienthoai',N'Xanh',6000000,75,35)
	INSERT INTO Product values (N'Samsung',N'model','maytinhbang',N'Đen',6000000,60,20)
	INSERT INTO Product values (N'JBL',N'model','Tai nghe',N'đen',400000,150,30)
	INSERT INTO Product values (N'Sony',N'model','Tai nghe',N'bạc',500000,120,40)
	INSERT INTO Product values (N'Sony',N'model','Tai nghe',N'đen',500000,140,30)
	INSERT INTO Product values (N'sạc dự phòng iphone',N'model','Sạc',N'đen',200000,110,30)
	INSERT INTO Product values (N'Airpod',N'model','Tai nghe không dây',N'trắng',5000000,120,30)
	INSERT INTO Product values (N'Chuột MSI',N'model','Chuột',N'đen',500000,150,30)
	INSERT INTO Product values (N'Máy ảnh Rekam',N'model','may anh',N'Trắng',1500000,40,30)
	INSERT INTO Product values (N'Máy ảnh Sony',N'model','may anh',N'Đen',2000000,60,30)
	INSERT INTO Product values (N'Máy ảnh Canon',N'model','may anh',N'Đen',1500000,40,30)



	-- Cart

	-- User
	INSERT INTO UserWeb values (N'Đỗ Như Đức','admin','admin','0986172791',N'Hà Nội','admin')
	INSERT INTO UserWeb values (N'Đỗ Như Đức','ducdonhu','123456','0986172791',N'Hà Nội','customer')
