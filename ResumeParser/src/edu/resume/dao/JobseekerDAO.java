package edu.resume.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JobseekerDAO {

	public static boolean registerJobseeker(String jName, String email, String password) {
		boolean status = false;

		String sql = "insert into jobseekerlogin (jname,emailaddress,jpassword) values (?,?,?)";
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, jName);
			ps.setString(2, email);
			ps.setString(3, password);
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

	public static boolean jobseekerLogin(String email, String password) {
		boolean status = false;
		String sql = "select jid from jobseekerlogin where emailaddress=? and jpassword=?";
		PreparedStatement ps = null;
		Connection con = null;
		con = DBConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("jid"));

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

	public static int uploadResume(String email) {

		int jid = -1;
		String sql = "select jid from jobseekerlogin where emailaddress=?";
		PreparedStatement ps = null;
		Connection con = null;
		con = DBConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				jid = rs.getInt("jid");
				System.out.println(jid);
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
		return jid;
	}
}
