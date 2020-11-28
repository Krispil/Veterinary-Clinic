package mssp_MainAndOperational;
import java.util.*;
import mssp.*;
import java.util.ArrayList;
import mssp_Pets.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;


public class CreatingAsystem {
	
	Scanner scan =new Scanner(System.in);
	
	//private File employeesData = new File("C:\\Users\\gal\\MSSP\\mssp\\info_client.txt");
	File clientsData = new File("C:\\Users\\gal\\MSSP\\mssp\\info_client.txt");
	
	private String SystemNmae;
	private int SestemId;
	private ArrayList<employee> employees;
	private ArrayList<client> clients;
	
	public CreatingAsystem(String name,int id)
	{
		clients=new ArrayList<client>();
		employees=new ArrayList<employee>();
		SystemNmae=name;
		SestemId=id;
	}

	public String getSystemNmae() {
		return SystemNmae;
	}

	public void setSystemNmae(String systemNmae) {
		SystemNmae = systemNmae;
	}

	public int getSestemId() {
		return SestemId;
	}

	public void setSestemId(int sestemId) {
		SestemId = sestemId;
	}

	public ArrayList<client> getClient() {
		return clients;
	}

	public void addclient(client c) {
		this.clients.add(c);
	}

	public ArrayList<employee> getEmployees() {
		return employees;
	}

	public void addEmployees(employee e) {
		this.employees.add(e);
	}
	
	public void addemployeesForUser() 
	{
		String fname,lname,gender,mail,phon,startdate,role;
		int id,age;
		Double price;
		System.out.println("enter your first name");
		fname=scan.next();
		System.out.println("enter your last name");
		lname=scan.next();
		System.out.println("enter your id");
		id=scan.nextInt();
		System.out.println("enter your age");
		age=scan.nextInt();
		System.out.println("enter your gender");
		gender=scan.next();
		System.out.println("enter your mail");
		mail=scan.next();
		System.out.println("enter your phon");
		phon=scan.next();
		System.out.println("enter your Start of work date ");
		startdate=scan.next();
		System.out.println("enter your role");
		role=scan.next();
		System.out.println("enter your price for hour");
		price=scan.nextDouble();
		
		
		employee newemp = new employee(fname,lname,id,age,gender,mail,phon,startdate,role,price);
		employees.add(newemp);
		System.out.println("done");
	}
	
	public void addempClientForUser()

	{
		String fname,lname,gender,mail,phon,Address,Points;
		int id,age;
		Animal pet = null;

		Double price;
		System.out.println("enter your first name");
		fname=scan.next();
		System.out.println("enter your last name");
		lname=scan.next();
		System.out.println("enter your id");
		id=scan.nextInt();
		System.out.println("enter your age");
		age=scan.nextInt();
		System.out.println("enter your gender");
		gender=scan.next();
		System.out.println("enter your mail");
		mail=scan.next();
		System.out.println("enter your phon");
		phon=scan.next();
		System.out.println("enter your Address ");
		Address=scan.next();
		System.out.println("enter your role");
		Points=scan.next();
		
		client newcli = new client(fname,lname,id,age,gender,mail,phon,Address,Points,pet);
		clients.add(newcli);
		System.out.println("done");
		
		
	}
	
	public void addVisitToClint() {
		
		int id;
		System.out.println("enter id clint");
		id=scan.nextInt();
		
		System.out.println(id);
		
		for(client c :this.clients){
			
			System.out.println(c.getId());
			System.out.println("12");
			
			if(c.getId()==id) {
				c.addvisitforuser();
			}
		}
		
		for(int h=0;h<clients.size();h++)
		{
			System.out.println(clients.get(h).getId());
			System.out.println("12");
			
			if(clients.get(h).getId()==id) {
				clients.get(h).addvisitforuser();
			}
		}
		
		System.out.println(clients);
		System.out.println("SDf");
		
		for(client c :this.clients)
		{
			System.out.println(c.getFirstName());
		}
	}
}
