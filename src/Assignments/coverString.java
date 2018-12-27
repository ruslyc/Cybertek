package Assignments;


public class coverString {
	public static void main(String[] args) {
		System.out.println(coverString("cocococococococo", "co"));	

	}

	public static String coverString(String main, String coverME) {
		int idx = 0;
		int count = 0;
		while (idx != -1) {
			idx = main.indexOf(coverME, idx);
			if (idx != -1) {
				idx += coverME.length();
				count++;
			}
		}
		if(count!=0) {
		idx = 0;
		for (int i = 0; i < count; i++) {
			idx = main.indexOf(coverME, idx);
			main = main.substring(0, idx) + "[" + main.substring(idx, idx + coverME.length()) + "]"	+ main.substring(idx + coverME.length());
			idx += coverME.length() + 1;
		}
		}else {
			main = "[" + main + "]";
		}

		return main;
		
	}
}
