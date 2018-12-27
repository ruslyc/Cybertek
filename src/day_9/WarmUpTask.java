package day_9;

public class WarmUpTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num1, num2,num3, max;
			num1=6;
			num2=6;
			num3=1;
			if (num1>=num2&&num1>=num3) {
				max=num1;
			}else if(num2>=num1&&num2>=num3) {
				max=num2;
			}else{
				max=num3;
			}
			 System.out.println("Max: number "+ max);
			
	}

}
