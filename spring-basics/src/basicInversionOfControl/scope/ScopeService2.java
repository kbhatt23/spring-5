package basicInversionOfControl.scope;

public class ScopeService2 {
	private String propertyVal = "init value";
	
public ScopeService2() {
	System.out.println("ScopeService2: calling construcot for scope2");
}
	public String getPropertyVal() {
		return propertyVal;
	}


	public void setPropertyVal(String propertyVal) {
		this.propertyVal = propertyVal;
	}


	public void testScope2() {
		System.out.println("jai shree ram from scope2");
	}
	//init method
	public void initMethod() {
		System.out.println("ScopeService2: Calling init methode for scop2");
		
	}
	
	//destroy method
	public void destryMethod() {
		System.out.println("ScopeService2: Calling destroy methode for scop2");
	}

}
