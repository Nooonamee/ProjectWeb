<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<title>zenlike1.0 by nodethirtythree</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

<div id="upbg"></div>

<div id="outer">


	<div id="header">
		<div id="headercontent">
			<h1>Cửa Hàng Điện Tử</h1>
			<h2></h2>
		</div>
	</div>


	<form method="post" action="">
		<div id="search">
			<input type="text" class="text" maxlength="64" name="keywords" />
			<input type="submit" class="submit" value="Search" />
		</div>
	</form>


	<div id="headerpic"></div>

	<span style="color: green; font-size: 30px">${list}</span>
	<div id="menu">
		<!-- HINT: Set the class of any menu link below to "active" to make it appear active -->
		<ul>
			<li><a href="index.html">Trang chủ </a></li>
			<li><a href="listproduct" class="active">News</a></li>
			<li><a href="#">Điện thoại</a></li>
			<li><a href="#">Phụ kiện </a></li>
			<li><a href="#">Máy ảnh</a></li>
			<li><a href="#">Laptop</a></li>
                        <li><a href="dangnhap.html">Đăng nhập</a></li>
                     
		</ul>
	</div>
	<div id="menubottom"></div>

	
	<div id="content">

		<!-- Normal content: Stuff that's not going to be put in the left or right column. -->
		<div id="normalcontent">
			
			<div class="contentarea">
				<!-- Normal content area start -->
                  <style>
                .header{
                    text-align: center;
                  
                }
                .cl{
                    color: red;
                }
            </style>
            <section class="header">
                <nav >

                    

                </nav>
                
                <h1>Chi Tiết Sản Phẩm</h1>
                Mã sản phẩm: ${b.id}<br>
                Tên sản phẩm:${b.ten}<br>
                Loại sản phẩm:${b.loaisp}<br>
                Năm sản xuất:${b.namsx}<br>
                Số lượng còn:${b.slcon}<br>
                <a href="">Mua ngay</a><br>
                <a  href="addtocart?id=${b.id}">Thêm vào giỏ hàng</a>      


            </section>
       
			

				<!-- Normal content area end -->
		
	
		


		<!-- Primary content: Stuff that goes in the primary content column (by default, the left column) -->
		

		
		<!-- Secondary content: Stuff that goes in the secondary content column (by default, the narrower right column) -->
		


	</div>

	<div id="footer">
			<div class="left">&copy; 2022 Your Website Name. All rights reserved.</div>
			<div class="right">Được làm bởi <a href="https://www.facebook.com/hung.nguyentuan.75436531">Nguyễn Tuấn Hùng</a></div>
	</div>
	
</div>

</body>
</html>
