package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Appointment;

@WebServlet("/AppointmentController")
public class AppointmentController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action  = request.getParameter("action");
		if(action.equalsIgnoreCase("book")) {
			Appointment a = new Appointment();
			a.setPid(Integer.parseInt(request.getParameter("pid")));
			a.setPack_id(Integer.parseInt(request.getParameter("pack_id")));
			a.setP_name(request.getParameter("p_name"));
			a.setP_amount(Integer.parseInt(request.getParameter("p_amount")));
			a.setP_test(request.getParameter("p_test"));
			a.setDate(Date.valueOf(request.getParameter("date")));
			a.setStatus("pending");
			System.out.println(a);
			
		}
	}

}
