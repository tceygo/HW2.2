package sample;

public class Dog extends Animal {

	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog() {
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
		return "Гав";
	}

	@Override
	public void eat() {
		System.out.println("швидко все зїсти бажано розбризкуючи слину");
	}

	@Override
	public void sleep() {
		System.out.println("влягтися посеред кімнати");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", Ration=" + getRation() + ", Color=" + getColor() + ", Weight="
				+ getWeight() + "]";
	}

}
