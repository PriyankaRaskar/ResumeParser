package edu.resume.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployerDAO {

	public static boolean registerEmployer(String cname, String regno, String mailid, String add, String pass,
			String phone, String area) {
		boolean status = false;

		String sql = "insert into employer (ecname,ecregno,emailid,eadd,epass,phoneno,farea) values (?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, cname);
			ps.setString(2, regno);
			ps.setString(3, mailid);
			ps.setString(4, add);
			ps.setString(5, pass);
			ps.setString(6, phone);
			ps.setString(7, area);

			ps.executeUpdate();

			status = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return status;
	}

	public static boolean employerLogin(String email, String password) {
		boolean status = false;
		String sql = "select emailid from employer where emailid=? and epass=?";
		PreparedStatement ps = null;
		Connection con = null;
		con = DBConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("emailid"));
				status = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return status;
	}

}
