package springAnnotation.coachService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//use qualifier instead of primary
//@Primary
public class TrackService implements Service{

	@Override
	public void process() {
		System.out.println("runnign track service for sprint practise");
	}

}
