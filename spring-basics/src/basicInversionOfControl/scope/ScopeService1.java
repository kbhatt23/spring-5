package basicInversionOfControl.scope;

public class ScopeService1 {
	
	public ScopeService1() {
		System.out.println("ScopeService1: calling construcot for scope1");
	}
	private String propertyVal = "init value";
	public String getPropertyVal() {
		return propertyVal;
	}
	public void setPropertyVal(String propertyVal) {
		this.propertyVal = propertyVal;
	}
	public void testScope1() {
		System.out.println("jai shree ram from scope1");
	}
	
	//init method
	public void initMethod() {
		System.out.println("ScopeService1: Calling init methode for scop1");
		
	}
	
	//destroy method
	public void destryMethod() {
		System.out.println("ScopeService1 Calling destroy methode for scop1");
	}
	

}
