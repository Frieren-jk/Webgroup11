<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!-- The above 4 meta tags must come first in the head -->

        <!-- Title  -->
        <title>Fur Real Pet Supplies - Registration</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>


        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">
        <script src="https://kit.fontawesome.com/3f5c7d2f43.js" crossorigin="anonymous"></script>
    </head>

    <body>
        <input type="hidden" id="status" value="${regUser}">

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
                                <button  type="submit"><img src="img/core-img/searchicon.png" alt="error"></button>
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

            <div class="cart-table-area section-padding-100 ">
                <div class="container-fluid ">
                    <div class="row">
                        <div class="col-12">
                            <div class="checkout_details_area clearfix">

                                <div class="cart-title">
                                    <h2>REGISTRATION</h2>
                                </div>
                                <div class="registration-form-wrapper">
                                    <form method="POST" action="${pageContext.request.contextPath}/registration/add" class="py-3 needs-validation" id="regform" novalidate>

                                        <div class="row">
                                            <div class="col-12 col-md-6 mt-3">
                                                <div class="form-group ">
                                                    <label for="username">Username</label>
                                                    <input type="text" class="form-control" id="username" name="userName" placeholder="Enter your username" required>
                                                    <small id="usernameHelp"  class="form-text ">Alphanumeric, must be between 4 - 12 characters. Special characters are not allowed.</small>
                                                    <div class="invalid-feedback">
                                                        Please enter a username.</div>
                                                </div> 
                                            </div>
                                        </div>

                                        <div class="row ">
                                            <div class="col-12 col-md-6 mt-5">
                                                <div class="form-group form-pass">
                                                    <label for="password">Password</label>
                                                    <i class="fa fa-eye-slash showPass " ></i>
                                                    <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required >
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
                                                    <small id="confirmpasswordHelp" class="form-text">Passwords must match.</small>
                                                    <div class="invalid-feedback">
                                                        Please confirm your password.
                                                    </div>

                                                </div>
                                            </div>   

                                        </div> 

                                        <div class="row ">
                                            <div class="col-12 col-md-4  mt-5">
                                                <div class="form-group">
                                                    <label for="firstname">First Name</label>
                                                    <input type="text" class="form-control" id="firstname" name="firstName" placeholder="Enter your First Name" required>
                                                    <small id="firstnameHelp" class="form-text">First name must be characters only, minimum of 1 character.</small>
                                                    <div class="invalid-feedback">
                                                        Please enter your First Name.
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-12 col-md-4  mt-5 ">
                                                <div class="form-group">
                                                    <label for="middlename">Middle Name</label>
                                                    <input type="text" class="form-control" id="middlename" name="middleName" placeholder="Enter your Middle Name" >
                                                    <small id="middlenameHelp" class="form-text">Middle name must be characters only or leave it empty if not applicable.</small>
                                                    <div class="invalid-feedback">
                                                        Not Required.
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-12 col-md-4 me-auto mt-5 ">
                                                <div class="form-group">
                                                    <label for="lastname">Last Name</label>
                                                    <input type="text" class="form-control" id="lastname"  name="lastName" placeholder="Enter your Last Name"  required>
                                                    <small id="lastnameHelp" class="form-text">Last name must be characters only, minimum of 2 characters.</small>
                                                    <div class="invalid-feedback">
                                                        Please enter your Last Name.
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 

                                        <div class="row ">
                                            <div class="col-12 col-md-4 me-auto mt-5">
                                                <div class="form-group">
                                                    <label for="address">Complete Address</label>
                                                    <input type="text" class="form-control" id="address" name="address" placeholder="Enter your Address"  required>
                                                    <small id="addressHelp" class="form-text">Address must be alphanumeric, does not contain special characters.</small>
                                                    <div class="invalid-feedback">
                                                        Please enter your Address.
                                                    </div>
                                                </div>
                                            </div>


                                            <div class="col-12 col-md-4 me-auto mt-5 ">
                                                <div class="form-group">
                                                    <label for="birthday">Birthday</label>
                                                    <input type="text" class="form-control bday" id="birthday" name="birthday" placeholder="Enter your Birthday MM-DD-YYYY (2005)"   required>
                                                    <small id="birthdayHelp" class="form-text">Birthday format must be MM-DD-YYYY. Make sure you are at legal age. 2005 below.</small>
                                                    <div class="invalid-feedback">
                                                        Please pick your Birthday.
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-12 col-md-4 me-auto mt-5 ">
                                                <div class="form-group">
                                                    <label for="number">Mobile Number</label>
                                                    <input type="text" class="form-control" id="number" name="mobileNumber" placeholder="09 - Enter your Mobile Number"   required>
                                                    <small id="numberHelp" class="form-text">Mobile Number must be numeric, starts with 09, and should be 11 digits.</small>
                                                    <div class="invalid-feedback">
                                                        Please enter your Mobile Number.
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 
                                    </form>
                                    <button type='submit' form="regform" name="RegisterItem" class=" d-block mx-auto mt-5 buttonfx angleindouble ">Submit</button>
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
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/cart">Cart</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/physicalshop">Physical Shop</a>
                                            </li>
                                            <li class="nav-item active">
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
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>


    </body> 

</html>
