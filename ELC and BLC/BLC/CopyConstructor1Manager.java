public class CopyConstructor1Manager {
    private int managerId;
    private String managerName;

    public CopyConstructor1Manager(CopyConstructor1Employee e)
    {
        this.managerId=e.getEmployeeId();
        this.managerName=e.getEmployeeName();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CopyConstructor1Manager{");
        sb.append("managerId=").append(managerId);
        sb.append(", managerName=").append(managerName);
        sb.append('}');
        return sb.toString();
    }

    
    
}
