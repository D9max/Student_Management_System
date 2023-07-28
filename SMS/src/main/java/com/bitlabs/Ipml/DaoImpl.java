package com.bitlabs.Ipml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bitlabs.Dao.DaoInterface;
import com.bitlabs.modal.Student;

public class DaoImpl implements DaoInterface{
 
	
	Scanner sc=new Scanner(System.in);
	Student student=new Student();
	public void insert() {
	    Connection con = null;
	    try {
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mubarak", "root", "root");
	        if (con != null) {
	            System.out.println("Connection successfully");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    System.out.println("Enter student id");
	    int id = sc.nextInt();
	    student.setId(id);
	    System.out.println("Enter student name");
	    String name = sc.next();
	    student.setName(name);
	    System.out.println("Enter student Age");
	    int age = sc.nextInt();
	    student.setAge(age);
	    System.out.println("Enter student Email");
	    sc.nextLine();
	    String email = sc.nextLine();
	    student.setEmail(email);
	    System.out.println("Enter student Address");
	    String address = sc.nextLine();
	    student.setAddress(address);
	    System.out.println("Enter student branch");
	    String branch = sc.next();
	    student.setBranch(branch);

	    try {
	        Statement st = con.createStatement();
	        int i = st.executeUpdate("INSERT INTO student VALUES (?,?,?,?,?)");

	        if (i != 0) {
	            System.out.println("Data inserted successfully");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	public void update() {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubarak","root","root");
			if(con!=null) {
				System.out.println("connetion made successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter student id to update");
		int id=sc.nextInt();
		student.setId(id);
		System.out.println("Enter student name to update");
		String name=sc.next();
		student.setName(name);
		
		
		try {
			Statement st=con.createStatement();
			
			int i=st.executeUpdate("update student set name='"+student.getName()+"' where id='"+student.getId()+"'");
			
			if(i!=0) {
				System.out.println("Data updated successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void delete() {
		
				Connection con=null;
				try {
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubarak","root","root");
					if(con!=null) {
						System.out.println("connetion made successfully");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Enter student id to delete");
				int id=sc.nextInt();
				student.setId(id);
				
				
				
				try {
					Statement st=con.createStatement();
					
					int i=st.executeUpdate("delete from student where id='"+student.getId()+"'");
					
					if(i!=0) {
						System.out.println("Data deleted successfully");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}
	public void getAll() {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubarak","root","root");
			if(con!=null) {
				System.out.println("connetion made successfully");
			}
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+
				"  "+rs.getInt(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

}
