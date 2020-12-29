package check;

import constants.Constants;

public class Check {
	private static String firstName = "徳永";
	private static String lastName = "哲真";

	private void printName(String firstName, String lastName) {
		System.out.println(firstName + lastName);

	}

	public static void main(String[] args) {
		System.out.print("printNameメソッド→");
		Check check = new Check();
		check.printName(firstName, lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();

	}

}
