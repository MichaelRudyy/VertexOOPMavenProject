<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!doctype html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="A portfolio template that uses Material Design Lite.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>MDL-Static Website</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://code.getmdl.io/1.2.1/material.grey-pink.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/styles.css" />
</head>

<body>
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header mdl-layout__header--waterfall portfolio-header">
        <div class="mdl-layout__header-row portfolio-logo-row">
                <span class="mdl-layout__title">
                    <div class="portfolio-logo"></div>
                    <span class="mdl-layout__title">Simple website of Products ${r}</span>
                </span>
            <%--<div class="reg-block">--%>
            <%--<!-- Accent-colored raised button -->--%>
            <%--<button class="left mdl-button mdl-js-button mdl-button--raised mdl-button--accent">--%>
            <%--<a href="/registration">Sign Up</a>--%>
            <%--</button>--%>
            <%--<!-- Accent-colored raised button -->--%>
            <%--<button class="right mdl-button mdl-js-button mdl-button--raised mdl-button--accent">--%>
            <%--<a href="/sign-up">Sign In</a>--%>
            <%--</button>--%>
            <%--</div>--%>
        </div>
        <div class="mdl-layout__header-row portfolio-navigation-row mdl-layout--large-screen-only">
            <nav class="mdl-navigation mdl-typography--body-1-force-preferred-font">
                <a class="mdl-navigation__link is-active" href="/">Shop</a>
                <a class="mdl-navigation__link" href="signup.html">Sign Up</a>
                <a class="mdl-navigation__link" href="signin.html">Sign In</a>
                <a class="mdl-navigation__link " href="#">About</a>
            </nav>
        </div>
    </header>
    <div class="mdl-layout__drawer mdl-layout--small-screen-only">
        <nav class="mdl-navigation mdl-typography--body-1-force-preferred-font">
            <a class="mdl-navigation__link " href="/">Main</a>
            <a class="mdl-navigation__link is-active" href="signup.html">Sign Up</a>
            <a class="mdl-navigation__link" href="signin.html">Sign In</a>
            <a class="mdl-navigation__link " href="#">About</a>
        </nav>
    </div>
    <main class="mdl-layout__content">
        <div class="mdl-grid portfolio-max-width">

            <button id="update" class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent">
                Update Data
            </button>

                <table id="table">
                    <thead>
                    <tr>
                        <td>ID</td>
                        <td>Title</td>
                        <td>Price</td>
                        <td>Description</td>
                        <td>Image Url</td>
                    </tr>
                    </thead>
                    <tbody class="editable">
                    <c:forEach var="product" items="${product}">
                        <tr>
                            <td> <span contenteditable="false">   <c:out value="${product.getId()}"/> </span></td>
                            <td> <span contenteditable="true">   <c:out value="${product.getTitle()}"/> </span></td>
                            <td><span contenteditable="true">   <c:out value="${product.getPrice()}"/> </span></td>
                            <td><span contenteditable="true">    <c:out value="${product.getDescription()}"/> </span></td>
                            <td><span contenteditable="true"> <c:out value="${product.getImgUrl()}"/> </span></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
        </div>
        <footer class="mdl-mini-footer">
            <div class="mdl-mini-footer__left-section">
                <div class="mdl-logo">Simple portfolio website</div>
            </div>
            <div class="mdl-mini-footer__right-section">
                <ul class="mdl-mini-footer__link-list">
                    <li><a href="#">Help</a></li>
                    <li><a href="#">For Admin</a></li>
                    <li><a href="#">Privacy & Terms</a></li>
                </ul>
            </div>
        </footer>
    </main>
</div>
<script src="https://code.getmdl.io/1.2.1/material.min.js"></script>
<script src="js/submit.js"></script>
</body>

</html>
