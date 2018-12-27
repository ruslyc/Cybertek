package day_51AbstarctionPolymorphism;

public class Office {
	
	public static void main(String[] args) {
		
		Aeron aChair = new Aeron();
		aChair.sit();
		aChair.stepOnIt();
		
		Humanscale hChair = new Humanscale();
		hChair.sit();
		hChair.stepOnIt();
	}

}
