package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.DoctorDao;
import dao.PatientDao;
import model.Doctor;
import model.Patient;

/**
 * Servlet implementation class PatientController
 */
@WebServlet("/PatientController")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register")) {
			Patient d = new Patient();
			d.setName(request.getParameter("name"));
			d.setContact(Long.parseLong(request.getParameter("contact")));
			d.setAddress(request.getParameter("address"));
			d.setEmail(request.getParameter("email"));
			d.setPassword(request.getParameter("password"));
			System.out.println(d);
			boolean flag = PatientDao.checkPatientEmail(request.getParameter("email"));
			if(flag == false) {
				PatientDao.insertPatient(d);
				response.sendRedirect("p-login.jsp");
			}
			else {
				request.setAttribute("msg","Account already registered!");
				request.getRequestDispatcher("p-registser.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login")) {
			Patient d = new Patient();
			d.setEmail(request.getParameter("email"));
			d.setPassword(request.getParameter("password"));
			System.out.println(d);
			boolean flag = PatientDao.checkPatientEmail(request.getParameter("email"));
			System.out.println(flag);
			if(flag == true) {
				Patient d1 =  PatientDao.patientLogin(d);
				System.out.println("d1 : "+d1);
				if(d1!=null) {
					HttpSession session = request.getSession();
					session.setAttribute("data",d1);
					request.getRequestDispatcher("p-home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password is Incorrect");
					request.getRequestDispatcher("p-login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Account not found");
				request.getRequestDispatcher("p-login.jsp").forward(request, response);
			}
		}
	}

}
