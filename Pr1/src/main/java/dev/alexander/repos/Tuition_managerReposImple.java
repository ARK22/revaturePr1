package dev.alexander.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.alexander.models.department;
import dev.alexander.models.tuition_manager;
import dev.alexander.util.JDBCConnection;

public class Tuition_managerReposImple implements Tuition_managerRepos {
	public static Connection conn = JDBCConnection.getConnection();
	@Override
	public tuition_manager getTuitionByEmpId(int emp_id) {
		// TODO Auto-generated method stub

		System.out.println("Balancer3");
		try {
			String sql = "SELECT * FROM tuition_tracker WHERE emp_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Integer.toString(emp_id));
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
			tuition_manager holder = new tuition_manager();
			holder.setManager_id(rs.getInt("TUITION_ID"));
			holder.setOwner_id(rs.getInt("EMP_ID"));
			holder.setRemainder(rs.getInt("REMAINDER"));
			System.out.println("Built and Returned");
			return holder;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateTuitionByEmpId() {
		// TODO Auto-generated method stub
		return false;
	}

}
