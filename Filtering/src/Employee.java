
public class Employee {
	String title;
	String name;
	String mobile;
	
	
	public Employee(String title, String name, String mobile) {
		this.title=title;
		this.name=name;
		this.mobile=mobile;
	}
	public String toString() {
        return "[" + title + " " + name + " " +mobile +"]";
    }


	public String getTitle() {
		return title;
	}


	public String getName() {
		return name;
	}


	public String getMobile() {
		return mobile;
	}
	
}
