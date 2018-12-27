package day5_operators;



public class CastingPrimitives {

	public static void main(String[] args) {

		

		int i = 100;

		byte b = (byte)i;

		

		double price = 12.5;

		int price2 = (int)price;

		

		System.out.println(price2);

		

		//implicit casting examples:

		int count = 45566;

		double doubleCount = count;

		System.out.println(doubleCount);

		

		byte byteValue = 127;

		int intValue = byteValue;//int intValue = (int)byteValue;

		

		//explicit casting

		int students = 70;

		byte byteStudents = (byte)students;

		System.out.println(byteStudents);

		//int --> byte variable

		double priceOfSmth = 5343.23;

		int intPrice = (int)priceOfSmth;

		System.out.println(intPrice);//5343

		 int large = 34;

		 byte small = (byte)large;

		 System.out.println(small);

		

		 String numStr = "2345";//234552

		 System.out.println(numStr + 5 + 2);

		 //"2345" + 5 -> "23455" + 2 -> "234552"

		 System.out.println(numStr + (5 + 2));//23457

		 

	}

}