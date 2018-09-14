package com.ayush.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ayush.model.ConnectionProvider;
import com.ayush.model.studmodel;

public class AllotmentDao {

	public String allot(studmodel bean) {
		int a = 0;
                String sid = bean.getSid();
		String name = bean.getName();
		int rollno = bean.getRollno();
		String hostelname = bean.getHostelname();
		int room = bean.getRoom();

		String year = bean.getYear();
		ResultSet rs = null;

		PreparedStatement ps= null;
		try {
			Connection con = ConnectionProvider.getCon();

			 ps = con.prepareStatement("insert into allotment(name,rollno,hostelname,room,year,sid) values (?,?,?,?,?.?)");
			ps.setString(1, name);
			ps.setInt(2, rollno);
			ps.setString(3, hostelname);
			ps.setInt(4, room);
			ps.setString(5, year);
                        ps.setString(7, sid);

			System.out.println("fuuuuuccckk");
			int i = ps.executeUpdate();
			System.out.println("value of i is  "+i);
			Statement stmt = con.createStatement();
			
			if (hostelname.equals("Malviya Bhawan")) {
				System.out.println("coommmiinnnggggg");
				 rs = stmt.executeQuery("select occupancy from malviya where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				if(a==0)
				{
				 stmt.executeUpdate("update malviya  set occupancy=1 where room=" + room);
				ps = con.prepareStatement("insert into malviyattend(name,room) values (?,?)");
				ps.setString(1, name);
				ps.setInt(2, room);
				System.out.println("in mavliya!!!!!!!!!!!!!!!!");
				ps.executeUpdate(); 
				}
			}
			else if(hostelname.equals("Vivekanand Bhawan")) 
			{
				 rs = stmt.executeQuery("select occupancy from fblock where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
			 
				if(a==0)
				{
					stmt.executeUpdate("update fblock  set occupancy=1 where room=" + room);
					
					PreparedStatement ps1 = con.prepareStatement("insert into fblockattend(name,room) values (?,?)");
				ps1.setString(1, name);
				ps1.setInt(2, room);
				ps1.executeUpdate(); 
				}
			}
			else if(hostelname.equals("Patel Bhawan")) 
			{
				 rs = stmt.executeQuery("select occupancy from bblock where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				 
				 if(a==0)
					{
						stmt.executeUpdate("update bblock  set occupancy=1 where room=" + room);
						
						PreparedStatement ps2 = con.prepareStatement("insert into bblockattend(name,room) values (?,?)");
					ps2.setString(1, name);
					ps2.setInt(2, room);
					ps2.executeUpdate(); 
					}
			}
			else if(hostelname.equals("LMR")) 
			{
				 rs = stmt.executeQuery("select occupancy from LMR where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				
				if(a==0)
				{
					stmt.executeUpdate("update LMR  set occupancy=1 where room=" + room);
					PreparedStatement ps3 = con.prepareStatement("insert into LMRattend(name,room) values (?,?)");
				ps3.setString(1, name);
				ps3.setInt(2, room);
				ps3.executeUpdate(); 
				}
			}
			else if(hostelname.equals("Navyug")) 
			{
				 rs = stmt.executeQuery("select occupancy from navyug where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				 
				 if(a==0)
					{
					 stmt.executeUpdate("update navyug  set occupancy=1 where room=" + room);
					 PreparedStatement ps4 = con.prepareStatement("insert into navyugattend(name,room) values (?,?)");
					ps4.setString(1, name);
					ps4.setInt(2, room);
					ps4.executeUpdate(); 
					}
			}
			else if(hostelname.equals("Sarojini Bhawan")) 
			{
				 rs = stmt.executeQuery("select occupancy from sarojini where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				 
				 if(a==0)
					{
					 stmt.executeUpdate("update sarojini  set occupancy=1 where room=" + room);
					 
					 PreparedStatement ps5 = con.prepareStatement("insert into sarojiniattend(name,room) values (?,?)");
					ps5.setString(1, name);
					ps5.setInt(2, room);
					ps5.executeUpdate(); 
					}
			}
			else if(hostelname.equals("MBA")) 
			{
				 rs = stmt.executeQuery("select occupancy from MBA where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				 
				 if(a==0)
					{
					 stmt.executeUpdate("update MBA  set occupancy=1 where room=" + room);
					 
					 PreparedStatement ps6 = con.prepareStatement("insert into MBAattend(name,room) values (?,?)");
					ps6.setString(1, name);
					ps6.setInt(2, room);
					ps6.executeUpdate(); 
					}
			}
			else if(hostelname.equals("E Block")) 
			{
				 rs = stmt.executeQuery("select occupancy from eblock where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				
				if(a==0)
				{
					stmt.executeUpdate("update eblock  set occupancy=1 where room=" + room);
					
					PreparedStatement ps7 = con.prepareStatement("insert into eblockattend(name,room) values (?,?)");
				ps7.setString(1, name);
				ps7.setInt(2, room);
				ps7.executeUpdate(); 
				}
			}
			else if(hostelname.equals("D Block")) 
			{
				 rs = stmt.executeQuery("select occupancy from dblock where room=" + room);
				while (rs.next()) {
					a = rs.getInt("occupancy");
				}
				
				if(a==0)
				{
					stmt.executeUpdate("update dblock  set occupancy=1 where room=" + room);
					
				PreparedStatement pst  = con.prepareStatement("insert into dblockattend(name,room) values (?,?)");
				pst.setString(1, name);
				pst.setInt(2, room);
				pst.executeUpdate();
			
				}
			}
			
			
			if (i > 0 && a == 0) {
				System.out.println("success return");

				return "SUCCESS";
			}
			rs.close();
			stmt.close();
			ps.close();
			con.close();
			
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return "Oops.. Something went wrong there..!";
	}
}
