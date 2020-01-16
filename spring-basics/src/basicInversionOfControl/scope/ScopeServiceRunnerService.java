package basicInversionOfControl.scope;

public class ScopeServiceRunnerService {
	//singleton
	private ScopeService1 service1;
	
	//prototype
	private ScopeService2 service2;
	
	public ScopeServiceRunnerService(ScopeService1 svc1,ScopeService2 svc2){
		this.service1 =svc1;
		this.service2=svc2;
	}
	public void testScopeBeans() {
		System.out.println("service 1 hashcode memory "+service1);
		
		System.out.println("service 2 hashcode memory "+service2);
		
	}
	
	public void printScopeVals() {
		System.out.println("print scope proeprty val for scop1 "+service1.getPropertyVal());
		
		System.out.println("print scope proeprty val for scop2 "+service2.getPropertyVal());
	}

}
