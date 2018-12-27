package day50_abstraction;

import java.util.ArrayList;
import java.util.List;

public class Chrome extends Browser implements Extensions{
	
	public Chrome(int memory) {
		this.memory = memory;
		urls = new ArrayList<>();
	}
	
	

	@Override
	public void launchBrowser() {
		
		if(browserLaunched==true) {
			System.out.println("Chrome browser is already launched");
		}else {
			System.out.println("Chrome browser is launching");
		}
		memory-=50;
		browserLaunched=true;
		
	}

	@Override
	public void closeBrowser() {
		if(browserLaunched == true) {
			System.out.println("Closing Chrome browser. All tabs are closing ");
			memory = memory + 50 + 25*urls.size();
			urls.clear();
			focusedUrl =null;
			browserLaunched = false;
		}else {
			System.out.println("Chrome browser was not launched");
		}
		
		
	}

	@Override
	public void addTab(String url) {
		if(browserLaunched==true) {
			if(memory>=25) {
				System.out.println("Chrome browser adding new tab: " + url);
				urls.add(url);
				focusedUrl = url;
				memory-=25;
			}else {
				System.out.println("Sorry Chrome browser is out of memory");
			}
		}else {
			System.out.println("Chrome browser is not launched yet. \r\n" + 
					"Please launch the browser first");
		}
		
	}


	@Override
	public boolean closeTab(String url) {
		for(String s : urls) {
			if(s.equals(url)) {
				urls.remove(url);
				memory +=25;
				if(url.equals(focusedUrl)&&urls.size()>=1) {
					focusedUrl = urls.get(0);
				} 
				return true;
			}
		}
		System.out.println("Tab with: " + url + " was not found within open tabs");
		return false;
	}

	@Override
	public void changeTab(String url) {
		for(String s : urls) {
			if(s.equals(url)) {
			focusedUrl = url;
			System.out.println("Tab changed to URL: " + url);
			return;
			}
			}
		System.out.println("URL: " + url +"was not found within open tabs");
		
	}

	public void addExtension(String extension) {
		System.out.println("Adding the extension "+extension);
		
	}

	public void removeExtension(String extension) {
		System.out.println("Removing the extension "+extension);
		
	}

	public void runExtension(String extension) {
		System.out.println("Running the extension "+extension);
		
	}

	
	

}
