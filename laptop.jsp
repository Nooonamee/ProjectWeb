<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta charset="ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<title>Electro - HTML Ecommerce Template</title>
	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="css/slick.css"/>
	<link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css"/>
</head>
<body>
	<!-- HEADER -->
	<header>
		<!-- TOP HEADER -->
		<div id="top-header">
			<div class="container">
				<ul class="header-links pull-left">
					<li><a href="#"><i class="fa fa-phone"></i> +021-95-51-84</a></li>
					<li><a href="#"><i class="fa fa-envelope-o"></i> email@email.com</a></li>
					<li><a href="#"><i class="fa fa-map-marker"></i> Phú Túc-Phú Xuyên-Hà Nội</a></li>
				</ul>
				<ul class="header-links pull-right">
					<li><a href="#"><i class="fa fa-dollar"></i>Tiền</a></li>
					<li><a href="#"><i class="fa fa-user-o"></i> Tài khoản của bạn</a></li>
				</ul>
			</div>
		</div>
		<!-- /TOP HEADER -->

		<!-- MAIN HEADER -->
		<div id="header">
			<!-- container -->
			<div class="container">
				<!-- row -->
				<div class="row">
					<!-- LOGO -->
					<div class="col-md-3">
						<div class="header-logo">
							<a href="#" class="logo">
								<img src="./img/logo.png" alt="">
							</a>
						</div>
					</div>
					<!-- /LOGO -->

					<!-- SEARCH BAR -->
					<div class="col-md-6">
						<div class="header-search">
							<form>
								<select class="input-select">
									<option value="0">Các danh mục</option>
									<option value="1">Danh mục 01</option>
									<option value="1">Danh mục 02</option>
								</select>
								<input class="input" placeholder="Tìm kiếm ở đây">
								<button class="search-btn">Tìm kiếm</button>
							</form>
						</div>
					</div>
					<!-- /SEARCH BAR -->

					<!-- ACCOUNT -->
					<div class="col-md-3 clearfix">
						<div class="header-ctn">
							<!-- Wishlist -->
							<div>
								<a href="#">
									<i class="fa fa-heart-o"></i>
									<span>Danh sách của bạn</span>
									<div class="qty">2</div>
								</a>
							</div>
							<!-- /Wishlist -->

							<!-- Cart -->
							<div class="dropdown">
								<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
									<i class="fa fa-shopping-cart"></i>
									<span>Giỏ hàng của bạn</span>
									<div class="qty">3</div>
								</a>
								<div class="cart-dropdown">
									<div class="cart-list">
										<div class="product-widget">
											<div class="product-img">
												<img src="./img/product01.png" alt="">
											</div>
											<div class="product-body">
												<h3 class="product-name"><a href="#">Laptop Dell</a></h3>
												<h4 class="product-price"><span class="qty">1x</span>15000000</h4>
											</div>
											<button class="delete"><i class="fa fa-close"></i></button>
										</div>

										<div class="product-widget">
											<div class="product-img">
												<img src="./img/product02.png" alt="">
											</div>
											<div class="product-body">
												<h3 class="product-name"><a href="#">Tai Nghe Sony</a></h3>
												<h4 class="product-price"><span class="qty">3x</span>15000000</h4>
											</div>
											<button class="delete"><i class="fa fa-close"></i></button>
										</div>
									</div>
									<div class="cart-summary">
										<small>3 Sản phẩm được chọn</small>
										<h5>Tổng: 45000000</h5>
									</div>
									<div class="cart-btns">
										<a href="#">Xem giỏ</a>
										<a href="#">  <i class="fa fa-arrow-circle-right"></i></a>
									</div>
								</div>
							</div>
							<!-- /Cart -->

							<!-- Menu Toogle -->
							<div class="menu-toggle">
								<a href="#">
									<i class="fa fa-bars"></i>
									<span>Danh sách</span>
								</a>
							</div>
							<!-- /Menu Toogle -->
						</div>
					</div>
					<!-- /ACCOUNT -->
				</div>
				<!-- row -->
			</div>
			<!-- container -->
		</div>
		<!-- /MAIN HEADER -->
	</header>
	<!-- /HEADER -->

	<!-- NAVIGATION -->
	<nav id="navigation">
		<!-- container -->
		<div class="container">
			<!-- responsive-nav -->
			<div id="responsive-nav">
				<!-- NAV -->
				<ul class="main-nav nav navbar-nav">
					<li  ><a href="http://127.0.0.1:5500/index.html">Trang chủ</a></li>
					<li><a href="#">Giảm giá sốc</a></li>
					<li><a href="http://127.0.0.1:5500/phukien.html?#">Phụ kiện</a></li>
					<li><a href="#">Laptops</a></li>
					<li><a href="http://127.0.0.1:5500/smartphone.html">Điện thoại</a></li>
					<li><a href="http://127.0.0.1:5500/camera.html">Máy ảnh</a></li>
					
				</ul>
				<!-- /NAV -->
			</div>
			<!-- /responsive-nav -->
		</div>
		<!-- /container -->
	</nav>
       <div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- shop -->
				<div class="col-md-4 col-xs-6">
					<div class="shop">
						<div class="shop-img">
							<img src="./img/product10.png" alt="" height="239">
						</div>
						<div class="shop-body">
							<h3>Laptop<br>Lenovo</h3>
							<a href="http://127.0.0.1:5500/Lenovo.html" class="cta-btn">Mua ngay <i class="fa fa-arrow-circle-right"></i></a>
							<h4>20 triệu  <del class="product-old-price">30 triệu </del> </h4>
						</div>
					</div>
				</div>
                   <div class="col-md-4 col-xs-6">
					<div class="shop">
						<div class="shop-img">
							<img src="./img/product14.png" alt="">
						</div>
						<div class="shop-body">
							<h3>Laptop<br>Dell</h3>
							<a href="http://127.0.0.1:5500/dell.html" class="cta-btn">Mua ngay <i class="fa fa-arrow-circle-right"></i></a>
                               <h4>15 triệu  <del class="product-old-price">18 triệu </del> </h4>
						</div>
					</div>
				</div>
                   <div class="col-md-4 col-xs-6">
					<div class="shop">
						<div class="shop-img">
							<img src="./img/shop11.png" alt="">
						</div>
						<div class="shop-body">
							<h3>Laptop<br>Asus</h3>
							<a href="http://127.0.0.1:5500/asus.html" class="cta-btn">Mua ngay <i class="fa fa-arrow-circle-right"></i></a>
							<h4>20 triệu  <del class="product-old-price">28 triệu </del> </h4>
						</div>
					</div>
                   </div>
                   <div class="col-md-4 col-xs-6">
					<div class="shop">
						<div class="shop-img">
							<img src="./img/product13.png" alt="">
						</div>
						<div class="shop-body">
							<h3>MSI Laptop</h3>
							<a href="http://127.0.0.1:5500/msi.html" class="cta-btn">Mua ngay <i class="fa fa-arrow-circle-right"></i></a>\
							<h4>14 triệu  <del class="product-old-price">18 triệu </del> </h4>
						</div>
					</div>
                   </div>
                   <div class="col-md-4 col-xs-6">
					<div class="shop">
						<div class="shop-img">
							<img src="./img/product04.png" alt="" height="239">
						</div>
						<div class="shop-body">
							<h3>Máy tính bảng HT</h3>
							<a href="#" class="cta-btn">Mua ngay <i class="fa fa-arrow-circle-right"></i></a>
							<h4>10 triệu  <del class="product-old-price">15 triệu </del> </h4>
						</div>
					</div>
                   </div>
                   
               </div>
           </div>
		<footer id="footer">
			<!-- top footer -->
			<div class="section">
				<!-- container -->
				<div class="container">
					<!-- row -->
					<div class="row">
						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Về chúng tôi</h3>
								<p>Dao có mài mới sắc, người có học mới nên. Dốt đến đâu học lâu cũng biết.</p>
								<ul class="footer-links">
									<li><a href="#"><i class="fa fa-map-marker"></i>Km10, Đường Nguyễn Trãi, Q.Hà Đông, Hà Nội</a></li>
									<li><a href="#"><i class="fa fa-phone"></i>+021-95-51-84</a></li>
									<li><a href="#"><i class="fa fa-envelope-o"></i>email@email.com</a></li>
								</ul>
							</div>
						</div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Thể loại</h3>
								<ul class="footer-links">
									<li><a href="#">Giảm giá sốc</a></li>
									<li><a href="#">Laptops</a></li>
									<li><a href="#">Điện thoại</a></li>
									<li><a href="#">Máy ảnh</a></li>
									<li><a href="#">Phụ kiện</a></li>
								</ul>
							</div>
						</div>

						<div class="clearfix visible-xs"></div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Thông tin</h3>
								<ul class="footer-links">
									<li><a href="#">Về chúng tôi</a></li>
									<li><a href="#">Liên hệ chúng tôi</a></li>
									<li><a href="#">Chính sách bảo mật</a></li>
									<li><a href="#">Đặt hàng và trả hàng</a></li>
									<li><a href="#">Điều khoản và điều lệ</a></li>
								</ul>
							</div>
						</div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Dịch vụ</h3>
								<ul class="footer-links">
									<li><a href="#">Tài khoản của bạn</a></li>
									<li><a href="#">Giỏ hàng của bạn</a></li>
									<li><a href="#">Danh sách của bạn</a></li>
									<li><a href="#">Theo dõi đơn hàng</a></li>
									<li><a href="#">Hỗ trợ</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /row -->
				</div>
				<!-- /container -->
			</div>
			<!-- /top footer -->

			<!-- bottom footer -->
			<div id="bottom-footer" class="section">
				<div class="container">
					<!-- row -->
					<div class="row">
						<div class="col-md-12 text-center">
							<ul class="footer-payments">
								<li><a href="#"><i class="fa fa-cc-visa"></i></a></li>
								<li><a href="#"><i class="fa fa-credit-card"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-paypal"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-mastercard"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-discover"></i></a></li>
								<li><a href="#"><i class="fa fa-cc-amex"></i></a></li>
							</ul>
						</div>
					</div>
						<!-- /row -->
				</div>
				<!-- /container -->
			</div>
			<!-- /bottom footer -->
		</footer>
        
</body>
</html>