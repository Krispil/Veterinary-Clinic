package mssp_Pets;

public class dog extends Animal {

	private String typedog;
	private int num_chip;
	private String BehaviorAndCharacter;
	
	public dog(int weight_,int height_,int yaer_b_,int month_b_,
			String name,String color,
			String t,int c,String str)
	{
		
		super(weight_,height_, yaer_b_,month_b_,name,color);
		this.typedog=t;
		this.num_chip=c;
		this.BehaviorAndCharacter=str;
	}

	public String getTypedog() {
		return typedog;
	}

	public void setTypedog(String typedog) {
		this.typedog = typedog;
	}

	public int getNum_chip() {
		return num_chip;
	}

	public void setNum_chip(int num_chip) {
		this.num_chip = num_chip;
	}

	public String getBehaviorAndCharacter() {
		return BehaviorAndCharacter;
	}

	public void setBehaviorAndCharacter(String behaviorAndCharacter) {
		BehaviorAndCharacter = behaviorAndCharacter;
	}
	public String toString()
	{
		return "pet name:"+this.name;
	}
	
}
