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
        <title>Registration Page</title>

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

            <div class="regis-table-area section-padding-100 ">
                <div class="container-fluid ">
                    <div class="row">
                        <div class="col-12">
                            <div class="checkout_details_area clearfix">

                                <div class="cart-title">
                                    <center><h1><b style="color: steelblue;">REGISTRATION FORM</b></h1></center>
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
                                                    <input type="text" class="form-control bday" id="birthday" name="birthday" placeholder="Enter your Birthday MM-DD-YYYY (< 2005)"   required>
                                                    <small id="birthdayHelp" class="form-text">Birthday format must be MM-DD-YYYY. Make sure you are at legal age (2005 below).</small>
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
                                            <div class="col-12 col-md-4 me-auto mt-5 ">
                                                <div class="signup-section">Already have an account? <a href="${pageContext.request.contextPath}/login" class="text-info">Login here</a>.</div>
                                                <div class="signup-section">Already logged in? <a href="${pageContext.request.contextPath}/home" class="text-success">Go to Homepage</a>.</div>
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