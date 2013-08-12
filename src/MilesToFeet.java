
public class MilesToFeet {

	public static void main(String[] args) {
		//Declare and initialize named constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		
		//Declare and initialize variables
		float uncleMiles = 8.5f;
		float uncleFeet = uncleMiles * FEET_PER_MILE;
		
		//Display output
		System.out.println("The distance to my uncle's house is" + uncleMiles + uncleFeet);
		System.out.println("That's " + uncleFeet + " feet!");

	}

}
