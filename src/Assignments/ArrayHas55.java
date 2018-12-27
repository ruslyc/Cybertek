package Assignments;

public class ArrayHas55 {public static void main(String[] args) {
	
    int[] nums = {5,5,8,0,5};
    
    int count = 0;
    for(int i : nums){
      if(i%2==0){
        count++;
      }
    }System.out.println(count);
    }


}
