<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>JSP Page</title>
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


	<form method="post" action="search">
		<div id="search">
			<input type="text" class="text" maxlength="64" name="name" />
			<input type="submit" class="submit" value="Search" />
		</div>
	</form>


	<div id="headerpic"></div>

	
	<div id="menu">
		<!-- HINT: Set the class of any menu link below to "active" to make it appear active -->
		<ul>
			<li><a href="admin.jsp">Trang chủ </a></li>
			<li><a href="quanlisanpham" class="active">Quản lý sản phẩm</a></li>
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
                .sign_up-1{
                    text-align: center;
                }
            </style>																						                                     		
                                                                
                  <section class="sub3-header">
        <div class="sign_up-1">
            
            <h1> Thêm sản phẩm</h1>
        <form action="addProduct" method="post">
            <label >Mã sản phẩm:</label> <input  class="input_box-1"    type="text" name="id" >  <br>            
            
            <label>Tên sản phẩm:</label> <input type="text" class="input_box-1"  name="ten"> <br>
            <label >Loại sản phẩm:</label> <input class="input_box-1"  type="text" name="loaisp"><br>
            <label >Năm sản xuất:</label> <input class="input_box-1"  type="text" name="namsx"><br>
            <label >Số lượng còn:</label> <input class="input_box-1"   type="text" name="slcon"><br>
          
           
            <input  type="submit" value="Thêm sản phẩm">
            
            
            
        </form>
              </div>
       
			

				<!-- Normal content area end -->
		
	
		


		<!-- Primary content: Stuff that goes in the primary content column (by default, the left column) -->
		

		
		<!-- Secondary content: Stuff that goes in the secondary content column (by default, the narrower right column) -->
		


	</div>

	<div id="footer">
			<div class="left">BTL lập trình web</div>
			<div class="right">Được làm bởi <a href="https://www.facebook.com/hung.nguyentuan.75436531">Nguyễn Tuấn Hùng</a></div>
	</div>
	
</div>
    </body>
</html>
