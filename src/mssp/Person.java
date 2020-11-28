package mssp;
public abstract class Person  {

	protected String firstName;
	protected String lastName;
	protected Integer id;
	protected Integer age;
	protected String gender;
	protected String mail;
	protected String phonNumber;
	
	public Person(String firstName,String lastName,Integer id,
			Integer age,String gender,String mail,String phonNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.age=age;
		this.gender=gender;
		this.mail=mail;
		this.phonNumber=phonNumber;

	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhonNumber() {
		return phonNumber;
	}
	public void setPhonNumber(String phonNumber) {

		this.phonNumber = phonNumber;
	}
	
}
