<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags must come first in the head -->

    <!-- Title  -->
    <title>Fur Real Pet Supplies - Cart</title>

    <!-- Tab Icon  -->
    <link rel="icon" href="img/core-img/iconlight.png">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <!-- Search Start -->
    <div class="search-section section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
                            <button type="submit"><img src="img/core-img/searchicon.png" alt="error"></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav -->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="navbar-brand">
                <a href="index.jsp"><img src="img/core-img/logolight.png" alt="error"></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>

        <!-- Header Area Start -->
        <header class="header-area clearfix">

            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>

            <!-- Logo -->
            <div class="logo">
                <a href="index.jsp"><img src="img/core-img/logolight.png" alt="error"></a>
            </div>

            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="#" class="search-nav"><img src="img/core-img/searchicon.png" alt="error">Search</a>
                <a href="registration.jsp"><img src="img/core-img/loginicon.png" alt="error">Log In</a>
                <a href="registration.jsp"><img src="img/core-img/createicon.png" alt="error">Register Now</a>
                <a href="#"><img src="img/core-img/inventoryicon.png" alt="error">Inventory</a>
                <a href="cart.jsp"><img src="img/core-img/carticon.png" alt="error">Cart<span>(0)</span></a>
            </div>

            <!-- Main Nav -->
            <nav class="main-nav">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="shop.jsp">Shop</a></li>
                    <li><a href="product-details.jsp">Product</a></li>
                    <li class="active"><a href="cart.jsp">Cart</a></li>
                    <li><a href="checkout.jsp">Checkout</a></li>
                </ul>
            </nav>

            <br><br><br><br><br>

            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="https://twitter.com/suppliesfurreal" target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
            </div>
        </header>
        <!-- Header Area End -->

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="cart-title mt-50">
                            <h2>Shopping Cart</h2>
                        </div>

                        <div class="cart-table clearfix">
                            <table class="table table-responsive">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>Name</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="cart_product_img">
                                            <a href="#"><img src="img/bg-img/cart1.jpg" alt="Product"></a>
                                        </td>
                                        <td class="cart_product_desc">
                                            <h5>Large Steel Cage</h5>
                                        </td>
                                        <td class="price">
                                            <span>₱720.00</span>
                                        </td>
                                        <td class="qty">
                                            <div class="qty-btn d-flex">
                                                <p>Qty</p>
                                                <div class="quantity">
                                                    <span class="qty-minus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                    <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="quantity" value="1">
                                                    <span class="qty-plus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="cart_product_img">
                                            <a href="#"><img src="img/bg-img/cart2.jpg" alt="Product"></a>
                                        </td>
                                        <td class="cart_product_desc">
                                            <h5>Steel Dog Plate</h5>
                                        </td>
                                        <td class="price">
                                            <span>₱500.00</span>
                                        </td>
                                        <td class="qty">
                                            <div class="qty-btn d-flex">
                                                <p>Qty</p>
                                                <div class="quantity">
                                                    <span class="qty-minus" onclick="var effect = document.getElementById('qty2'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                    <input type="number" class="qty-text" id="qty2" step="1" min="1" max="300" name="quantity" value="1">
                                                    <span class="qty-plus" onclick="var effect = document.getElementById('qty2'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="cart_product_img">
                                            <a href="#"><img src="img/bg-img/cart3.jpg" alt="Product"></a>
                                        </td>
                                        <td class="cart_product_desc">
                                            <h5>Steel Dog Chain</h5>
                                        </td>
                                        <td class="price">
                                            <span>₱500.00</span>
                                        </td>
                                        <td class="qty">
                                            <div class="qty-btn d-flex">
                                                <p>Qty</p>
                                                <div class="quantity">
                                                    <span class="qty-minus" onclick="var effect = document.getElementById('qty3'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                    <input type="number" class="qty-text" id="qty3" step="1" min="1" max="300" name="quantity" value="1">
                                                    <span class="qty-plus" onclick="var effect = document.getElementById('qty3'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-12 col-lg-4">
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">
                                <li><span>Subtotal:</span> <span>₱1720.00</span></li>
                                <li><span>Delivery:</span> <span>₱32.00</span></li>
                                <li><span>Total:</span> <span>₱1752.00</span></li>
                            </ul>
                            <div class="cart-btn mt-100">
                                <a href="cart.html" class="btn amado-btn w-100">Checkout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer_area clearfix">
        <div class="container">
            <div class="row align-items-center">
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-4">
                    <div class="single_widget_area">
                        <!-- Logo -->
                        <div class="footer-logo mr-50">
                            <a href="index.jsp"><img src="img/core-img/logodark.png" alt="error"></a>
                        </div>
                        <!-- Text -->
                        <p class="footerdescription">"Animals are such agreeable friends - they ask no questions; they pass no criticisms." - George Eliot
                            <br>
                            <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b></p>
                    </div>
                </div>
                
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-8">
                    <div class="single_widget_area">
                        <!-- Footer Menu -->
                        <div class="footer_menu">
                            <nav class="navbar navbar-expand-lg justify-content-end">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                <div class="collapse navbar-collapse" id="footerNavContent">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item">
                                            <a class="nav-link" href="index.jsp">Home</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="shop.jsp">Shop</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="product-details.jsp">Product</a>
                                        </li>
                                        <li class="nav-item active">
                                            <a class="nav-link" href="cart.jsp">Cart</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="checkout.jsp">Checkout</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jQuery v3.7.1.min.js"></script>

    <!-- Popper js -->
    <script src="js/popper.min.js"></script>

    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    
    <!-- Active js -->
    <script src="js/active.js"></script>

</body>

</html>
