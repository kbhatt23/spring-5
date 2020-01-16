package basicInversionOfControl;

public class MyApp {

	public static void main(String[] args) {

		//old way- tightly couples
		BasketballCoach basketBallCoach = new BasketballCoach();
		basketBallCoach.startTraining();
		
		FootballCoachOld football = new FootballCoachOld();
		football.startTraining();
		
		//good way
		System.out.println("new way");
		MyappClient client = new MyappClient(basketBallCoach);
		client.startCoachTraining();
	}

}
