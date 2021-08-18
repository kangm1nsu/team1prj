<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방역팀 관리 시스템</title>
	<link rel="stylesheet" href="css/index.css">
	<style>

	</style>
<script src="https://code.jquery.com/jqeury-1.12.4.min.js"></script>
<script>
	$(function(){
	
	});
</script>
</head>
	<body width="100%" height="100%">
          
        <form action="/qtsms?cmd=LOGIN" method="post"  class="loginForm">
          <h2>로그인</h2>
          <div class="idForm">
            <input type="text" class="admin_id" name = "admin_id" placeholder="아이디">
          </div>
          <div class="passForm">
            <input type="password" class="admin_pwd" name = "admin_pwd" placeholder="비밀번호">
          </div>
          <input type="submit" class="btn" value= "log in"> 
          
         
          <div class="bottomText">
             <a href="#">아이디/비밀번호 찾기</a>&nbsp;&nbsp;&nbsp;
             <a href="/">회원가입</a>
          </div>
        </form>
        </body>
</html>