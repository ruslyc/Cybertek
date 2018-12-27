package day25_ArraysDay2;

public class ArrayPrintReverse {
	public static void main(String[] args) {
		
		int[] scores = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i =1; i<=scores.length;i++) {
			System.out.print(scores[scores.length-i]+" ");
			
		
		}System.out.println();
		int l= scores.length-1;
		
		while(l>=0) {
			System.out.print(scores[l]+" ");
			l--;
		}
	}

}
