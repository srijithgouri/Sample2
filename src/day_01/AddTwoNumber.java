package day_01;

public class AddTwoNumber {

	public static void main(String ...args) {
		
		System.out.println(addNumbers("batch1",2,34,5,5));
		System.out.println(addNumbers("batch2",45,56,2,34,5,5));
	}
	
	public static String addNumbers(String name, int ...numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return name +" -> " +sum;
	}

}
