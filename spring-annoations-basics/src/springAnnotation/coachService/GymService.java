package springAnnotation.coachService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//commenting as of now
@Component
//@Primary
public class GymService implements Service {

	@Override
	public void process() {

		System.out.println("aquiring gym for muscle hypertrophy");
	}

}
