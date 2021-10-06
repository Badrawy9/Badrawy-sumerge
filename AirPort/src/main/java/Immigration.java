
public class Immigration extends TestConductor{
	public Immigration() {
		
	}
	public void getInfo(Person person) {
		String name=person.getName();
		boolean PcrStatus=person.isPcrStatus();
		String specialConditions=person.getSpecialConditions();
		String Visited=person.getPlacesVisitedLast14Days();
		System.out.println(name+" "+"has reached the Immigration Officer"+"\n"+"Data Viewed"+"\n"+"PCR Status:"+ PcrStatus 
				+"\n"+"Special Condition: "+ specialConditions+"\n"+"Places visited in the last 14 days"+ Visited);
	}
}
