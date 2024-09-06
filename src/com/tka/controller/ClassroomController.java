package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Classroom;
import com.tka.service.ClassroomService;
import com.tka.util.ValidationUtility;

public class ClassroomController 
{
	public static ArrayList<Classroom> fetchAllClassroom()
	{
		return ClassroomService.getAllClassroomDetails();
	}
	
	public static void deleteClassroomDetail(int clsId) throws Exception
	{
		if(!ValidationUtility.isNumberZero(clsId));
		{
		System.out.println("I am in Controller-DeleteClassroomDetail");
		ClassroomService classroomService = new ClassroomService();
		ClassroomService.deleteClassroomDetail(clsId);
		}
	}
	
	
	public static ArrayList<Classroom> getClassroomDetailperID(int clsId)
	{	
		Classroom classroom=null;
		if(!ValidationUtility.isNumberZero(clsId))
		{
			ClassroomService classroomService = new ClassroomService();
		}
		return ClassroomService.getClassroomDetailperID(clsId);
	}
	
	
	public static Classroom getclassroomDetailperName(String clsName)
	{
		return ClassroomService.getClassroomDetailperName(clsName);
	}
	
	public static ArrayList<Classroom> getClassroomDetailperFloor(int floor)
	{
		return ClassroomService.getClassroomDetailperFloor(floor);
	}
	
}
