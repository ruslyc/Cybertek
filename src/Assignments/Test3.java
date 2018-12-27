package Assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	

	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<>();
		r1.add(1);
		r1.add(-1);
		r1.add(61);
		r1.add(11);
		r1.add(12);
		System.out.println(appendSum(r1));
	}
	public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
	    double dollars = 0;
	    for(int i=0; i<money.length;i++){
	      dollars+=Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[i][1]);
	    }
	  
	  return dollars;
	  
	  }
	public static ArrayList appendSum(ArrayList<Integer> nums){
		  ArrayList<Integer> result = new ArrayList<>();
		  for(int i : nums){
		    if(i>=0){
		      result.add(i);
		    }
		  }int sum = 0;
		  for(int j : result){
		    sum+=j;
		  }
		  result.add(sum);
		  return result;
		}
}