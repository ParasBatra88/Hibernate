package com.tka.entity;

public class Classroom 
{
	private int clsId;
	private String clsName;
	private int clsStudentCapicity;
	private int clsFloor;
	private int clsAreaCapicity;
	
	
	public int getClsId() {
		return clsId;
	}
	public void setClsId(int clsId) {
		this.clsId = clsId;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public int getClsStudentCapicity() {
		return clsStudentCapicity;
	}
	public void setClsStudentCapicity(int clsStudentCapicity) {
		this.clsStudentCapicity = clsStudentCapicity;
	}
	public int getClsFloor() {
		return clsFloor;
	}
	public void setClsFloor(int clsFloor) {
		this.clsFloor = clsFloor;
	}
	public int getClsAreaCapicity() {
		return clsAreaCapicity;
	}
	public void setClsAreaCapicity(int clsAreaCapicity) {
		this.clsAreaCapicity = clsAreaCapicity;
	}
	
	@Override
	public String toString() 
	{
		return "Classroom [clsId=" + clsId + ", clsName=" + clsName + ", clsStudentCapicity=" + clsStudentCapicity
				+ ", clsFloor=" + clsFloor + ", clsAreaCapicity=" + clsAreaCapicity + "]";
	}
	
	
		
}
