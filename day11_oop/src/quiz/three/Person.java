package quiz.three;

//Person class  -  이름, 키, 몸무게
public class Person {
	protected String name;
	protected char id;
	protected int height, weight;
	
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}
	public void disp() {
		System.out.println("Person [name=" + name + ", height=" + height + ", weight=" + weight + ", id= " + id + "]");
	}
	
	
}
