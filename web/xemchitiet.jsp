<%@page import="java.util.ArrayList"%>
<%@page import="Model.Cart"%>
<%@page import="Model.TaiKhoan"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    TaiKhoan user = (TaiKhoan)session.getAttribute("user");
    ArrayList<Cart> listSP = (ArrayList<Cart>)session.getAttribute("listSanPham");
    int q = 0;
    if (listSP != null) {
        q = listSP.size();
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<title>Cửa hàng điện tử</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" type="text/css" href="icon/fontawesome-free-6.1.1-web/css/all.min.css" />
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


	<form method="post" action="search">
		<div id="search">
			<input type="text" class="text" maxlength="64" name="name" />
			<input type="submit" class="submit" value="Search" />
		</div>
	</form>
        <div class="cart">
                    <a href="CartController">
			<i class="fa-solid fa-cart-shopping"></i>
                        <div class="cart-quantity"><%=q%></div>
			<div class="cart-list">
                            <% if (q == 0) {%>
                                <p class="cart-list-empty">Chưa có đơn hàng nào được thêm</p>
                                <%} else { %>
				<% for (Cart sp : listSP) {%>
                                    <div class="cart-item">
                                        <img src="images/product<%=sp.getIdProduct()%>.png" alt="" />
                                        <p><%=sp.getTen()%></p>
                                    </div>
                                <% }}%>
			</div>
                    </a>
		</div>

	<div id="headerpic"></div>

	<span style="color: green; font-size: 30px">${list}</span>
	<div id="menu">
		<!-- HINT: Set the class of any menu link below to "active" to make it appear active -->
		<ul>
			<li><a href="index.jsp">Trang chủ </a></li>
                        <li><a href="listproduct">Danh sách sản phẩm</a></li>
                        <li><a href="dienthoai">Điện thoại</a></li>
                        <li><a href="phukien">Phụ kiện </a></li>
                        <li><a href="mayanh">Máy ảnh</a></li>
                        <li><a href="laptop">Laptop</a></li>
                        <%-- <li><a href="admin.jsp">Quản lý</a></li> --%>
                        <li class="nut-dn">
                            <% if (user == null) {%>
                                <a href="dangnhap.html">Đăng nhập</a>
                                <%} else { %>
                                <div class="user">
                                    <img class="avatar" src="images/RAVpower-RP-PB18.png" alt="avata"/>
                                    <p>${user.ten}</p> 
                                </div>
                                <div class="user-thongtin">
                                  <div class="user-item user-quanli-tk">Quản lí tài khoản</div>
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
                Loại sản phẩm:${b.loai}<br>
                Màu :${b.mau}<br>
                Giá :${b.gia}<br>
                <a href="">Mua ngay</a><br>
                <a  href="addtocart?id=${b.id}">Thêm vào giỏ hàng</a>      


            </section>
		
	</div>

	<div id="footer">
			<div class="left">BTL lập trình web</div>
			<div class="right">Được làm bởi <a href="https://www.facebook.com/hung.nguyentuan.75436531">Nguyễn Tuấn Hùng</a></div>
	</div>
	
</div>

</body>
</html>
