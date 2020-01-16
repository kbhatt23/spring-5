package basicInversionOfControl.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeServiceRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansContextScope.xml");
		ScopeServiceRunnerService runner=	context.getBean("scopeServiceRunnerService" , ScopeServiceRunnerService.class);
		
		ScopeService2 scope2=	context.getBean("scopeService2" , ScopeService2.class);
		
		ScopeService1 scope1=	context.getBean("scopeService1" , ScopeService1.class);
		
		scope2.setPropertyVal("jai shree ram scope2");
		scope1.setPropertyVal("jai shree ram scope1");
		System.out.println("main service 1 hashcode memory "+scope1);

		System.out.println("main service 2 hashcode memory "+scope2);
		
		runner.testScopeBeans();
		runner.printScopeVals();
		
		context.close();
	}
}
