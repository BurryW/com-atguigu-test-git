package entity;

public class entity {

	private String name;
	private int age;
	public entity(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public entity() {
		super();
	}
	@Override
	public String toString() {
		return "entity [name=" + name + ", age=" + age + "]";
	}
	
}
