package springAnnotation.runner;

import org.springframework.stereotype.Component;

@Component("helloWorldComponent")
public class HelloWorldComponent {

	public void sayHello() {
		System.out.println("jai shree ram");
	}
}
