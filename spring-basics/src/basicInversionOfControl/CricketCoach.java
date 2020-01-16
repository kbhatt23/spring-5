package basicInversionOfControl;

public class CricketCoach implements Coach {
	private CricketHelloWorldService service;
	private String email;
	private String teamName;

	public CricketCoach() {
		System.out.println("cricket coach ke construtor ki shuruat");
	}
	@Override
	public void startTraining() {
		System.out.println("Starting training for team "+this.teamName);
		System.out.println("for any suggestion or advice please contact "+this.email);
		System.out.println("Cricket is lazy game, so no need to train");
		System.out.println("jai rama duta hanuman");
		service.process();
		
	}
	//setter injections
	//used for non mandatory things
	public void setFakeCricketServiceKing(CricketHelloWorldService crickservice) {
		System.out.println("cricket ke setter ka call");
		this.service = crickservice;
	}
	
	public void setEmailForCoach(String email) {
		this.email=email;
	}
	
	public void setTeamNameForCoach(String team) {
		this.teamName = team;
	}

}
