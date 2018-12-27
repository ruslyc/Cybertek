package day_51AbstarctionPolymorphism;

public class Humanscale extends Chair implements Collapsible,Rollable {
	@Override
	void sit() {
		System.out.println("Sitting on Humanscale chair");
		
	}

	@Override
	void stepOnIt() {
		System.out.println("Stepping on Humanscale chair");
		
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollForward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fold() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unfold() {
		// TODO Auto-generated method stub
		
	}
}
