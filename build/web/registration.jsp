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
        <link rel="icon" href="img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="Custom11Css.css">
        <script src="https://kit.fontawesome.com/3f5c7d2f43.js" crossorigin="anonymous"></script>
    </head>
    <style>

        .valid-feedback,
        .invalid-feedback {
            opacity: 1;
            height: 0;
            transition: opacity 0.4s ease-out, height 0.4s ease-out;
            margin-top: 5px;
        }
        .form-control + .valid-feedback {
            color: red;
            opacity: 0;
            height: 0;
            transition: opacity .4s ease-out;
            margin-top: 5px;
        }


        .form-control.invalid + .invalid-feedback {

            opacity: 1;
            height: auto;
            margin-bottom: 5px;
            transition: opacity .4s ease-out;
        }


    </style>

    <body>
        <div id="myModal" class="modal fade pt-5">
            <div class="modal-dialog modal-confirm">
                <div class="modal-content">
                    <div class="modal-header justify-content-center">
                        <div class="icon-box"> 
                            <i class="material-icon fa-solid fa-check"></i>
                        </div>
                    </div>
                    <div class="modal-body text-center">
                        <h4>Great!</h4>	
                        <p>Your account has been created successfully.</p>
                        <button  class="btn btn-success" data-dismiss="modal"><span>Start Exploring</span></button>
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
                    <a href="index.jsp"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>
                <!-- Navbar Toggler -->
                <div class="navbar-toggler">
                    <span></span><span></span><span></span>
                </div>
            </div>

            <!-- Header Area Start -->
            <header class="header-area clearfix ">

                <!-- Close Icon -->
                <div class="nav-close">
                    <i class="fa fa-close" aria-hidden="true"></i>
                </div>

                <!-- Logo -->
                <div class="logo">
                    <a href="index.jsp"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Cart Menu -->
                <div class="sticky-top pt-1">
                    <div> </div>
                    <div class="cart-fav-search mb-100 mt-5 ">
                        <a href="#" class="search-nav"><img src="img/core-img/searchicon.png" alt="error">Search</a>
                        <a class="fav-nav" data-toggle="modal" data-target="#myModal"><img src="img/core-img/loginicon.png" alt="error">Login</a>
                        <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="img/core-img/createicon.png" alt="error">Register Now</a>
                        <a href="${pageContext.request.contextPath}/inventory" class="fav-nav"><img src="img/core-img/inventoryicon.png" href="${pageContext.request.contextPath}/inventory" alt="error">Inventory</a>
                        <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="img/core-img/carticon.png" alt="error">Cart<span>(3)</span></a>
                    </div>

                    <!-- Main Nav -->
                    <nav class="main-nav ">
                        <ul>
                            <li class="active"><a href="${pageContext.request.contextPath}/index">Home</a></li>
                            <li><a href="${pageContext.request.contextPath}/shop">Shop</a></li>
                            <li><a href="${pageContext.request.contextPath}/product">Product</a></li>
                            <li><a href="${pageContext.request.contextPath}/cart">Cart</a></li>
                            <li><a href="${pageContext.request.contextPath}/checkout">Checkout</a></li>
                        </ul>
                    </nav>
                    <br><br><br><br><br>

                    <!-- Social Button -->
                    <div class="social-info d-flex justify-content-between">
                        <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                        <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                        <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                        <a href="https://twitter.com/suppliesfurreal" target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                    </div>
                </div>
            </header>
            <!-- Header Area End -->

            <div class="cart-table-area section-padding-100">
                <div class="container-fluid ">
                    <div class="row">
                        <div class="col-12">
                            <div class="checkout_details_area mt-50 clearfix">

                                <div class="cart-title">
                                    <h2>REGISTRATION</h2>
                                </div>

                                <form class="py-3 needs-validation" id="regform" novalidate>
                                    <div class="row">
                                        <div class="col-12 col-md-6 mt-3">
                                            <div class="form-group ">
                                                <label for="username">Username</label>
                                                <input type="text" class="form-control" id="username" placeholder="Enter your username" required>
                                                <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                                                <div class="invalid-feedback">
                                                    Please enter a username.
                                                </div>
                                            </div> 
                                        </div>
                                    </div>

                                    <div class="row ">
                                        <div class="col-12 col-md-6 mt-5">
                                            <div class="form-group form-pass">
                                                <label for="password">Password</label>
                                                <i class="fa fa-eye-slash showPass " ></i><!-- sopas??-->
                                                <input type="password" class="form-control" id="password" placeholder="Enter your password" required >
                                                <small id="passwordHelp" class="form-text">Password must be alphanumeric, 8 - 16 characters,
                                                    must contain at least 1: capital letter , small letter, number, and special character(!@#$&* are allowed).</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>   

                                        <div class="col-12 col-md-6 mt-5">
                                            <div class="form-group form-confirm">
                                                <label for="confirmpassword">Confirm Password</label>
                                                <i class="fa fa-eye-slash confirmPass" style='top: calc(74% - 0px); left: calc(90% - 2px);'></i>
                                                <input type="password" class="form-control" id="confirmpassword" placeholder="Confirm your password" required>
                                                <small id="confirmpasswordHelp" class="form-text">Please confirm you password, passwords must match.</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>   

                                    </div> 

                                    <div class="row ">
                                        <div class="col-12 col-md-4  mt-5">
                                            <div class="form-group">
                                                <label for="First Name">First Name</label>
                                                <input type="text" class="form-control" id="firstname" placeholder="Enter your First Name" required>
                                                <small id="firstnameHelp" class="form-text">First name must be characters only, minimum of 1 character.</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-12 col-md-4  mt-5 ">
                                            <div class="form-group">
                                                <label for="Middle Name">Middle Name</label>
                                                <input type="text" class="form-control" id="middlename" placeholder="Enter your Middle Name" >
                                                <small id="middlenameHelp" class="form-text">Middle name must be characters only or leave it empty.</small>
                                                <div class="invalid-feedback">
                                                    Not Required
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-12 col-md-4 me-auto mt-5 ">
                                            <div class="form-group">
                                                <label for="Last Name">Last Name</label>
                                                <input type="text" class="form-control" id="lastname" placeholder="Enter your Last Name"  required>
                                                <small id="lastnameHelp" class="form-text">Last name must be characters only, minimum of 2 characters.</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>
                                    </div> 

                                    <div class="row ">
                                        <div class="col-12 col-md-4 me-auto mt-5">
                                            <div class="form-group">
                                                <label for="address">Complete Address</label>
                                                <input type="text" class="form-control" id="address" placeholder="Enter your Address"  required>
                                                <small id="addressHelp" class="form-text">Address must be alphanumeric, does not contain special characters.</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-12 col-md-4 me-auto mt-5">
                                            <div class="form-group">
                                                <label for="Birthday">Birthday</label>
                                                <input type="text" class="form-control" id="birthday" placeholder="Enter your Birthday"  required >
                                                <small id="birthdayHelp" class="form-text">Birthday format must be MM-DD-YYYY.</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-12 col-md-4 me-auto mt-5 ">
                                            <div class="form-group">
                                                <label for="Mobile Number">Mobile Number</label>
                                                <input type="text" class="form-control" id="number" placeholder="Enter your Mobile Number"   required>
                                                <small id="numberHelp" class="form-text">Mobile Number must be numeric, should be 11 digits.</small>
                                                <div class="invalid-feedback">
                                                    Please enter your password.
                                                </div>
                                            </div>
                                        </div>
                                    </div> 
                                </form>
                                <button type='submit' form="regform" class="btn btn-primary d-block mx-auto mt-5 ">Submit</button>
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
                                    <input type="email" class="form-control" id="email1"placeholder="Your email address...">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" id="password1" placeholder="Your password...">
                                </div>
                                <button type="button" class="btn btn-info btn-block btn-round">Log In</button>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer d-flex justify-content-center">
                        <div class="signup-section">Not a member yet? <a href="registration.jsp" class="text-info"> Sign Up</a>.</div>
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
