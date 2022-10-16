<%@ page
        contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>
        登录界面</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <!--引入bootstrap -->
    <script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          rel="stylesheet">
    <link rel="stylesheet"
          href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="css/js/style.css">
</head>
<body>

<div class="container">
    <div class="form row"
         style="height: 300px">
        <form action="<%=request.getContextPath()%>/account"
              method="get"
              class="form-horizontal col-md-offset-3"
              id="login_form">
            <h3 class="form-title">
                用户登录</h3>
            <div class="col-md-9">
                <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <span style="color:red;font-size:15px;margin-left:-17px">${usernameError}</span>
                    <input class="form-control required"
                           required<%-- 这是前端的自动校验，不需要交给后端处理--%>
                           placeholder="请输入用户名"
                           type="text"
                           name="username">
                </div>
                
                <div class="form-group">
                    <i class="fa fa-lock fa-lg"></i>
                    <span style="color:red;font-size:13px;margin-left:-17px">${passwordError}</span>
                    <input
                            class="form-control required"
                            required<%-- 这是前端的自动校验，不需要交给后端处理--%>
                            placeholder="请输入密码"
                            type="password"
                            name="password">
                </div>
                
                <div class="from-group">
                    <lable class="radio-inline">
                        <input type="radio"
                               name="type"
                               checked
                               value="student"
                               class="radio-inline">学生
                    </lable>
                    <lable class="radio-inline">
                        <input type="radio"
                               name="type"
                               value="teacher"
                               align="right"
                               class="radio-inline">教师
                    </lable>
                </div>
<%--                //col-md-offset-9--%>
                <div class="from-group">
                       <span>
                  <lable>
                      <button type="submit"
                              class="btn btn-success pull-left"
                              align="left"
                              name="submit">登录
                    </button>
                    <button type="reset"
                            class="btn btn-success pull-right"
                            name="submit">重置
                    </button>
                    <button type="submit"
                            align="right"
                            class="btn btn-success pull-right"
                            name="submit">注册
                    </button>
                  </lable>
                    </span>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
</html>