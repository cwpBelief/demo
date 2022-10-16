package com.controller;
//这是控制层
/*
控制层需要做什么？
1，调用service层，
2，service层去调用dao层
  介于业务逻辑层和数据库之间，进行数据的访问和操作。
  Data Access Object(数据访问对象的缩写),

 */
import com.dao.ImplStudent;
import com.dto.Encapsulation;
import com.entity.Student;
import com.service.ImplStudentService;
import com.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/account") // 添加与前端静态页面中的提交表单的映射。
public class AccountServlet extends HttpServlet {
	private StudentService studentservice1 = new ImplStudentService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req,resp);//doGet中直接调用doPost方法
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username"); // 拿到前端login.jsp中用户输入的用户名
		String password = req.getParameter("password");// 拿到前端login.jsp中用户输入的密码
		System.out.println(username);
		System.out.println(password);
		Encapsulation Encapsulation_01 = this.studentservice1.login(username,password);
		switch (Encapsulation_01.getUsername_errors()){
			case -1 :
				req.setAttribute("usernameError","用户名不存在");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
				break;
			case -2 :
				req.setAttribute("passwordError", "密码不存在");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
				break;
			case -3 :
				System.out.println("登录成功！");
				req.getRequestDispatcher("Success.jsp").forward(req, resp);
				break;
		}
}

}