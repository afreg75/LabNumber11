import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarLot {

	static ArrayList<Car> carList = new ArrayList<>();
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {

		String userResponse = "yes";

		carList.add(new Car(" Nissan ", "Model      ", 2018, 54999.90));
		carList.add(new Car(" Ford ", "  Escape     ", 2018, 31999.90));
		carList.add(new Car(" Chevy ", " Camaro     ", 2018, 54999.90));
		carList.add(new UsedCar(" Honda ", " Accord ", 2015, 14795.50, 35987.6));
		carList.add(new UsedCar(" Toy   ", " Tundra", 2015, 8500.00, 12345.0));
		carList.add(new UsedCar(" Dodge ", "Charger ", 2016, 14450.50, 3500.3));

		boolean done = false;
		while (!done) {
			System.out.println("Select an option:(list, select, add, remove, quit)");
			String option = scnr.next();
			switch (option) {
			case "list":
				doListOption();
				break;
			case "select":
				doSelectOption();
				break;// TODO add a break after every case
			case "add":
				doAddOption();
				break;
			case "remove":
				doRemoveOption();
				break;
			case "quit":
				done = true;
				break;
			default:
				System.out.println("Invalid choice......");
				break;
			}
			

		}
		
		System.out.println();

		System.out.println("Goodbye");

		scnr.close(); // todo close scanner here only
	}

	private static void doListOption() {
		for (int i = 0; i < carList.size(); i++) {
			System.out.println((i + 1) + " . " + carList.get(i));
		}

	}

	private static void doSelectOption() {

		String userResponse;
		do {

			for (int i = 0; i < carList.size(); i++) {
				System.out.println((i + 1) + " . " + carList.get(i));
			}
			System.out.println("Please select between 1-6");
			int userSelect = scnr.nextInt();
			System.out.print(carList.get(userSelect - 1));

			System.out.println();

			System.out.println("Would you like to select again?");
			userResponse = scnr.next();

		} while (userResponse.equalsIgnoreCase("yes"));
		
	}

	public static void doAddOption() {
		String userResponse;
		do {
			for (int i = 0; i < carList.size(); i++) {
				System.out.println((i + 1) + " . " + carList.get(i));
			}

			String carMake;
			String carModel;
			int carYear;
			double carPrice;

			System.out.print("Enter Car Make: ");
			String userResponseCar = scnr.next();

			carMake = userResponseCar;

			System.out.print("Enter Car Model: ");
			String userResponseModel = scnr.next();

			carModel = userResponseModel;

			System.out.print("Enter Car Year: ");
			int userResponseInt = scnr.nextInt();

			carYear = userResponseInt;

			System.out.print("Enter Car Price: ");
			double userResoponsePrice = scnr.nextDouble();

			carPrice = userResoponsePrice;

			carList.add(new Car(carMake, carModel, +carYear, carPrice));

			System.out.println("Would you like remove another vehicle?");
			userResponse = scnr.next();

		} while (userResponse.equalsIgnoreCase("yes"));
		
	}

	private static void doRemoveOption() {

		String userResponse;
		do {

			for (int i = 0; i < carList.size(); i++) {
				System.out.println((i + 1) + " . " + carList.get(i));
			}

			System.out.println("Please select between number you want to remove");
			int userSelect = scnr.nextInt();
			carList.remove(userSelect - 1);

			System.out.println("Would you like remove another vehicle?");
			userResponse = scnr.next();

		} while (userResponse.equalsIgnoreCase("yes"));
		
	}
}
