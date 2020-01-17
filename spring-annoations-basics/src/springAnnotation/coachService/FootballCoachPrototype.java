package springAnnotation.coachService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoachPrototype implements Coach {
	//construcotr dependency injection
	//instead of calling this construcotr from xml: tag was const-arg, we can use autowiured
	private Service service;
	
	@Value("${football.coach.name}")
	private String coachName;
	
	//constuotr dependecy injection
	//works with and without @autowired for constructor depedency
	@Autowired
	public FootballCoachPrototype(@Qualifier("gymService")Service service) {
		this.service=service;
	}

	@Override
	public void startTraining() {

		System.out.println("football trating started by "+coachName);
		System.out.println("start running 1 hour");
		System.out.println("do rondos for 1 hour");
		System.out.println("quick passing with one touches for 1 hour");
		System.out.println("long shooting and passing for 1 hour");
		service.process();
		System.out.println("football training over");
	}

	
}
