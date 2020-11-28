package mssp_MainAndOperational;

import data_files.data_files;
import mssp.client;
import mssp.employee;
import mssp.visits;
import mssp_Pets.Animal;
import mssp_Pets.dog;
import mssp.client;
import mssp.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import mssp.visits;
import mssp_Pets.Animal;
import mssp_Pets.dog;
import java.util.ArrayList;
import java.util.Scanner;

import data_files.data_files;

public class testsis {

	public static Scanner scan = new Scanner(System.in);
	
	public static void manualTest()
	{
        CreatingAsystem newsis = new CreatingAsystem("gal clinic", 204221691); 
		
		employee yakir = new employee("yakir", "zeev", 23423523, 26, "man", "yakir88@gmail.com", "050234234", "2020", "engineer", 50.5);
		employee yakir2 = new employee("yakir", "zeev", 23423523, 26, "man", "yakir88@gmail.com", "050234234", "2020", "engineer", 50.5);
		client yael= new client("yael","nueman",23043244,25,"women","yaelasd@gmail.com",
				"03452324243","amir","23",null);
		client yael22= new client("yael","nueman",23043244,25,"women","yaelasd@gmail.com",
				"03452324243","amir","23",null);
	    var gal = new client("gal", "gal", 2, 2, "gal", "gal", "gal", "gal", "gal",null);
	    var gal2 = new client("gal", "gal", 2, 2, "gal", "gal", "gal", "gal", "gal",null);
	    Animal pet_yael = new dog(55,80 ,2010,2,"dudu","black","doberman",25020,"not blagan");
	    Animal gal_pet = new dog(10,15 ,2012,4,"tzahi","brwon","pikinaz", 93422,"not blagan");
	    Animal pet_yael2 = new dog(55,80 ,2010,2,"dudu","black","doberman",25020,"not blagan");
	    Animal gal_pet2= new dog(10,15 ,2012,4,"tzahi","brwon","pikinaz", 93422,"not blagan");
		
	    newsis.addempClientForUser();
	    yael.setPet(pet_yael);
	    yael22.setPet(pet_yael2);
	    gal.setPet(gal_pet);
	    gal2.setPet(gal_pet2);
		newsis.addclient(yael);
		newsis.addclient(yael22);
		newsis.addclient(gal);
		newsis.addclient(gal2);
		newsis.addEmployees(yakir);
		newsis.addEmployees(yakir2);
		gal.setPet(gal_pet);
		newsis.addclient(gal);
		newsis.getClient().get(0).addvisit(new visits(
											newsis.getClient().get(0).getPet().getName(),
											newsis.getClient().get(0).getFirstName(),
											"21.09.20", "16:34:00"));
		data_files.CreateAndADDWriteToAfile("C:\\Users\\gal\\MSSP\\mssp\\history.txt",yael.toString());
		data_files.CreateAndWriteToAfile("C:\\Users\\gal\\MSSP\\mssp\\info_client.txt",newsis.getClient().toString());
		//data_files.CreateAndWriteToAfile("C:\\Users\\gal\\MSSP\\mssp\\info_employee.txt",);
		System.out.println("info_employee:");
		data_files.readFile("C:\\Users\\gal\\MSSP\\mssp\\info_employee.txt");
		System.out.println("====================");
		System.out.println("info_client:");
		data_files.readFile("C:\\Users\\gal\\MSSP\\mssp\\info_client.txt");
		System.out.println("====================");
		System.out.println("history:");
		data_files.readFile("C:\\Users\\gal\\MSSP\\mssp\\history.txt");
		
	}
}
