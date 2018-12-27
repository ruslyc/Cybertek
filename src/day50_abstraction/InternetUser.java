package day50_abstraction;

public class InternetUser {
	
	public static void main(String[] args) {
		
		Chrome chrome = new Chrome(512);
		
		chrome.version = "68.08";
		
		chrome.launchBrowser();
		
		chrome.addTab("google.com");
		
		chrome.addTab("amazon.com");
		
		chrome.printInfo();
		
		chrome.closeTab("amazon.com");
		
		chrome.printInfo();
		
		chrome.addTab("etsy.com");
		
	//	chrome.addTab("bestbuy.com");
		
		chrome.seeAllUrls();
		
		chrome.changeTab("etsy.com");
		chrome.printInfo();
		chrome.closeTab("etsy.com");
		chrome.printInfo();
		chrome.seeAllUrls();
		
	}

}
