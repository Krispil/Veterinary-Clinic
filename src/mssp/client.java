package mssp;
import java.util.ArrayList;
import java.util.Scanner;

import mssp_Pets.*;
public class client extends Person {
	
	
	private String Address;
	private String Points;
	private Animal pet;
	private ArrayList<visits> Visits ;
	
	
	public client(String firstName,String lastName,Integer id,
			Integer age,String gender,String mail,String phonNumber,
			String Address,String Points
			, Animal pet) 
	{
		super (firstName, lastName, id,	 age, gender, mail, phonNumber );
		this.Address=Address;
		this.Points=Points;
		this.pet=pet;
		this.Visits=new ArrayList<visits>();
	}
	public client(client c) {
		super (c.firstName, c.lastName, c.id,	 c.age, c.gender, c.mail, c.phonNumber );
		
		this.Address=c.Address;
		this.Points=c.Points;
		this.pet=c.pet;
	}
	
	
	
	
	
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPoints() {
		return Points;
	}

	public void setPoints(String points) {
		Points = points;
	}

	public Animal getPet() {
		return pet;
	}

	public void setPet(Animal pet) {
		this.pet = pet;
	}
	public void addvisit(visits vis)
	{
		this.Visits.add(vis);
	}
	public void addvisitforuser()
	{
		Scanner scan = new Scanner(System.in);
		String date,timeString,AnimalID,nameClient;
		System.out.println("enter your id pet");
		AnimalID=scan.next();
		System.out.println("enter your fullname clint");
		nameClient=scan.next();
		System.out.println("enter date");
		date=scan.next();
		System.out.println("enter time");
		timeString=scan.next();
		
		this.Visits.add(new visits(AnimalID, nameClient, date, timeString));
	}
	
	
	
	
	
	public String toString()
	{
		return "full name:"+firstName+" "+lastName+"\nid: "+id+"\nage:"+age+"\ngender:"+gender+""
				+ "\nmail:"+mail+"\nphon:"+phonNumber+"\nAddress:"+Address+""
				+"\nPoints:"+Points+"\nPet:"+pet+"\n";
	}
}
