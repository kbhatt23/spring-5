package springAnnotation.coachService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//basket ball have more than one coach
//so we cna take that from file generated as per todays report
//take name from file
public class BasketballCoach implements Coach {
	
	//field type depoendcy injection
	//easiest to me
	@Autowired
	@Qualifier("waterSpaService")
	private WaterSpaService service;
	
	public BasketballCoach() {
		System.out.println("BasketballCoach: calling the no arg constructor");
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("BasketballCoach:calling the file to fetch todays coach name");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.coachcName= "raghav das hanuman";
	}
	
	//@Value("${basketball.coach.name}")
	//instead we take value from file in init function
	private String coachcName;
	@Override
	public void startTraining() {

		System.out.println("basketball coaching started by "+coachcName);
		System.out.println("do 100 burpies");
		System.out.println("do basket for 2 hours");
		service.process();
		System.out.println("basketball trainign completed");
		
	}

}
