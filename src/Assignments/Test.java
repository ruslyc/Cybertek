package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static String lameDb(String db, String op, String id, String data) {
		String[] arr = db.split("#");
		String[] values = new String[4];
		for (int i = 0; i < arr.length; i++) {
			values[i] = arr[i];
		}
		int idx = Integer.valueOf(id);
		if (op.equals("add")) {
			if (id != "4") {
				values[idx - 1] += data;
			} else {
				values[idx - 1] = id + data;
			}
		} else if (op.equals("edit")) {
			values[idx - 1] = values[idx - 1].replace(values[idx - 1], idx + data);
		} else if (op.equals("delete")) {
			values[idx - 1] = null;
		}
		String output = Arrays.toString(values);
		System.out.println(output);
		output = output.replace("[", "");
		output = output.replace("]", "");
		output = output.replace("null", "");
		output = output.replace(",", "");
		output = output.trim();
		output = output.replace(" ", "#");

		return output;
	}

	public static void main(String[] args) {
		
		int [] i = {1,5,3,8,5,0,7};
		System.out.println(Arrays.deepToString(stupidSort(i)));
		

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

	public static int[][] stupidSort(int[] i) 
	{	int count = 0;
	
		while(!isSorted(i)) 
		{
			shuffle(i);
			count++;
		}
		int[][] result = {{count},i};
		
		
		return result;
	}
	
public static int[] shuffle(int[] i) 
{
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
		return i;
	}//end shuffle
	
	private static boolean isSorted(int[] i) 
	{
		int count = 0;
		for (int j = 0; j < i.length-1; j++){ 
		    if (i[j] <= i[j + 1]) {
		        count++;
		    }
		}
		if (count == i.length-1){
			return true;
		}
		return false;
		}
	}//end isSorted
	

