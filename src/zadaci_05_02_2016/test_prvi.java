package zadaci_05_02_2016;

/*
 * Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10, color 
 * yellow, and turn it on to the first object. Assign medium speed, radius 5, color 
 * blue, and turn it off to the second object. Display the objects by invoking their 
 * toString method.
 */

public class test_prvi {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		// Assign maximum speed, radius 10, color
		// yellow, and turn it on to the first object
		f1.setColor("Yellow");
		f1.setRadius(10);
		f1.setSpeed(f1.FAST);
		f1.setOn(true);
		// Assign medium speed, radius 5, color
		// blue, and turn it off to the second object
		f2.setColor("Blue");
		f2.setRadius(5);
		f2.setSpeed(f1.MEDIUM);
		f2.setOn(false);
		// Display the objects by invoking their toString method.
		System.out.println(f1.toString());
		System.out.println(f2.toString());

	}

}
