
public class HealthOffice extends PortOfficer {
	public HealthOffice() {
		
	}
	public void getInfo(Person person) {
		String name=person.getName();
		boolean PcrStatus=person.isPcrStatus();
		String specialConditions=person.getSpecialConditions();
		boolean HasFev=person.isHasFever();
		boolean HasCo=person.isHasCough();
		String Visited=person.getPlacesVisitedLast14Days();
		String allergies=person.getAllergies();
		System.out.println(name+" "+"reached the Health office"+"\n"+"Data viewed"+"\n"+"PCR Status:"+PcrStatus+"\n"+"Special conditions:"+specialConditions
				+"\n"+"Places visited in the last 14 days:"+Visited+"\n"+"Has Fever:"+HasFev+"\n"+"Has cough:"+HasCo
				+"\n"+"Medical Allergies: "+allergies);
	}
	
}
