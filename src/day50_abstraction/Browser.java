package day50_abstraction;

import java.util.List;

public abstract class Browser {
	
	public String version, focusedUrl;
	
	public int memory;
	
	List <String> urls;
	
	boolean browserLaunched, windowMaximized;
	
	public abstract void launchBrowser();
	public abstract void closeBrowser();
	public abstract void addTab(String url);
	public abstract boolean closeTab(String url);
	public abstract void changeTab(String url);
	
	public void maximizeWindow() {
		System.out.println("Browser is maximized");
		windowMaximized = true;
	}
	
	public void printInfo() {
		System.out.println('\n' + " CURRENT BROWSER INFO " + '\n');
		System.out.println("Browser version: "+ version);
		System.out.println("Available memory: "+ memory);
		System.out.println("Window maximized: "+ windowMaximized);
		System.out.println("Current URL: "+ focusedUrl);
		System.out.println("Total open tabs: "+ urls.size());
	}
	
	public  void seeAllUrls() {
		int count = 1;
		for(String s : urls) {
			System.out.println("URL - "+ count + ": "+s );
			count++;
		}
	}
	
	
	

}
