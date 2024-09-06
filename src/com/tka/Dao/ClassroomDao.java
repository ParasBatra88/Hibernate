package com.tka.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.tka.entity.Classroom;
import com.tka.util.DatabaseUtil;

public class ClassroomDao 
{
	public static ArrayList<Classroom> fetchAllClassroom()
	{
		ArrayList<Classroom> listcls = new ArrayList();
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			DatabaseUtil.LoadDriver("com.mysql.cj.jdbc.Driver");
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
			Connection connection = DatabaseUtil.createConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
			
			//Statement statement = connection.createStatement();
			Statement statement=DatabaseUtil.createStatement1(connection);
			String sql = "select * from classroom";
			System.out.println("sql>>"+sql);
//			ResultSet rs = statement.executeQuery(sql);
			ResultSet rs=DatabaseUtil.generateResultSet(sql,statement);
			
			while(rs.next())
			{
				Classroom classroom = new Classroom();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int clsStudentCapicity=rs.getInt(3);
				int clsFloor=rs.getInt(4);
				int clsAreaCapicity=rs.getInt(5);
				classroom.setClsId(id);
				classroom.setClsName(name);
				classroom.setClsStudentCapicity(clsStudentCapicity);
				classroom.setClsFloor(clsFloor);
				classroom.setClsAreaCapicity(clsAreaCapicity);
		
				listcls.add(classroom);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listcls;
	}
	
	public static void insertClassroomDetail(Classroom classroom) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
		Statement stm = con.createStatement();
		String sql ="insert into classroom(clsId,clsName,clsStudentCapicity,clsFloor,clsAreaCapicity) values(?,?,?,?,?)";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1,classroom.getClsId());
		preparedStatement.setString(2,classroom.getClsName());
		preparedStatement.setInt(3,classroom.getClsStudentCapicity());
		preparedStatement.setInt(4,classroom.getClsFloor());
		preparedStatement.setInt(5,classroom.getClsAreaCapicity());
		preparedStatement.executeUpdate();
		con.close();
	}
	
	public static void updateClassroomDetail(Classroom classroom) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
		Statement stm = con.createStatement();
		String sql ="update classroom set clsName=?,clsStudentCapicity=?,clsFloor=?,clsAreaCapicity=?where clsId=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1,classroom.getClsId());
		preparedStatement.setString(2,classroom.getClsName());
		preparedStatement.setInt(3,classroom.getClsStudentCapicity());
		preparedStatement.setInt(4,classroom.getClsFloor());
		preparedStatement.setInt(5,classroom.getClsAreaCapicity());
		preparedStatement.executeUpdate();
		con.close();
	}
	
	public static void deleteClassroomDetail(int clsId) throws Exception
	{
		System.out.println("I am in Dao-DeleteClassroomDetail");
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DatabaseUtil.LoadDriver("com.mysql.cj.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
		Connection connection = DatabaseUtil.createConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
		
		//Statement statement = connection.createStatement();
		Statement statement=DatabaseUtil.createStatement1(connection);
		String sql = "delete from classroom where clsId="+clsId;
		System.out.println("sql>>"+sql);
		statement.executeUpdate(sql);
	}
}
