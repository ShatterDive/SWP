<%-- 
    Document   : login
    Created on : May 21, 2023, 11:20:39 AM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container" id="container">
            <div class="form-container sign-up-container">
                <form action="SignUpController" method="post">
                    <h1>Create Account</h1>
                    <!--                    <div class="social-container">
                                            <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                                            <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                                            <a href="#" class="social" n><i class="fab fa-linkedin-in"></i></a>
                                        </div>
                                        <span>or use your email for registration</span>-->
                    <input  oninvalid="this.setCustomValidity('Full Name(Nguyen Van A)')" required pattern="^[A-Za-z]+\s[A-Za-z]+$" name="fname" type="text" placeholder="Full Name " />
                 
                    <input oninvalid="this.setCustomValidity('Enter UserName')" required name="user" type="text" placeholder="Username" />
                    
                    <input oninvalid="this.setCustomValidity('Enter PassWord')" required name="pass" type="password" placeholder="Password" />
                    
                    <input oninvalid="this.setCustomValidity('Enter PassWord Again')"  required name="cpass" type="password" placeholder="Confirm Password" />
                    
                    <input required name="address" type="text" placeholder="Address" />
                    <div class="sign-up-container-group">
                        <input oninvalid="this.setCustomValidity('Enter Phone')" required=""  pattern="[0]{1}[3|5|7|8|9]{1}[0-9]{8}" class="sign-up-container-phone" name="phone" type="text" placeholder="Phone" />              
                        <input oninvalid="this.setCustomValidity('Enter Your Age')" required="" class="sign-up-container-age" name="age" type="number" placeholder="Age" />
                    </div>
                    <div style="color: red ;font-weight: inherit;">${check}</div>
                    
                    <button type="submit">Sign Up</button>
                </form>
            </div>
            <div class="form-container sign-in-container">
                <form action="LoginCotroller" method="post">
                    <h1>Sign in</h1>
                    <!--                    <div class="social-container">
                                            <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                                            <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                                            <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
                                        </div>-->
                    <!--                    <span>or use your account</span>-->
                    <div style="color: red ;font-weight: inherit;">${mess}</div>
                    <input name="name" value="${user}" type="text" placeholder="Username" />
                    <input name="pass" value="${pass}" type="password" placeholder="Password" />
                    <a href="forgetpass.jsp">Forgot your password?</a>
                    <button type="submit">Sign In</button>
                </form>
            </div>
            <div class="overlay-container">
                <div class="overlay">
                    <div class="overlay-panel overlay-left">
                        <h1>Welcome Back!</h1>
                        <p>To keep connected with us please login with your personal info</p>
                        <button class="ghost" id="signIn">Sign In</button>
                    </div>
                    <div class="overlay-panel overlay-right">
                        <h1>Hello, Friend!</h1>
                        <p>Enter your personal details and start journey with us</p>
                        <button class="ghost" id="signUp">Sign Up</button>
                    </div>
                </div>
            </div>
        </div>
        <script src="js/login.js" type="text/javascript"></script>

    </body>
</html>
