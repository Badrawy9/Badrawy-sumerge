
public class Person {
	
	private int Id;
	private String Name;
	private String PlacesVisitedLast14Days;
	private boolean HasFever;
	private boolean HasCough;
	private boolean PcrStatus;
	private String SpecialConditions;
	private String Allergies;
	
	public Person(int Id, String Name,String PlacesVisitedLast14Days, boolean HasFever,boolean HasCough, boolean PcrStatus, String SpecialConditions, String Allergies){
		this.Id=Id;
		this.Name=Name;
		this.PlacesVisitedLast14Days=PlacesVisitedLast14Days;
		this.HasFever=HasFever;
		this.HasCough=HasCough;
		this.PcrStatus=PcrStatus;
		this.SpecialConditions=SpecialConditions;
		this.Allergies=Allergies;
	}
	public Person() {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPlacesVisitedLast14Days() {
		return PlacesVisitedLast14Days;
	}

	public void setPlacesVisitedLast14Days(String placesVisitedLast14Days) {
		PlacesVisitedLast14Days = placesVisitedLast14Days;
	}

	public boolean isHasFever() {
		return HasFever;
	}

	public void setHasFever(boolean hasFever) {
		HasFever = hasFever;
	}

	public boolean isHasCough() {
		return HasCough;
	}

	public void setHasCough(boolean hasCough) {
		HasCough = hasCough;
	}

	public boolean isPcrStatus() {
		return PcrStatus;
	}

	public void setPcrStatus(boolean pcrStatus) {
		PcrStatus = pcrStatus;
	}

	public String getSpecialConditions() {
		return SpecialConditions;
	}

	public void setSpecialConditions(String specialConditions) {
		SpecialConditions = specialConditions;
	}

	public String getAllergies() {
		return Allergies;
	}

	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	
	public static void main(String[] args) {
		Person p1=new Person(99,"Hussein","UK",true,false,false,"None","Peanuts");
		PortOfficer po1=new PortOfficer();
		po1.getInfo(p1);
		HealthOffice h1=new HealthOffice();
		h1.getInfo(p1);
		TestConductor t1=new TestConductor();
		if(p1.HasFever==true) {
			t1.getInfo(p1);
		}
		Immigration i1=new Immigration();
		i1.getInfo(p1);
		
	}
	

}
