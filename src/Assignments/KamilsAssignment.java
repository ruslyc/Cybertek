package Assignments;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KamilsAssignment {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList <>();
        int alice = 0;
        int bob = 0;
        for(int i =0; i<a.size(); i++){
            if((a.get(i)>=1 && a.get(i)<=100)&&(b.get(i)>=1 && b.get(i)<=100)){
            if(a.get(i)>b.get(i)){
                alice++;
            }else if(a.get(i)<b.get(i)){
                bob++;
            }
        }
        }
        result.add(alice);
        result.add(bob);
             return result;

    }


    public static void main(String[] args)  {
    	String s = "12:12:34PM";
    	String result = "";
        if(s.substring(s.length()-2).equalsIgnoreCase("am")){
            if(s.substring(0, 2).equals("12")){     
                result = "00" + s.substring(2, s.length()-2);
            }else{
                result = s.substring(0,s.length()-2);
            }
        }else if(s.substring(s.length()-2).equalsIgnoreCase("pm")){
            if(!s.substring(0, 2).equals("12")){     
                result = (Integer.parseInt(s.substring(0,2))+12) + s.substring(2, s.length()-2);
            }else{
                result = s.substring(0,s.length()-2);
            }
        }
    	System.out.println(result);
    	
    	
    	
    	
    	
    	
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        a.add(5);
        a.add(5);
        a.add(5);
        b.add(1);
        b.add(1);
        b.add(1);
        System.out.println(compareTriplets(a,b));
        System.out.println((double)10/3);
        int []arr = {-4, 3 ,-9, 0, 4, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        plusMinus(arr);
        
        int n =6;
        for(int i =0 ; i< n; i++){
            for(int j = 0; j<n; j++){
                if(j<n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        
    }
    static void plusMinus(int[] arr) {
        int neg = 0;
        int pos = 0;
        int zeros = 0;

        for(int i : arr){
            if(i>0){
                pos++;
            }else if(i<0){
                neg++;
            }else{
                zeros++;
            }
        }
        DecimalFormat numberFormat = new DecimalFormat("#.000000"); 
        
        System.out.println(numberFormat.format(pos/arr.length));
        System.out.println(numberFormat.format(neg/arr.length));
        System.out.println(numberFormat.format(zeros/arr.length));

     }
}

	

