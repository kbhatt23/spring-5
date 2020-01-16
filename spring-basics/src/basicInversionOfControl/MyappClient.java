package basicInversionOfControl;

public class MyappClient {
//strategy deisgn pattern
	private Coach coach;
	
	
	//dependency injection
	//can handle any coach at once
	public MyappClient(Coach coach) {
		this.coach = coach;
	}
	
	public void startCoachTraining() {
		coach.startTraining();
	}
}
