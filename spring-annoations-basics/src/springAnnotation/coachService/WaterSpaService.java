package springAnnotation.coachService;

import org.springframework.stereotype.Component;

@Component
public class WaterSpaService implements Service{

	@Override
	public void process() {

		System.out.println("relaxing using spa service for recovery");
	}

}
