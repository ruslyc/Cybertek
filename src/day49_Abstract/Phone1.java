package day49_Abstract;



public interface Phone1 {
	
	public void emitSignal();

}




//public BigInteger add(BigInteger b) {
//
//	String str1 = "";
//	String str2 = "";
//	if (this.sign == POSITIVE) {
//		for (int i : this.number) {
//			str1 += i;
//		}
//	} else {
//		str1 = "-";
//		for (int i : this.number) {
//			str1 += i;
//		}
//
//	}
//	if (b.sign == POSITIVE) {
//		for (int i : b.number) {
//			str2 += i;
//		}
//	} else {
//		str2 = "-";
//		for (int i : b.number) {
//			str2 += i;
//		}
//
//	}
//
//	double num1 = Double.parseDouble(str1);
//	double num2 = Double.parseDouble(str2);
//	double result = num1 + num2;
//	
//	if (result<=999999999999999.0) {
//	String res = String.format ("%.0f", result);
//	BigInteger a = new BigInteger(res);
//	return a;
//	}else {
//		double res1 = result%1000000000000000.0;
//		double res2 = result/1000000000000000.0;
//		String resone = String.format ("%.0f", res1);
//		String restwo = String.format ("%.0f", res2);
//		String res = resone + restwo;
//		BigInteger a = new BigInteger(res);
//		return a;
//	}
//}




