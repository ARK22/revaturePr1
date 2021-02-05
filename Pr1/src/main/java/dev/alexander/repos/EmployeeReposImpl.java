package dev.alexander.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dev.alexander.models.employee;
import dev.alexander.util.JDBCConnection;


public class EmployeeReposImpl implements EmployeeRepos {

	public static Connection conn = JDBCConnection.getConnection();
	
	@Override
	public employee getEmployeeById(int id) {
		
		try {
			String sql = "SELECT * FROM employee WHERE username = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Integer.toString(id));
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
			employee holder = new employee();
			holder.setEmp_id(rs.getInt("EMP_ID"));
			return holder;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public employee getEmployeeByUsername(String username) {
		System.out.println(conn);
		employee holder = new employee();
		try 
		{
			String sql = ("SELECT * FROM employee WHERE username = '"+ username +"'");
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			if(rs.next()){
			holder.setEmp_id(rs.getInt("EMP_ID"));
			holder.setFirst_name(rs.getString("F_NAME"));
			holder.setUsername(rs.getString("USERNAME"));
			holder.setPassword(rs.getString("PASSWORD"));
			holder.setDept_id(rs.getInt("DEPT_ID"));
			return holder;
			}
			else 
			{
				System.out.println("Nobody");
				return holder;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public ArrayList<employee> getAllEmployees() {
		ArrayList<employee> aggregate_table = new ArrayList<employee>();

		try 
		{
			String sql = "SELECT * FROM users";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				employee holder = new employee();
				holder.setUsername(rs.getString("USERNAME"));
				holder.setPassword(rs.getString("PASSWORD"));
				holder.setSupervisor(rs.getInt("SUPER_ID"));
				holder.setEmp_id(rs.getInt("EMP_ID"));
				holder.setDept_id(rs.getInt("DEPT_ID"));
				aggregate_table.add(holder);	
			}
			return aggregate_table;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		 
		return null;
	}
	public ArrayList<employee> getAllEmployeesByDept(int dept_num)
	{
		ArrayList<employee> aggregate_table = new ArrayList<employee>();

		try 
		{
			String sql = "SELECT * FROM users WHERE dept_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Integer.toString(dept_num));

			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				employee holder = new employee();
				holder.setUsername(rs.getString("USERNAME"));
				holder.setPassword(rs.getString("PASSWORD"));
				holder.setSupervisor(rs.getInt("SUPER_ID"));
				holder.setEmp_id(rs.getInt("EMP_ID"));
				holder.setDept_id(rs.getInt("DEPT_ID"));
				aggregate_table.add(holder);	
			}
			return aggregate_table;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		 
		return null;
		
	}
	@Override
	public boolean updateEmployee(employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

}
