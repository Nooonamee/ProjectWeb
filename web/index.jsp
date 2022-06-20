<%-- 
    Document   : index.jsp
    Created on : 15 Jun 2022, 22:52:20
    Author     : Dell
--%>

<%@page import="Model.TaiKhoan"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    TaiKhoan user = (TaiKhoan) session.getAttribute("user");
    int q = 0;
    if (user != null) {
        q = 2;
        if (user.getLoai().equals("admin")) {
%>        
<c:redirect url="http://localhost:8080/BTLWeb/admin.jsp"/>
<%
        }
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

            <form method="post" action="">
                <div id="search">
                    <input type="text" class="text" maxlength="64" name="keywords"/>
                    <input type="submit" class="submit" value="Tìm Kiếm"/>
                </div>
            </form>

            <div class="cart">
                <a href="CartController">
                    <i class="fa-solid fa-cart-shopping"></i>
                    <div class="cart-quantity"><%=q%></div>
                    <div class="cart-list">
                        <% if (user == null) {%>
                        <p class="cart-list-empty">Chưa có đơn hàng nào được thêm</p>
                        <%} else { %>
                        <div class="cart-item">
                            <img src="images/201406051522109725_Nokia 1280.png" alt="" />
                            <p>Nokia 1280</p>
                        </div>

                        <div class="cart-item">
                            <img src="images/600_xiaomi-mi-note-10-xtmobile.png" alt="" />
                            <p>Xiaomi note 10</p>
                        </div>
                        <% }%>
                    </div>
                </a>
            </div>

            <div id="headerpic"></div>

            <div id="menu">
                <ul>
                    <li><a href="index.jsp">Trang chủ </a></li>
                    <li><a href="listproduct">Danh sách sản phẩm</a></li>
                    <li><a href="dienthoai.html">Điện thoại</a></li>
                    <li><a href="phukien.html">Phụ kiện </a></li>
                    <li><a href="mayanh.html">Máy ảnh</a></li>
                    <li><a href="laptop.html">Laptop</a></li>
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
                        <div class="post">
                            <h4>Nokia 1280</h4>

                            <div class="contentarea">
                                <div class="details">Được đăng bởi<a href="#"> Tuấn Hùng</a> 12/06/2022</div>
                                <img src="images/201406051522109725_Nokia 1280.png" class="left"
                                     alt="A chinese lion statue" />

                                <ul class="controls">
                                    <li><a href="#" class="printerfriendly">Bạn bè</a></li>
                                    <li><a href="#" class="comments">Comments (18)</a></li>
                                    <li><a href="#" class="more">Đọc Thêm</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="divider2"></div>

                        <div class="post">
                            <h2>Máy ảnh canon</h2>
                            <div class="contentarea">
                                <div class="details">Được đăng bởi <a href="#">Tuấn Hùng</a> 12/06/2022</div>
                                <img src="images/TB1129.png" class="left" />

                                <ul class="controls">
                                    <li><a href="#" class="friendly">Bạn bè</a></li>
                                    <li><a href="#" class="comments">Bình luận (18)</a></li>
                                    <li><a href="#" class="more">Đọc Thêm</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="divider2"></div>

                        <div class="post">
                            <h4>LapTop Asus</h4>
                            <div class="contentarea">
                                <div class="details">Đăng bởi <a href="#">Tuấn Hùng</a> 12/06/2022</div>
                                <img src="images/product08.png" class="left" />
                                <ul class="controls">
                                    <li><a href="#" class="friendly">Bạn bè</a></li>
                                    <li><a href="#" class="comments"> Bình luận(18)</a></li>
                                    <li><a href="#" class="more">Đọc Thêm</a></li>
                                </ul>
                            </div>
                        </div>

                    </div>
                </div>

                <div id="secondarycontent">
                    <div>
                        <h4>Các loại sản phẩm</h4>
                        <div class="contentarea">
                            <ul class="linklist">
                                <li><a href="dienthoai.html">Điện Thoại</a></li>
                                <li><a href="mayanh.html">Máy ảnh</a></li>
                                <li><a href="phukien.html">Phụ kiện</a></li>
                                <li><a href="laptop.html">Laptop</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

            <div id="footer">
                <div class="left">&copy; 2006 Your Website Name. All rights reserved.</div>
                <div class="right">
                    Được làm bởi 
                    <a href="https://www.facebook.com/hung.nguyentuan.75436531">Nguyễn Tuấn Hùng</a>
                </div>
            </div>

        </div>

    </body>
</html>
