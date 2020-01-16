package basicInversionOfControl;

public class FootballCoach implements Coach {
	
	private HelloWorldService helloWorldService;
	
	public FootballCoach(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@Override
	public void startTraining() {

		System.out.println("started doing push ups");
		System.out.println("started doing burpies");
		System.out.println("started doing running");
		System.out.println("started doing passing and shooting");
		System.out.println("started doing rondos");
		helloWorldService.process();
	}

}
