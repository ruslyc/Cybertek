package day_51AbstarctionPolymorphism;

public class Aeron extends Chair implements Rollable{

	@Override
	void sit() {
		System.out.println("Sitting on Aeron chair");
		
	}

	@Override
	void stepOnIt() {
		System.out.println("Stepping on Aeron chair");
		
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollForward() {
		// TODO Auto-generated method stub
		
	}
	
	

}
