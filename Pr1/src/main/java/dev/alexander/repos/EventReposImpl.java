package dev.alexander.repos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dev.alexander.models.event;
import dev.alexander.util.JDBCConnection;

public class EventReposImpl implements EventRepos{
	public static Connection conn = JDBCConnection.getConnection();
	@Override
	public event getEventById(int event_id,int emp_id) {
		// TODO Auto-generated method stub

		try {
			String sql = "SELECT * FROM event_form WHERE event_id = ? AND associate_id = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Integer.toString(event_id));
			ps.setString(2,Integer.toString(emp_id));
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
			event holder = new event();
			holder.setEvent_id(rs.getInt("EVENT_ID"));
			holder.setDate(rs.getString("DATE"));
			holder.setType_id(rs.getInt("TYPE_ID"));
			holder.setLocation(rs.getString("LOCATION"));
			holder.setDescription(rs.getString("DESCRIPTION"));
			holder.setCost(rs.getDouble("COST"));
			holder.setSuper_approval(rs.getInt("SUPER_APPROVAL"));
			holder.setSuper_approval(rs.getInt("BENCO_APPROVAL"));
			return holder;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
/*not sure how to do this yet*/
	@Override
	public ArrayList<event> getAllEventsByDept() {
		
		

		ArrayList<event> aggregate_table = new ArrayList<event>();

		try 
		{
			String sql = "SELECT * FROM event_form";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				event holder = new event();
				holder.setEvent_id(rs.getInt("EVENT_ID"));
				holder.setDate(rs.getString("DATE"));
				holder.setType_id(rs.getInt("TYPE_ID"));
				holder.setLocation(rs.getString("LOCATION"));
				holder.setDescription(rs.getString("DESCRIPTION"));
				holder.setCost(rs.getDouble("COST"));
				holder.setSuper_approval(rs.getInt("SUPER_APPROVAL"));
				holder.setSuper_approval(rs.getInt("BENCO_APPROVAL"));
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
	public ArrayList<event> getAllEventsByEmp_Id(int emp_id) {
		ArrayList<event> aggregate_table = new ArrayList<event>();

		try 
		{
			String sql = "SELECT * FROM event_form WHERE associate_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Integer.toString(emp_id));
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				event holder = new event();
				holder.setEvent_id(rs.getInt("EVENT_ID"));
				holder.setDate(rs.getString("DATE"));
				holder.setType_id(rs.getInt("TYPE_ID"));
				holder.setLocation(rs.getString("LOCATION"));
				holder.setDescription(rs.getString("DESCRIPTION"));
				holder.setCost(rs.getDouble("COST"));
				holder.setSuper_approval(rs.getInt("SUPER_APPROVAL"));
				holder.setSuper_approval(rs.getInt("BENCO_APPROVAL"));
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
	public boolean updateEvent(event current_form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEvent(event currentForm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createEventForm(event newEventForm) {
		// TODO Auto-generated method stub
		try {
			String sql = "CALL create_event_form(?,?,?,?,?,?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1,newEventForm.getTime());
			cs.setString(2,Integer.toString(newEventForm.getType_id()));
			cs.setString(3,newEventForm.getLocation());
			cs.setString(4,Integer.toString(newEventForm.getGrading_type()));
			cs.setString(5,newEventForm.getMin_grade());
			cs.setString(6,newEventForm.getDescription());
			cs.setString(7,Double.toString(newEventForm.getCost()));
			cs.setString(8,Integer.toString(newEventForm.getAssociate_id()));
			cs.setString(9,newEventForm.getGrade());
			
			cs.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return false;
	}
	
}
