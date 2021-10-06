
public class TestConductor extends HealthOffice {
	public TestConductor(){
	}
	
	public void getInfo(Person person) {
		String name=person.getName();
		person.setPcrStatus(true);
		boolean HasFev=person.isHasFever();
		boolean HasCo=person.isHasCough();
		System.out.println(name+" "+"Took a PCR test at the "+"\n"+"Data Viewed");
	}
}
