CREATE DATABASE [dienthoai]
go
USE [dienthoai]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 6/14/2022 9:29:04 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[id] [nvarchar](50) NULL,
	[ten] [nvarchar](50) NULL,
	[loaisp] [nvarchar](50) NULL,
	[namsx] [nvarchar](50) NULL,
	[slcon] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 6/14/2022 9:29:04 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[hoten] [nvarchar](50) NULL,
	[tendn] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[matkhau] [nvarchar](50) NULL,
	[nlmk] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB0021', N'Iphone 13', N'điện thoại', N'2021', 97)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB0012', N'Xiaomi pro', N'điện thoại', N'2019', 14)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB1092', N'Vsmart', N'điện thoại', N'2016', 26)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB1129', N'Cannon LG', N'máy ảnh', N'2018', 2)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB0023', N'OPPO', N'điện thoại', N'2018', 13)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB0024', N'HP-Z123', N'laptop', N'2014', 4)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB0025', N'DELL-C16', N'laptop', N'2017', 7)
INSERT [dbo].[Product] ([id], [ten], [loaisp], [namsx], [slcon]) VALUES (N'TB0026', N'NP-012', N'tai nghe', N'2014', 5)
GO
INSERT [dbo].[TaiKhoan] ([hoten], [tendn], [email], [matkhau], [nlmk]) VALUES (N'1', N'1', N'1', N'1', N'1')
INSERT [dbo].[TaiKhoan] ([hoten], [tendn], [email], [matkhau], [nlmk]) VALUES (N'hung', N'hung1', N'daotai2309@gmail.com', N'123', N'123')
INSERT [dbo].[TaiKhoan] ([hoten], [tendn], [email], [matkhau], [nlmk]) VALUES (N'2', N'2', N'2', N'2', N'2')
INSERT [dbo].[TaiKhoan] ([hoten], [tendn], [email], [matkhau], [nlmk]) VALUES (N'nhupham', N'nhu', N'nhu@gmail.com', N'123', N'123')
GO
