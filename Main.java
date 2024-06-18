public class Main {
	public static void main(String args[]) {
		System.out.println("Hello, there!");
		System.out.println("Marvelous' feature was added here.");
		System.out.println("Your new feature will be added here.");

		boolean is_Eligible = true;
		boolean is_Not_Young = true;

		boolean is_qualified = is_Eligible && is_Not_Young;

		if (!is_qualified) {
			System.out.println("User is not qualified.");

		} else {
			System.out.println("User is qualified");
		}
	}
}
