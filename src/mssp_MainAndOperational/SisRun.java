package mssp_MainAndOperational;
import mssp.*;
import mssp_MainAndOperational.*;
import mssp_Pets.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SisRun {
	
	
	Scanner scnr = new Scanner(System.in);
	private ArrayList<CreatingAsystem> Systems;
	private String clincName;
	private int clincid;
	
	
	public void StartSystem()
	{
        String op="";
        boolean gonext= true;
        
		System.out.println("Welcome to the system");
		System.out.println("chose option");
		System.out.println("1. Creation and insertion of a new clinic into the system");
		System.out.println("2. login");
		do {
			try {
				op = scnr.next();
			}
			catch (Exception e) {
				gonext=false;
				System.out.println("press again 1 or 2");	
				System.out.println(e);
			}
			
		}while(!gonext);
		
		
	
		if(op == "1") {
			System.out.println("in");
			Systems.add(CreatingSystem());
			StartSystem();
		}
		
		if(op == "2") 
			SystemOperation();
		 
	}
	
	public CreatingAsystem CreatingSystem()
	{
        System.out.println("in creat");
		boolean pass=true;
		do{
			try {
				System.out.println("enter clinic name");
				clincName = scnr.next();
			}
			catch (Exception e) {
				pass=false;
				System.out.println("error");
			}
		}while(!pass);
		
		pass=true;
		
		do{
			try {
				System.out.println("enter clinic id");
				clincid = scnr.nextInt();
			}
			catch (Exception e) {
				pass=false;
				System.out.println("error");
			}
		}while(!pass);
		CreatingAsystem SISNEW1000 = new CreatingAsystem(clincName, clincid);
		return SISNEW1000;
	}
	
	public  int login()
	{
		String name="";int id=0;
		boolean pass=true;
		do{
			try {
				System.out.println("enter clinic name");
				name = scnr.next();
			}
			catch (Exception e) {
				pass=false;
				System.out.println("error");
			}
		}while(!pass);
		
		
		pass=true;
		
		
			try {
				System.out.println("enter clinic id");
				id = scnr.nextInt();
			}
			catch (Exception e) {
				
				System.out.println("error");
				System.out.println("error2");
				
			}

		
		
		
		boolean exists = false;
		for(CreatingAsystem s : Systems)
			if(s.getSystemNmae()== name && s.getSestemId()==id)
				exists=true;
		if(exists) return id;
		else {
			System.out.println("Incorrect name or password");
			login();
		}
		return 0;
		
	}
	
	
	public void  SystemOperation() {
		
		int idclinclogin = login();
		
		
		
		
	/*	System.out.println("add emp");
		for(CreatingAsystem s : Systems)
			if(s.getSestemId()==idclinclogin)
				s.setemployees();*/
	}
	
	
}
