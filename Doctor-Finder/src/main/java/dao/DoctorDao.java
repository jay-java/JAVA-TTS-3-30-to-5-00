package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import model.Doctor;

public class DoctorDao {
	public static boolean checkDoctorEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from doctor where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void insertDoctor(Doctor d) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="insert into doctor(image,name,contact,address,specialization,w_address,email,password) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1, d.getImage());
			pst.setString(2,d.getName());
			pst.setLong(3, d.getContact());
			pst.setString(4,d.getAddress());
			pst.setString(5, d.getSpecialization());
			pst.setString(6, d.getWork_address());
			pst.setString(7, d.getEmail());
			pst.setString(8, d.getPassword());
			pst.executeUpdate();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Doctor doctorLogin(Doctor u) {
		Doctor d = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from doctor where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				d = new Doctor();
				d.setDid(rs.getInt("did"));
				d.setImage(rs.getString("image"));
				d.setName(rs.getString("name"));
				d.setContact(rs.getLong("contact"));
				d.setAddress(rs.getString("address"));
				d.setSpecialization(rs.getString("specialization"));
				d.setWork_address(rs.getString("w_address"));
				d.setEmail(rs.getString("email"));
				d.setPassword(rs.getString("password"));
				System.out.println("d in DAO class : "+d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
}
