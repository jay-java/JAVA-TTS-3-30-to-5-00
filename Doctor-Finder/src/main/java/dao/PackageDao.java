package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.DoctorPackages;

public class PackageDao {
	public static void insertPackage(DoctorPackages p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql="insert into package(did,p_name,p_amount,p_test) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getDid());
			pst.setString(2, p.getP_name());
			pst.setInt(3, p.getP_amount());
			pst.setString(4, p.getP_test());
			pst.executeUpdate();
			System.out.println("package uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<DoctorPackages> getPackagesByDid(int id){
		List<DoctorPackages> list = new ArrayList<DoctorPackages>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from package where did=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				DoctorPackages p = new DoctorPackages();
				p.setP_id(rs.getInt("p_id"));
				p.setDid(rs.getInt("did"));
				p.setP_name(rs.getString("p_name"));
				p.setP_amount(rs.getInt("p_amount"));
				p.setP_test(rs.getString("p_test"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static DoctorPackages getPackageByPid(int pid) {
		DoctorPackages p = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from package where p_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				p = new  DoctorPackages();
				p.setP_id(rs.getInt("p_id"));
				p.setDid(rs.getInt("did"));
				p.setP_name(rs.getString("p_name"));
				p.setP_amount(rs.getInt("p_amount"));
				p.setP_test(rs.getString("p_test"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
}
