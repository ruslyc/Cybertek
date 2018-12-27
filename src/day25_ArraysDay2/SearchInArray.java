package day25_ArraysDay2;

public class SearchInArray {
	public static void main(String[] args) {
		
		int[] nums ={1,2,3,4,5,60,70,80,90,};
		int lookfor = 100;
		boolean found = false;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==lookfor) {
				System.out.println("100" +" at index " + i);
				found = true;
				break;
				
			} 
			
		}if(!found) {
			System.out.println(lookfor +" notfound");
		}
	}

}
