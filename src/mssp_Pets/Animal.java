package mssp_Pets;
//zxczcx zxcvsdfsddf ds
//sdfsdfsdfsdf
public abstract class Animal {

	protected int weight_;
	protected int height_;
	protected int yaer_b_;
	protected int month_b;
	protected String name;
	protected String color;
	protected String id;
	
	public Animal()
	{
		this.weight_=0;
		this.height_=0;
		this.yaer_b_=0;
		this.month_b=0;
		this.name="0";
		this.color="0";
	}
	public Animal(int w,int h,int y,int m,String n,String c)
	{
		this.weight_=w;
		this.height_=h;
		this.yaer_b_=y;
		this.month_b=m;
		this.name=n;
		this.color=c;
	}
	public Animal(Animal a)
	{
		this.weight_=a.weight_;
		this.height_=a.height_;
		this.yaer_b_=a.yaer_b_;
		this.month_b=a.month_b;
		this.name=a.name;
		this.color=a.color;
	}

	public int getWeight_() {
		return weight_;
	}

	public void setWeight_(int weight_) {
		this.weight_ = weight_;
	}

	public int getHeight_() {
		return height_;
	}

	public void setHeight_(int height_) {
		this.height_ = height_;
	}

	public int getYaer_b_() {
		return yaer_b_;
	}

	public void setYaer_b_(int yaer_b_) {
		this.yaer_b_ = yaer_b_;
	}

	public int getMonth_b_() {
		return month_b;
	}

	public void setMonth_b_(int month_b_) {
		this.month_b = month_b_;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "gal "; 
	}
}