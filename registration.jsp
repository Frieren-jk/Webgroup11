<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags must come first in the head -->

    <!-- Title  -->
    <title>Fur Real Pet Supplies - Registration</title>

    <!-- Tab Icon  -->
    <link rel="icon" href="img/core-img/">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="Custom11Css.css">
</head>

<body>
     <div class="modal fade " style="z-index: 1060;" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body d-flex justify-content-evenly">
                        SUCCESS!!
                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Back to Home</button>
                    </div>
                </div>
            </div>
        </div>

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
                            <button type="submit"><img src="img/core-img/search.png" alt="error"></button>
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
                <a href="index.jsp"><img src="img/core-img/logo.png" alt="error"></a>
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
                <a href="index.jsp"><img src="img/core-img/logo.png" alt="error"></a>
            </div>

            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="#" class="search-nav"><img src="img/core-img/search.png" alt="error"> Search</a>
                <a href="registration.jsp" class="fav-nav"><img src="img/core-img/favorites.png" alt="error"> Log In</a>
                <a href="registration.jsp" class="fav-nav"><img src="img/core-img/favorites.png" alt="error"> Register Now</a>
                <a href="cart.jsp" class="cart-nav"><img src="img/core-img/cart.png" alt="error"> Cart <span>(0)</span></a>
            </div>

            <!-- Main Nav -->
            <nav class="main-nav">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="shop.jsp">Shop</a></li>
                    <li><a href="product-details.jsp">Product</a></li>
                    <li><a href="cart.jsp">Cart</a></li>
                    <li><a href="checkout.jsp">Checkout</a></li>
                </ul>
            </nav>

            <br><br><br><br><br>

            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            </div>
        </header>
        <!-- Header Area End -->
        

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid ">
                <div class="row">
                    <div class="col-12">
                        <div class="checkout_details_area mt-50 clearfix">

                            <div class="cart-title">
                                <h2>Registration</h2>
                            </div>

                            <form class="py-3" id="regform">
                                <div class="row">
                                    <div class="col-12 col-md-6 mt-3">
                                        <div class="form-group ">
                                            <label for="username">Username</label>
                                            <input type="text" class="form-control" id="username" placeholder="Enter your username" required>
                                            <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                                        </div> 
                                    </div>
                                </div>

                                <div class="row ">
                                    <div class="col-12 col-md-6 mt-5">
                                        <div class="form-group form-pass">
                                            <label for="password">Password</label>
                                            <i class="fa fa-eye-slash showPass " ></i><!-- sopas??-->
                                            <input type="password" class="form-control" id="password" placeholder="Enter your password" required>
                                            <small id="passwordHelp" class="form-text">Password must be alphanumeric, 8 - 16 characters,
                                                must contain at least 1: capital letter , small letter, number, and special character(!@#$&* are allowed).</small>
                                        </div>
                                    </div>   

                                    <div class="col-12 col-md-6 mt-5">
                                        <div class="form-group form-confirm">
                                            <label for="confirmpassword">Confirm Password</label>
                                            <i class="fa fa-eye-slash confirmPass" style='top: calc(% - 3px);'></i>
                                            <input type="password" class="form-control" id="confirmpassword" placeholder="Confirm your password" required>
                                            <small id="confirmpasswordHelp" class="form-text">Please confirm you password, passwords must match.</small>
                                        </div>
                                    </div>   

                                </div> 

                                <div class="row ">
                                    <div class="col-12 col-md-4  mt-5">
                                        <div class="form-group">
                                            <label for="First Name">First Name</label>
                                            <input type="text" class="form-control" id="firstname" placeholder="Enter your First Name" required>
                                            <small id="firstnameHelp" class="form-text">First name must be characters only, minimum of 1 character.</small>
                                        </div>
                                    </div>

                                    <div class="col-12 col-md-4  mt-5 ">
                                        <div class="form-group">
                                            <label for="Middle Name">Middle Name</label>
                                            <input type="text" class="form-control" id="middlename" placeholder="Enter your Middle Name" notrequired>
                                            <small id="middlenameHelp" class="form-text">Middle name must be characters only or leave it empty.</small>
                                        </div>
                                    </div>

                                    <div class="col-12 col-md-4 me-auto mt-5 ">
                                        <div class="form-group">
                                            <label for="Last Name">Last Name</label>
                                            <input type="text" class="form-control" id="lastname" placeholder="Enter your Last Name" required>
                                            <small id="lastnameHelp" class="form-text">Last name must be characters only, minimum of 2 characters.</small>
                                        </div>
                                    </div>
                                </div> 

                                <div class="row ">
                                    <div class="col-12 col-md-4 me-auto mt-5">
                                        <div class="form-group">
                                            <label for="address">Complete Address</label>
                                            <input type="text" class="form-control" id="address" placeholder="Enter your Address" required>
                                            <small id="addressHelp" class="form-text">Address must be alphanumeric, does not contain special characters.</small>
                                        </div>
                                    </div>

                                    <div class="col-12 col-md-4 me-auto mt-5">
                                        <div class="form-group">
                                            <label for="Birthday">Birthday</label>
                                            <input type="text" class="form-control" id="birthday" placeholder="Enter your Birthday" required>
                                            <small id="birthdayHelp" class="form-text">Birthday format must be MM-DD-YYYY.</small>
                                        </div>
                                    </div>
                                    <div class="col-12 col-md-4 me-auto mt-5 ">
                                        <div class="form-group">
                                            <label for="Mobile Number">Mobile Number</label>
                                            <input type="text" class="form-control" id="number" placeholder="Enter your Mobile Number" required>
                                            <small id="numberHelp" class="form-text">Mobile Number must be numeric, should be 11 digits.</small>
                                        </div>
                                    </div>
                                </div> 
                            </form>
                            <button type='submit' form="regform" class="btn btn-primary d-block mx-auto mt-3">Submit</button>
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
                            <a href="index.jsp"><img src="img/core-img/logo2.png" alt="error"></a>
                        </div>
                        <!-- Text -->
                        <p class="footerdescription">Because we care for your pet's safety and health.
                            <br>
                            <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>
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
                                        <li class="nav-item">
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
    <script src="js/CustomJs.js"></script>

</body>

</html>