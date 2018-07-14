<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<title>Document</title>
<style>
*{margin:0; padding:0;}

#wrap{
display:flex;
flex-flow:row wrap;
width:90%; 
margin:0 auto;
}
.header{
display:flex;
order:1;
position:relative;
width:100%;
justify-content:flex-end;
}
.header h1{
position:absolute;
top:0;
left:0;
width:12.5%;
height:142px;
background:#ff6b57;
}
.header nav{
width:87.5%;
min-height:80px;
background:#ff6b57;
}
.slider_section{
order:2;
width:50%;
background:#3c90be;
}
.gallery_section{
order:3;
width:27.08333333333%;
height:440px;
background:#f8de73;
}
.rankup_section{
order:4;
width:22.9166666667%;
background:#00d2a5;
}
.latest_post_section{
order:5;
width:30%;
background:#9cabe4;
}
.popular_post_section{
order:6;
width:30%;
background:#d76817;
}
.banner_section{
display:flex;
order:7;
flex-flow:column nowrap;
width:22.91666667%;
}
.banner_section div{
flex:1 1 0;
}
.banner_section div.banner_box_01{
background:#0175bb;
}
.banner_section div.banner_box_02{
background:#1261c9;
}
.social_section{
order:8;
width:17.08333333%;
height:270px;
background:#fe6eda;
}
.footer{
order:9;
width:100%;
height:94px;
background:#474747;
}
</style>
</head>
<body>
	<div id="wrap">
		<header class="header">
			<h1></h1>
			<nav></nav>
		</header>
		<section class="slider_section"></section>
		<section class="gallery_section"></section>
		<section class="rankup_section"></section>
		
		<section class="latest_post_section"></section>
		<section class="popular_post_section"></section>
		<section class="banner_section">
			<div class="banner_box_01"></div>
			<div class="banner_box_02"></div>
		</section>
		<section class="social_section"></section>
		<footer class="footer"></footer>
	</div>
</body>
</html>
