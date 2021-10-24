package sample;

public class Cat extends Animal {

	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getVoise() {
		return "Мяу";
	}

	@Override
	public void eat() {
		System.out.println("хлебтати молоко");
	}

	@Override
	public void sleep() {
		System.out.println("знайти тепле міце і скрутися клубком");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", Ration=" + getRation() + ", Color=" + getColor() + ", Weight" + getWeight()
				+ "]";
	}

}
