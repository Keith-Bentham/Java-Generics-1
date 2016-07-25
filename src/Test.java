
public class Test {
	public static void main(String[] args) {

		try {
			Integer[] arr = { 5, 6, 3, 8, 1 };
			ArrayTest<Integer> at = new ArrayTest<Integer>(arr); 
			System.out.println("First=" + at.first()); 
			System.out.println("Max=" + at.max());

			System.out.println("Sum=" + at.sum());
			at.printAll();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
