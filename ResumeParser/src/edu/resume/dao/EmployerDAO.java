package edu.resume.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.resume.entity.Jobseeker;
import edu.resume.entity.JobseekerSearchInput;

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

	public static List<Jobseeker> searchJobseeker(JobseekerSearchInput jobseekerInput) {
		System.out.println("functionarea :" + jobseekerInput.getFunctionalarea());

		Set<Integer> jidSet = new HashSet<>();
		String sql = "select distinct jid from functionalarea where functionalarea=?";
		getJidsFromSkills(jobseekerInput.getFunctionalarea(), sql, jidSet);

		sql = "select distinct jid from skill where skillname=?";
		getJidsFromSkills(jobseekerInput.getSkill(), sql, jidSet);

		sql = "select distinct jid from education where education=?";
		getJidsFromSkills(jobseekerInput.getEducation(), sql, jidSet);

		String jidString = jidSet.stream().map(String::valueOf).collect(Collectors.joining(","));

		System.out.println("jidString: " + jidString);

		List<Jobseeker> resumes = getResumeDataForSearch(jidString, jobseekerInput.getExperience());

		return resumes;
	}

	private static List<Jobseeker> getResumeDataForSearch(String jidString, String experience) {

		// String sql = "select distinct
		// jid,emailid,phoneno,resumepath,experience,dob,pincode from jobseekerdetail
		// where jid in ("+ jidString + ") or experience >=?";
		String sql = "select distinct j.jid,j.emailid,j.phoneno,j.resumepath,j.experience,j.dob,j.pincode ,l.jname  "
				+ "from jobseekerdetail j inner join jobseekerlogin l on j.jid=l.jid" + " where j.jid in (" + jidString
				+ ") or j.experience >=?";
		
		
		System.out.println("sql: "+sql);
		List<Jobseeker> jobseekerList = new ArrayList<>();
		PreparedStatement ps = null;
		Connection con = null;
		con = DBConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			if (experience == null ||experience =="") {
				ps.setObject(1, null);
			} else {
				float experienceFloat = Float.parseFloat(experience);
				ps.setFloat(1, experienceFloat);
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Jobseeker js = new Jobseeker();
				js.setName(rs.getString("jname"));
				js.setJid(rs.getInt("jid"));
				js.setEmail(rs.getString("emailid"));
				js.setMobileNumber(rs.getString("phoneno"));
				js.setResumePath(rs.getString("resumepath"));
				js.setExperience(String.valueOf(rs.getFloat("experience")));
				js.setDob(String.valueOf(rs.getDate("dob")));
				js.setPincode(String.valueOf(rs.getInt("pincode")));

				jobseekerList.add(js);
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

		return jobseekerList;
	}

	public static Set<Integer> getJidsFromSkills(String skills, String sql, Set<Integer> jidSet) {

		PreparedStatement ps = null;
		Connection con = null;
		con = DBConnection.getConnection();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, skills);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				jidSet.add(rs.getInt("jid"));
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

		return jidSet;

	}
}
