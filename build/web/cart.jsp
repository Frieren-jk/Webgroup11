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
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="./style.css">
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
        <div class="main-content-wrapper d-flex clearfix" >

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="${pageContext.request.contextPath}/home"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>
                <!-- Navbar Toggler -->
                <div class="navbar-toggler">
                    <span></span><span></span><span></span>
                </div>
            </div>

            <!-- Topbar Start -->
                <div class="container-fluid">
                    <div class="row upbar">
                        <div class="col-lg-6 d-none d-lg-block">
                            <div class="d-inline-flex align-items-center">
                                <a class="text-light"><i class="fa-solid fa-phone"></i> Call Us: 0960-542-2186</a>
                                <span class="text-light px-2">|</span>
                                <a class="text-light"><i class="fa-solid fa-envelope"></i> Our Email: furrealpetsupplies@gmail.com</a>
                                <span class="text-light px-2">|</span>
                                <a style="color: #FBFF4B;" href="${pageContext.request.contextPath}/physicalshop">Visit our physical shop. <i class="fa-solid fa-location-dot"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            <!-- Topbar End -->

            <!-- Header Area Start -->
            <header class="header-area clearfix ">

                <!-- Close Icon -->
                <div class="nav-close">
                    <i class="fa fa-close" aria-hidden="true"></i>
                </div>

                <!-- Logo -->
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/home"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Main Nav -->
                <div class="sticky-top pt-1">
                    <div class="cart-fav-search mb-100 mt-5 ">
                        <a href="#" class="fav-nav"><img src="img/core-img/usericon.png" alt="error">${userNamelog}</a>
                        <a href="#" class="fav-nav"><img src="img/core-img/changepassicon.png" alt="error">Change Pass</a>
                        <a href="${pageContext.request.contextPath}/logout" class="fav-nav"><img src="img/core-img/logouticon.png" alt="error">Log Out</a>
                        <br><br><br>
                        <a href="#" class="search-nav"><img src="img/core-img/searchicon.png" alt="error">Search</a>
                        <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="img/core-img/createicon.png" alt="error">Register Now</a>
                        <a href="${pageContext.request.contextPath}/inventory/users" class="fav-nav"><img src="img/core-img/inventoryicon.png" href="${pageContext.request.contextPath}/inventory/users" alt="error">Inventory</a>
                        <a href="${pageContext.request.contextPath}/home" class="fav-nav"><img src="img/core-img/homeicon.png" alt="error">Home</a>
                        <a href="${pageContext.request.contextPath}/cages" class="fav-nav"><img src="img/core-img/shopicon.png" alt="error">Shop</a>
                        <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="img/core-img/carticon.png" alt="error">Cart<span>(3)</span></a>
                    </div>
                    <br><br><br><br><br>

                    <!-- Social Button -->
                    <div class="social-info d-flex justify-content-between">
                        <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa-brands fa-facebook" aria-hidden="true"></i></a>
                        <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa-brands fa-instagram" aria-hidden="true"></i></a>
                        <a href="https://x.com/suppliesfurreal" target="_blank"><i class="fa-brands fa-x-twitter" aria-hidden="true"></i></a>
                        <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa-brands fa-pinterest" aria-hidden="true"></i></a>        
                    </div>
                </div>
            </header>
            <!-- Header Area End -->

            <div class="cart-table-area section-padding-100">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12 col-lg-8">
                            <div class="cart-title mt-50">
                                <h2>SHOPPING CART</h2>
                            </div>
                            <div class="cart-wrapper">
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
                                                <a href="#"><img src="img/bg-img/cart/cage 1 cart.png" alt="Product"></a>
                                            </td>
                                            <td class="cart_product_desc">
                                                <h5>Foldable Steel Cage</h5>
                                            </td>
                                            <td class="price">
                                                <span>PHP 1720.00</span>
                                            </td>
                                            <td class="qty">
                                                <div class="qty-btn d-flex">
                                                    <p>Qty</p>
                                                    <div class="quantity">
                                                        <span class="qty-minus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if (!isNaN(qty) && qty > 1)
                                                                    effect.value--;
                                                                return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                        <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="quantity" value="1">
                                                        <span class="qty-plus" onclick="var effect = document.getElementById('qty');
                                                                var qty = effect.value;
                                                                if (!isNaN(qty))
                                                                    effect.value++; return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="cart_product_img">
                                                <a href="#"><img src="img/bg-img/cart/cage 2 cart.png" alt="Product"></a>
                                            </td>
                                            <td class="cart_product_desc">
                                                <h5>Cat Carrier Bag</h5>
                                            </td>
                                            <td class="price">
                                                <span>PHP 1100.00</span>
                                            </td>
                                            <td class="qty">
                                                <div class="qty-btn d-flex">
                                                    <p>Qty</p>
                                                    <div class="quantity">
                                                        <span class="qty-minus" onclick="var effect = document.getElementById('qty2');
                                                                var qty = effect.value;
                                                                if (!isNaN(qty) && qty > 1)
                                                                    effect.value--;
                                                                return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                        <input type="number" class="qty-text" id="qty2" step="1" min="1" max="300" name="quantity" value="1">
                                                        <span class="qty-plus" onclick="var effect = document.getElementById('qty2');
                                                                var qty = effect.value;
                                                                if (!isNaN(qty))
                                                                    effect.value++;
                                                                return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="cart_product_img">
                                                <a href="#"><img src="img/bg-img/cart/cage 3 cart.png" alt="Product"></a>
                                            </td>
                                            <td class="cart_product_desc">
                                                <h5>Small Plastic Cage</h5>
                                            </td>
                                            <td class="price">
                                                <span>PHP 960.00</span>
                                            </td>
                                            <td class="qty">
                                                <div class="qty-btn d-flex">
                                                    <p>Qty</p>
                                                    <div class="quantity">
                                                        <span class="qty-minus" onclick="var effect = document.getElementById('qty3'); var qty = effect.value;
                                                                if (!isNaN(qty) && qty > 1)
                                                                    effect.value--;
                                                                return false;"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                        <input type="number" class="qty-text" id="qty3" step="1" min="1" max="300" name="quantity" value="1">
                                                        <span class="qty-plus" onclick="var effect = document.getElementById('qty3');
                                                                var qty = effect.value;
                                                                if (!isNaN(qty))
                                                                    effect.value++; return false;"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-4">
                            <div class="cart-summary">
                                <h5>CART TOTAL</h5>
                                <ul class="summary-table">
                                    <li><span>Subtotal:</span> <span>3780.00</span></li>
                                    <li><span>Delivery:</span> <span>32.00</span></li>
                                    <li><span>Total:</span> <span>3812.00</span></li>
                                </ul>
                                <div class="cart-btn mt-100">
                                    <a href="${pageContext.request.contextPath}/cart" class="btn amado-bt w-100">Checkout</a>
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
                                <a href="${pageContext.request.contextPath}/home"><img src="img/core-img/logodark.png" alt="error"></a>
                            </div>
                            <!-- Text -->
                            <p class="footerdescription">"Animals are such agreeable friends - they ask no questions; they pass no criticisms."<br>
                                - George Eliot
                                <br>
                                <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>
                            </p>
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
                                                <a class="nav-link" href="${pageContext.request.contextPath}/home">Home</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/cages">Shop</a>
                                            </li>
                                            <li class="nav-item active">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/cart">Cart</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/physicalshop">Physical Shop</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/registration">Register Now</a>
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

        <!-- ##### Login Area Start ##### -->
        <div class="modal fade" id="myLogin" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header border-bottom-0">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">x</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="form-title text-center">
                            <h4>LOGIN</h4>
                        </div>
                        <div class="d-flex flex-column text-center">
                            <form>
                                <div class="form-group">
                                    <div class="form-group ">

                                        <input type="text" class="form-control" id="username" placeholder="Enter your username" required>
                                        <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                                        <div class="invalid-feedback">
                                            Please enter a username.
                                        </div>
                                    </div> 
                                </div>
                                <div class="form-group">
                                    <div class="form-group ">

                                        <input type="password" class="form-control" id="password" placeholder="Enter your password" required>
                                        <small id="passwordHelp" class="form-text">Password must be alphanumeric, 8 - 16 characters.</small>
                                        <div class="invalid-feedback">
                                            Please enter your password.
                                        </div>
                                    </div> 
                                </div>

                                <button type='submit' form="Loginform" class="btn btn-info btn-block btn-round d-block  buttonfx angleindouble">Log In</button>

                            </form>
                        </div>
                    </div>
                    <div class="modal-footer d-flex justify-content-center">
                        <div class="signup-section">Not a member yet? <a href="${pageContext.request.contextPath}/registration" class="text-info">Sign Up</a>.</div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ##### Login Area End ##### -->
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
        <script src="js/CustomJs.js"></script>
    </body>

</html>