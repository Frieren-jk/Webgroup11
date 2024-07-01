<%-- 
    Document   : login
    Created on : Jun 26, 2024, 7:09:52 PM
    Author     : Mariz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags must come first in the head -->

        <!-- Title  -->
        <title>Fur Real Pet Supplies - Login</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="./style.css">
    </head>

    <body>
        <div class="modal-body">
            <div class="form-title text-center">
                <h4>LOGIN</h4>
            </div>
            <div class="d-flex flex-column text-center">
                <form action="${pageContext.request.contextPath}/login" method="POST">
                    <div class="form-group">
                        <div class="form-group ">

                            <input type="text" class="form-control" id="userName" name="userName" placeholder="Enter your username" required>
                            <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                            <div class="invalid-feedback">
                                Please enter a username.
                            </div>
                        </div> 
                    </div>
                    <div class="form-group">
                        <div class="form-group ">

                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
                            <small id="passwordHelp" class="form-text">Password must be alphanumeric, 8 - 16 characters.</small>
                            <div class="invalid-feedback">
                                Please enter your password.
                            </div>
                        </div> 
                    </div>

                    <button type='submit' class="btn btn-info btn-block btn-round d-block  buttonfx angleindouble">Log In</button>

                </form>
            </div>
        </div>
        <div class="modal-footer d-flex justify-content-center">
            <div class="signup-section">Not a member yet? <a href="${pageContext.request.contextPath}/registration" class="text-info">Sign Up</a>.</div>
        </div>
    </div>
</div>
</div>
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