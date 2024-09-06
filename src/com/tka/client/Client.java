
package com.tka.client;

import java.util.ArrayList;

import com.tka.controller.ClassroomController;
import com.tka.entity.Classroom;

public class Client 
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<Classroom> arrayListCls = ClassroomController.fetchAllClassroom();
		for(Classroom classroom : arrayListCls)
		{
			System.out.println(classroom);
		}
		System.out.println("--------------------------");
		
		ArrayList<Classroom> perId = ClassroomController.getClassroomDetailperID(2);
		for(Classroom classroom : perId)
		{
			System.out.println(classroom);
		}
		System.out.println("--------------------------");
		
//		ClassroomController.deleteClassroomDetail(11);
		
//		ArrayList<Classroom> perFloor = ClassroomController.getClassroomDetailperFloor(2);
//		for(Classroom classroom : perFloor)
//		{
//			System.out.println(classroom);
//		}
		System.out.println("--------------------------");
		
//		Classroom classroomDetailperName=ClassroomController.getclassroomDetailperName("A");
//		System.out.println(classroomDetailperName);
//		System.out.println("--------------------------");		
	}
}
