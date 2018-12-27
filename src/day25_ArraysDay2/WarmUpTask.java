package day25_ArraysDay2;

public class WarmUpTask {
	public static void main(String[] args) {
		
		String[] kitchenItems = new String[] {"Knife", "wooden spoons", "plates", "cups", "forks", "pan","pot","trash can","fridge ","dishwasher" };
		
		for(String item:kitchenItems) {
			switch(item.toLowerCase().trim()){
			
			case "knife":
				System.out.println(kitchenItems[0]+" is used to cut food");
				break;
			case "wooden spoons":
				System.out.println(kitchenItems[1]+" is used to eat food");
				break;
			case "plates":
				System.out.println(kitchenItems[2]+" is used to eat food from");
				break;
			case "cups":
				System.out.println(kitchenItems[3]+" is used to drink beverages from");
				break;
			case "forks":
				System.out.println(kitchenItems[4]+" is used to eat food with");
				break;
			case "pan":
				System.out.println(kitchenItems[5]+" is used to fry food on");
				break;
			case "pot":
				System.out.println(kitchenItems[6]+" is used to boil food");
				break;
			case "trashcan":
				System.out.println(kitchenItems[7]+" is used to store trash");
				break;
			case "fridge":
				System.out.println(kitchenItems[8]+" is used to keep fresh food");
				break;
			case "dishwasher":
				System.out.println(kitchenItems[9]+" is used to wash dirty dishes");
				break;
			}
		}
	}

}
