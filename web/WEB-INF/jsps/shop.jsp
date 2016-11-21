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


   <c:forEach var="product" items="${product}">
                <div class="mdl-cell mdl-card mdl-shadow--4dp portfolio-card">
                    <div class="mdl-card__media">
                        <img class="article-image" src=" <c:out value="${product.getImgUrl()}"/>" border="0" alt="">
                    </div>
                    <div class="mdl-card__title">
                        <h2 class="mdl-card__title-text"><c:out value="${product.getTitle()}"/></h2>
                    </div>
                    <div class="mdl-card__supporting-text">
                        <c:out value="${product.getDescription()}"/>
                        <br>
                        <c:out value="${product.getPrice()}"/>
                    </div>
                    <div class="mdl-card__actions mdl-card--border">
                        <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect mdl-button--accent" href="portfolio-example01.html">Buy</a>
                        <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect mdl-button--accent" href="portfolio-example01.html">Read more</a>
                    </div>
                </div>
   </c:forEach>
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
</body>

</html>
