package com.tka.util;

public class ValidationUtility 
{
	public static boolean checkAnyTextBlankOrNull(String textToCheck)
	{
		if(textToCheck==null)
		{
			return false;
		}
		if(textToCheck!=null && textToCheck.trim()=="")
		{
			return false;
		}
		return true;
	}
	
	public static boolean isNumberZero(int numToCheck)
	{
		if(numToCheck<=0)
		{
			System.out.println("Its a Zero");
			return true;
		}
		System.out.println("Validation Done");
		return false;
	}
	
	public static void main(String[] args) 
	{
		isNumberZero(0);
	}
}
