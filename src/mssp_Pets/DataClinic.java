package mssp_Pets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataClinic {

	public static String readFile(String path) throws IOException //חייב לזרוק את הערה למחלקה הראשית 
	{
		String data="";
		
		 FileInputStream inputStream = new FileInputStream(path);
		 
		 int c;
		 while((c=inputStream.read())!=-1)
			 data+=(char)c;
		 inputStream.close();
		 
		 return data;
		
	}
}
