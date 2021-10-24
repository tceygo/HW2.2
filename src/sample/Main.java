package sample;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog ("Сухий корм", "Чорний", 12, "Сірко");
		Animal cat = new Cat ("Молоко", "Сірий", 1, "Космос");
//		System.out.println(dog);
//		System.out.println(dog.getVoise());
//		dog.sleep();
		
		Veterinarian v = new Veterinarian("Олександр");
		v.treatment(dog);
		v.treatment(cat);
	}

}
