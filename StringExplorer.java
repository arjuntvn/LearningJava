package com.self.explore;

public class StringExplorer {
public static void main(String[] args) {
	// To check difference between String literal and objects
	
	String s1="Arjun";
	String s2="Arjun";
	
	if(s1==s2){
		System.out.println("Both S1 and S2 are same stored at same location in pool");
	}
   
	 String s3=new String("Arjun");
	 String s4=new String("Arjun");
	 
	 // compare s1 and S3
	 if(s1==s3){
		 System.out.println("dummy");
	 }else{
		 System.out.println("S1 String literal doesnt have same object as S3");
	 }
	 
	 //compare s3 and s4
	 if(s3==s4){
		 System.out.println("Dummy");
	 }else{
		 System.out.println("Both s3 and S4 are different,as  they are stored different location in heap ");
	 }
}
}
