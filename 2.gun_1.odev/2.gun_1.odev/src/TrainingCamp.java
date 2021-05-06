
public class TrainingCamp {
	private int id;
	private String name;
	private String instructorName;
	private int price;
	
	
	public TrainingCamp(){
		
	}

	public TrainingCamp(int id, String name, String instructorName, int price) {
		this();
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
