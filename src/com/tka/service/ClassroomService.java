package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.Dao.ClassroomDao;
import com.tka.entity.Classroom;

public class ClassroomService 
{
	public static ArrayList<Classroom> getAllClassroomDetails()
	{
		ArrayList<Classroom> listcls = ClassroomDao.fetchAllClassroom();
		return listcls;
	}
	
	public static ArrayList<Classroom> getClassroomDetailperID(int clsId)
	{
		ArrayList<Classroom> listcls = ClassroomDao.fetchAllClassroom();
		ArrayList<Classroom> list=new ArrayList<Classroom>();
		
		for(Classroom classroom : listcls)
		{
			if(clsId==classroom.getClsId())
			{
				list.add(classroom);
			}
		}

		return list;
	}
	
	public static Classroom getClassroomDetailperName(String clsName)
	{
		ClassroomDao classroomDao = new ClassroomDao();
		Classroom classroomNew = new Classroom();
		ArrayList<Classroom> listcls = ClassroomDao.fetchAllClassroom();
		
		for(Classroom classroom : listcls)
		{
			if(clsName.equalsIgnoreCase(classroom.getClsName()))
			{
				classroomNew.setClsId(classroom.getClsId());
				classroomNew.setClsName(classroom.getClsName());
				classroomNew.setClsStudentCapicity(classroom.getClsStudentCapicity());
				classroomNew.setClsFloor(classroom.getClsFloor());
				classroomNew.setClsAreaCapicity(classroom.getClsAreaCapicity());
			}
		}
		if(classroomNew.getClsName()==null)
		{
			classroomNew.setClsName("Not Exist Please enter Another Classroom");
		}
		return classroomNew;
	}
	
	public static void deleteClassroomDetail(int clsId) throws Exception
	{
		System.out.println("I am in Service-DeleteClassroomDetail");
		ClassroomDao classroomDao = new ClassroomDao();
		classroomDao.deleteClassroomDetail(clsId);
	}
	
	public static ArrayList<Classroom> getClassroomDetailperFloor(int floor)
	{
		ArrayList<Classroom> listcls = ClassroomDao.fetchAllClassroom();
		ArrayList<Classroom> classroomfloor = new ArrayList<Classroom>();
		for(Classroom classroom : listcls)
		{
			if(floor==classroom.getClsFloor())
			{
				classroomfloor.add(classroom);
			}
		}
		return classroomfloor;
	}
	
	}
