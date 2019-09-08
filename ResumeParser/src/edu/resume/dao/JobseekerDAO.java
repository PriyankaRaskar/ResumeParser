package edu.resume.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Set;

import edu.resume.entity.ResumeField;

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

	public static int getJidFromEmail(String email) {

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

	public static boolean insertResumeData(ResumeField resumeFields) {

		// insert skills
		String sql = "insert into  skill (jid,skillname) values(?,?)";
		insertParameters(sql, resumeFields.getSkills(), resumeFields.getJid());

		// insert Educations
		sql = "insert into  education (jid,education) values(?,?)";
		insertParameters(sql, resumeFields.getEducation(), resumeFields.getJid());

		// insert functional area
		sql = "insert into  functionalarea (jid,functionalarea) values(?,?)";
		insertParameters(sql, resumeFields.getFunctionalArea(), resumeFields.getJid());

		// insert jobseeker details
		boolean status = insertJobSeekerDetails(resumeFields);
		return status;
	}

	private static boolean insertJobSeekerDetails(ResumeField resumeFields) {
		boolean status = false;
		String sql = "insert into jobseekerdetail(jid,emailid,phoneno,resumepath,experience,dob,pincode)values(?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, resumeFields.getJid());
			ps.setString(2, resumeFields.getEmail());
			String mobileno = resumeFields.getMobileNumber();
			if (mobileno == null) {
				ps.setObject(3, null);
			} else {
				ps.setString(3, mobileno);
			}

			String resumepath = resumeFields.getResumePath();
			if (resumepath == null) {
				ps.setObject(4, null);

			} else {
				ps.setString(4, resumepath);
			}

			Float experience = resumeFields.getExperience();

			if (experience == null) {
				ps.setObject(5, null);
			} else {
				ps.setFloat(5, experience);
			}

			Date dob = resumeFields.getDob();
			if (dob == null) {
				ps.setObject(6, null);
			} else {
				java.sql.Date sqlDate = new java.sql.Date(dob.getTime());
				ps.setDate(6, sqlDate);
			}

			String pincode = resumeFields.getPincode();

			if (pincode == null) {
				ps.setObject(7, null);
			} else {
				ps.setString(7, pincode);
			}
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

	private static void insertParameters(String sql, Set<String> parsedParamers, int jid) {

		System.out.println("Before inserting Parameters");
		// String sql = "insert into skill (jid,skillname) values(?,?)";
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			for (String param : parsedParamers) {
				ps.setInt(1, jid);
				ps.setString(2, param);
				ps.addBatch();
			}

			ps.executeBatch();
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

	}


}
