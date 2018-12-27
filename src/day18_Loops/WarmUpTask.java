package day18_Loops;

public class WarmUpTask {

	public static void main(String[] args) {

		String smsMessage = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

		String sender, phoneNumber, message;

		smsMessage.indexOf("Mike");
		smsMessage.indexOf("202-123-3456");
		smsMessage.indexOf("I love programing and problem solving");

		System.out.println(smsMessage.substring(smsMessage.indexOf("<") + 1, smsMessage.indexOf(">")));
		System.out.println(smsMessage.substring(smsMessage.indexOf("[") + 1, smsMessage.indexOf("]")));
		System.out.println(smsMessage.substring(smsMessage.indexOf("{") + 1, smsMessage.indexOf("}")));

	}

}
