

package com.ayush.dao;

import com.ayush.model.ConnectionProvider;
import com.ayush.model.studmodel;
import java.sql.*;
import java.util.*;


public class ViewStudent {
    
      public static int delete(String name){  
        int status=0;  
        try{  
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("delete from student where name=?");  
            ps.setString(2,name);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static List<studmodel> getAllRecords(String hostelname){  
       List<studmodel> list=new ArrayList<studmodel>();  
      ResultSet rs =null;
      String a =null;
    try{  
        Connection con = ConnectionProvider.getCon(); 
        Statement st = con.createStatement();
          rs = st.executeQuery("select name from allotment where hostelname='" + hostelname + "'");
           while (rs.next()) {
                            a = rs.getString("name");
                        
        PreparedStatement ps=con.prepareStatement("select sid,studentmobno,fathername,fathermobno,mothername,"
                 + "mothermobno,email,course,branch,gender,year,percent from student where name='"+a+"'");  
         rs=ps.executeQuery();  
        while(rs.next()){  
            studmodel u=new studmodel();  
            u.setSid(rs.getString("sid"));  
            u.setStudentmobno(rs.getString("studentmobno"));  
            u.setFathername(rs.getString("fathername"));  
            u.setFathermobno(rs.getString("fathermobno"));  
            u.setMothername(rs.getString("mothername"));  
            u.setMothermobno(rs.getString("mothermobno"));  
            u.setEmail(rs.getString("email"));  
            u.setCourse(rs.getString("course"));  
            u.setBranch(rs.getString("branch"));
            u.setGender(rs.getString("gender"));  
            u.setYear(rs.getString("year"));  
            u.setPercent(rs.getFloat("percent"));
            list.add(u);  
        }  }
        }catch(Exception ex){ex.printStackTrace();}  
          
        return list;  
    }  
}
