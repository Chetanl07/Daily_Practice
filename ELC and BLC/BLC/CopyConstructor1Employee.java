public class CopyConstructor1Employee {

    private int employeeId;
    private String employeeName;

    public CopyConstructor1Employee(int id,String name)
    {
        this.employeeId=id;
        this.employeeName=name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CopyConstructor1Employee{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", employeeName=").append(employeeName);
        sb.append('}');
        return sb.toString();
    }


    
}
