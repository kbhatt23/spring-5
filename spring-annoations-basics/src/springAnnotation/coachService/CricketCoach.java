package springAnnotation.coachService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//bean id
@Component("sitaRam")
public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("calling cricketcoach constructor");
	}
	
	private Service service;
	
	@Value("${cricket.coach.name}")
	private String coachName;

	//setter based depdency injection
	@Autowired
	//not neccessary to be setter any function name can be used
	//public void serService(Service service) {
	
	public void addSetterToAnyService(@Qualifier("trackService")Service service) {
		System.out.println("custom function autowiring");
		this.service = service;
	}
	@Override
	public void startTraining() {
		System.out.println("cricket training started by "+coachName);
		System.out.println("say jai shree ram");
		System.out.println("start bowling for an hour");
		System.out.println("start batting an hour");
		service.process();
		System.out.println("cricket training completed");
	}

}
