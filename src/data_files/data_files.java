package data_files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class data_files {
	
	public static String GetInfoFile(String path) throws IOException  
	{
		String data="";
		
		 FileInputStream inputStream = new FileInputStream(path);
		 
		 int c;
		 
		 while((c=inputStream.read())!=-1)
			 data+=(char)c;
		 
		 inputStream.close();
		 System.out.println("done");
		 return data;
		
	}
	
	public static void readFile(String path) 
	{
		
		 try {
		      File myObj = new File(path);
		      
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      
		      myReader.close();
		      
		    } catch (IOException e) {
		    	
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      
		    }
		
	}
	
	public static void readFile2(String path)
	{
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));
			String line;
			
			while((line =br.readLine())!=null)
				System.out.println(line);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
					try {
						br.close();
						}
					catch (IOException e) 
						{
						e.printStackTrace();
						}
		}
	}
	
	
	//==========================================================================
	
	
	public static void writefile(String path ,String content) throws IOException
	{
		writefile(path,content.getBytes());
	}
	
	public static void writefile(String path ,byte[] content) throws IOException
	{
		FileOutputStream OutputStream = new FileOutputStream(path);
		OutputStream.write(content);
		OutputStream.close();
	}

	public static void writefile2(String path ,byte[] content) throws IOException
	{
		FileOutputStream OutputStream = new FileOutputStream(path);
		OutputStream.write(content);
		OutputStream.write(content, 3, 10);
		OutputStream.close();
	}
	
	public static void CreateAndWriteToAfile(String path  , String content ) 
	{
		
		try {
			 File file = new File(path);
			 
			 if(!file.exists())
				 file.createNewFile();
			 
			 PrintWriter pw =new PrintWriter(file);
			 
			 pw.println(content); 
			 pw.close();
			 
			 System.out.println("Done");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void CreateAndADDWriteToAfile(String path , String content) 
	{
		try {
			 File file = new File(path);
			 
			 if(!file.exists())
				 file.createNewFile();
			 
			FileWriter fw = new FileWriter(file,true);
			
			fw.write(content);
			fw.write("\n");
			fw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}




