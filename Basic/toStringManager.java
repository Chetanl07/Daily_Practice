package Basic;

public class toStringManager {
	public static void main(String []args)
	{
		managerInfo m1=new managerInfo(101, "smith", 50000);
		System.out.println(m1);
	
		
	}

}

class managerInfo
{
	public int managerId;
	private String managerName;
	private double managerSalary;
	
	public managerInfo(int managerId, String managerName, double managerSalary) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerSalary = managerSalary;
	}

	@Override
	public String toString() {
		return "managerInfo [managerId=" + managerId + ", managerName=" + managerName + ", managerSalary="
				+ managerSalary + "]";
	}
	
	
	
	
}
