<%@page import="Model.sanPham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Cart"%>
<%@page import="Model.TaiKhoan"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    TaiKhoan user = (TaiKhoan)session.getAttribute("user");
    ArrayList<Cart> listSP = (ArrayList<Cart>)session.getAttribute("listSanPham");
    ArrayList<sanPham> listSPLap = (ArrayList<sanPham>)request.getAttribute("listSPLap");
    int q = 0;
    if (listSP != null) {
        q = listSP.size();
    }
%>
<!DOCTYPE HTML>
<html>
<head>
	<title>Cửa hàng điện tử</title>
	<meta name="keywords" content="" />
	<meta name="description" content=""/>
	<link rel="stylesheet" type="text/css" href="style.css"/>
	<link rel="stylesheet" href="icon/fontawesome-free-6.1.1-web/css/all.min.css">
</head>

<body>
	<div id="upbg"></div>
	<div id="outer">
		<div id="header">
			<div id="headercontent">
				<h1>Cửa Hàng Điện Tử</h1>
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
                                        <img src="images/product<%=sp.getIdProduct()%>.png"/>
                                        <p><%=sp.getTen()%></p>
                                    </div>
                                <% }}%>
			</div>
                    </a>
		</div>

		<div id="headerpic"></div>

		<div id="menu">
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
			<div id="normalcontent">
				<h2>Những sản phẩm bán chạy</h2>
			</div>

			<div class="divider1"></div>
                        
                        <div id="primarycontainer">
                            <div id="primarycontent">
                                <% for (sanPham sp : listSPLap) {%>
                                <div class="post">
                                    <h4>Laptop <%=sp.getTen()%></h4>
                                    <div class="contentarea">
                                        <div class="details">Được đăng bởi<a href="#"> Tiến Chức</a> 12/06/2022</div>
                                        <a href="xemchitiet?txtiD=<%=sp.getId()%>"><img src="images/product<%=sp.getId()%>.png" class="left" alt="anh sp" /></a>

                                        <ul class="controls">
                                                <li><a href="#" class="printerfriendly">Bạn bè</a></li>
                                                <li><a href="#" class="comments">Bình luận (18)</a></li>
                                                <li><a href="#" class="more">Đọc Thêm</a></li>
                                        </ul>
                                    </div>
                                </div>

                                    <div class="divider2"></div>
                                <%}%>
                            </div>
                        </div>

			<div id="secondarycontent">
				<div>
					<h4>Các loại sản phẩm</h4>
					<div class="contentarea">
						<ul class="linklist">
							<li><a href="dienthoai">Điện Thoại</a></li>
							<li><a href="mayanh">Máy ảnh</a></li>
							<li><a href="phukien">Phụ kiện</a></li>
							<li><a href="laptop">Laptop</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div id="footer">
			<div class="left">BTL lập trình web</div>
			<div class="right">
				Được làm bởi 
				<a href="">Nhóm 7</a>
			</div>
		</div>

	</div>

</body>
</html>
