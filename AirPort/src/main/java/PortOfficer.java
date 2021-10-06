
public class PortOfficer extends Person  {
	
	public PortOfficer(){
	}
	
	public void getInfo(Person person) {
		String name=person.getName();
		boolean PcrStatus=person.isPcrStatus();
		String specialConditions=person.getSpecialConditions();
		System.out.println(name+" "+"reached the port officer"+"\n"+"Data viewed"+"\n"+"PCR Status:"+PcrStatus+"\n"+"Special conditions:"+specialConditions);
	}
}
