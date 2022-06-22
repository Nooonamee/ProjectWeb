<%@page import="java.util.ArrayList"%>
<%@page import="Model.Cart"%>
<%@page import="Model.TaiKhoan"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    TaiKhoan user = (TaiKhoan) session.getAttribute("user");
    ArrayList<Cart> listSP = (ArrayList<Cart>) session.getAttribute("listSanPham");
    int q = 0;
    if (listSP != null) {
        q = listSP.size();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>Thêm sản phẩm</title>
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
			<li><a href="quanlisanpham">Quản lý sản phẩm</a></li>
			<li class="nut-dn">
                        <% if (user == null) {%>
                        <a href="dangnhap.html">Đăng nhập</a>
                        <%} else { %>
                        <div class="user">
                            <img class="avatar" src="images/RAVpower-RP-PB18.png" alt="avata"/>
                            <p>${user.ten}</p> 
                        </div>
                        <div class="user-thongtin">
                            <div class="user-item user-quanli-tk"><a href="dondamua">Quản lí tài khoản</a></div>
                            <div class="user-item user-dangxuat"><a href="dangxuat">Đăng xuất</a></div>
                        </div>
                        <% }%>
                    </li>
                     
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
            <label>Tên sản phẩm   :</label> <input type="text" class="input_box-1"  name="ten"> <br>
            <label >Loại sản phẩm :</label> <input class="input_box-1"  type="text" name="loaisp"><br>
            <label >Năm sản xuất  :</label> <input class="input_box-1"  type="text" name="namsx"><br>
            <label >Giá sản phẩm  :</label> <input class="input_box-1"   type="text" name="slcon"><br>
            <label >Số lượng sp     :</label> <input  class="input_box-1"    type="text" name="id" >  <br>  
          
           
            <input  type="submit" value="Thêm sản phẩm">
            
            
            
        </form>
              </div>
		


	</div>

	<div id="footer">
			<div class="left">BTL lập trình web</div>
			<div class="right">Được làm bởi nhóm 7</div>
	</div>
	
</div>
    </body>
</html>
