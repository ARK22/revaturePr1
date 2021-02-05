package dev.alexander.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dev.alexander.models.department;
import dev.alexander.models.event;
import dev.alexander.util.JDBCConnection;

public class DepartmentReposImpl implements DepartmentRepos {
	public static Connection conn = JDBCConnection.getConnection();
	@Override
	public department getDeptById(int id) {
		try {
			String sql = "SELECT * FROM department WHERE dept_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Integer.toString(id));
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
			department holder = new department();
			holder.setDept_id(rs.getInt("DEPT_ID"));
			holder.setHead_id(rs.getInt("HEAD_ID"));
			holder.setDept_name(rs.getString("DEPT_NAME"));
			return holder;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateDepartment() {
		// TODO Auto-generated method stub
		return false;
	}

}
