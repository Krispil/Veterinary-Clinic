package mssp;

public class employee extends Person {
	
	private String StartOfWorkDate;
	private String RoleInTheCompany;
	private Double PricePerHour;
	
	public employee(String firstName,String lastName,Integer id,
			Integer age,String gender,String mail,String phonNumber,String StartOfWorkDate,
			String RoleInTheCompany,Double PricePerHour) 
	{
		super (firstName, lastName, id,	 age, gender, mail, phonNumber );
		this.StartOfWorkDate=StartOfWorkDate;
		this.RoleInTheCompany=RoleInTheCompany;
		this.PricePerHour=PricePerHour;
	}
	public String getStartOfWorkDate() {
		return StartOfWorkDate;
	}
	public void setStartOfWorkDate(String startOfWorkDate) {
		StartOfWorkDate = startOfWorkDate;
	}
	public String getRoleInTheCompany() {
		return RoleInTheCompany;
	}
	public void setRoleInTheCompany(String roleInTheCompany) {
		RoleInTheCompany = roleInTheCompany;
	}

	public Double getPricePerHour() {
		return PricePerHour;
	}
	public void setPricePerHour(Double pricePerHour) {
		PricePerHour = pricePerHour;
	}
	public String toString()
	{
		return "full name:"+firstName+" "+lastName+"\nid: "+id+"\nage:"+age+"\ngender:"+gender+""
				+ "\nmail:"+mail+"\nphon:"+phonNumber+"\nStart Work date:"+StartOfWorkDate+""
				+"\nRole:"+RoleInTheCompany+"\nPrice Per Hour:"+PricePerHour+"\n";
	}
	
}

