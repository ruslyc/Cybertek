package assignmentsEsen;


import java.util.Arrays;

import day45.OnlineStudent;

public class ZombieAttackTwo  {
	
	public static void main(String[] args) {
		
		int [] arr  = {0,1,1,0,4,0,6,7,8};
		int sum = 1;
		int count = 0;
		System.out.println("Day " + count + Arrays.toString(arr));
	while(sum>0) {
		sum = 0;
		for(int i = 0; i < arr.length; i++ ) {
			
//			if(i!=0 && i != arr.length-1){
//				if(arr[i-1]==0 || arr[i+1]==0) {
//					arr[i]/=2;
//					
//					sum+=arr[i];
//				}
//			}else if(i==0) {
//				if(arr[1]==0) {
//					arr[0]/=2;
//					sum+=arr[i];
//				}
//			}else if(i==arr.length-1) {
//				if(arr[i-1]==0) {
//					arr[i]/=2;
//					sum+=arr[i];
//				}
//			}
//			
			
			
			if(arr[i]==0) {
				arr[i+1]/=2;
				i++;
				sum+=arr[i];
			}
			if(arr[i+1]==0) {
				arr[i]/=2;
				sum+=arr[i];
			}
//			
		}count++;
		System.out.println("Day " + count+ Arrays.toString(arr));
	}
		
	}
		
	}
	
	
	
