<%--
  Created by IntelliJ IDEA.
  User: Bohdan
  Date: 18.05.2019
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Form</title>
  </head>
  <body>
  <h1> Form </h1>
  <form action="/question" method="POST">

      First name: <input type="text" name="login"><br>
    Last name: <input type="text" name="password"><br>
          Age: <input type="text" name="age"><br>

          <p>Do you like Java?</p>
          <input type="radio" name="question1" value="yes"/> Yes
          <input type="radio" name="question1" value="no"/> No

          <p>Do you like .Net?</p>
          <input type="radio" name="question2" value="yes"/> Yes
          <input type="radio" name="question2" value="no"/> No
      <p><input type="submit"></p>
  </form>
  </body>
</html>
