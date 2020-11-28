package mssp;
import mssp_Pets.*;
public class visits {

	private String petAnimalID;
	private String nameClient;
	private String date;
	private String timeString;
	private int id;
	private static int startid=12399999;
	
	public visits(String petAnimal,String namClient,String date,String timString)
	{
		this.petAnimalID=petAnimal;
		this.nameClient=namClient;
		this.date=date;
		this.timeString=timString;
		this.id= startid++;
		
	}



	public String getPetAnimalID() {
		return petAnimalID;
	}



	public void setPetAnimalID(String petAnimalID) {
		this.petAnimalID = petAnimalID;
	}



	public String getNameClient() {
		return nameClient;
	}



	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTimeString() {
		return timeString;
	}



	public void setTimeString(String timeString) {
		this.timeString = timeString;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static int getStartid() {
		return startid;
	}



	public static void setStartid(int startid) {
		visits.startid = startid;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

