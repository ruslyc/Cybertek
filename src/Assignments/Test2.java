package Assignments;

public class Test2 {
	public static void main(String[] args) {
		String main = "Sarah";
		String coverME = "a";
		int idx = 0;
	    int count =0;
	    while(idx != -1){
	      idx = main.indexOf(coverME, idx);  
	      if (idx !=-1) {
	    	  idx += coverME.length();
	      count++;
	      }
	      }
	    idx = 0;
	    for(int i =0; i <count; i++ ) {
	    	idx = main.indexOf(coverME, idx);
	    	  main = main.substring(0, idx)+"["+main.substring(idx, idx + coverME.length())+ "]"+ main.substring(idx+coverME.length());
	    	  idx += coverME.length()+1;
	}
	    System.out.println(main);
	    String [] nums = {"1","2","3","1","2","3"};
	    System.out.println(getDup(nums));

}
	public static int[] deleteR(int[] arr,int element) {
	    int [] newArr = new int [arr.length-1];
	    int idx = 0;
	    for(int i : arr){
	      if(i!=element){
	        newArr[idx] = i;
	        idx++;
	      }else{
	        break;
	      }
	    }for (int j = idx+1; j<arr.length; j++ ){
	      newArr[j-1] = arr[j];
	    }
	   return newArr;
	  }
	public String extraEnd(String str) {
		  return ( str.substring(str.length()-2) + str.substring(str.length()-2) +str.substring(str.length()-2));
		}
	public static int getDup(String[] r) 
	  {
		int result = 0;
	    for(int i = 0; i< r.length; i++){
	          int count = 0;
	          
	      for(int j = 0; j<r.length; j++ ){
	        if(r[i].equals(r[j])){
	          count++;
	          
	        }
	      }
	      if(count >1){
	            result+=count;
	          }
	    }
	    return result;
	    
	   
	  }
}
