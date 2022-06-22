<%@page import="Model.Cart"%>
<%@page import="java.util.ArrayList"%>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
        <link rel="stylesheet" type="text/css" href="icon/fontawesome-free-6.1.1-web/css/all.min.css"/>
        <title>Giỏ hàng</title>
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
                                        <img src="images/product<%=sp.getId()%>.png" alt="" />
                                        <p><%=sp.getId()%></p>
                                    </div>
                                <% }}%>
			</div>
                    </a>
		</div>

	<div id="headerpic"></div>

	
	<div id="menu">
		<!-- HINT: Set the class of any menu link below to "active" to make it appear active -->
		<ul>
			<li><a href="index.jsp">Trang chủ </a></li>
			<li><a href="listproduct">Danh sách sản phẩm</a></li>
			<li><a href="#">Điện thoại</a></li>
			<li><a href="#">Phụ kiện </a></li>
			<li><a href="#">Máy ảnh</a></li>
			<li><a href="#">Laptop</a></li>
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

                .tv{

                    height: 70px;
                    text-align: center;
                }
                .h2{
                    text-align: center; 
                }
                .table th,.table td{
                    border: 0px solid #ddd;
                    text-align: center;
                    padding: 12px 12px;
                }
                form{
                    text-align: center;             
                }
                table{
                    width: 100%;


                    color: #898989;
                    border-collapse: collapse;
                    box-sizing: border-box;             
                }
                .table th{
                    background-color: #7F8400;
                    color: #F6F6F6;
                }
                .table tbody tr:nth-child(even){
                    background-color: #ddd;
                }
                .tb{
                    margin: 0 auto;
                    width: 90%;
                }
                .xoa{
                    color: red;
                }
                .sua{
                    color: #0062cc;
                }
                .anhminhhoa{
                    height: 60px;
                }
            </style>



            <div class="tb">
                <table class="table" boder="1">
                    <thead>
                        <tr>
                            <th>Ảnh minh họa</th>
                            <th>Tên sản phẩm</th>
                            <th>Số lượng</th>
                            <th>Ngày thêm</th>
                            <th>Xóa sản phầm</th>
                            
                           
                        </tr>
                    </thead>
                    <tbody>
                        <% if (q>0) for (Cart sp : listSP) {%>
                            <tr>
                                <td><img class="anhminhhoa" src="images/product<%=sp.getIdProduct()%>.png" alt="alt"/></td>
                                <td><%=sp.getTen()%></td>
                                <td><%=sp.getId()%></td>
                                <td><%=sp.getCreateDate()%></td> 
                                     
                                <td><a href="DeleteCartController?txtiD=<%=sp.getId()%>">Xóa sản phẩm</a></td>
                            </tr>
                        <%}%>
                    </tbody>
                    
                </table>
	</div>

	<div id="footer">
			<div class="left">BTL lập trình web</div>
			<div class="right">Được làm bởi <a href="https://www.facebook.com/hung.nguyentuan.75436531">Nguyễn Tuấn Hùng</a></div>
	</div>
	
</div>
    </body>
</html>
