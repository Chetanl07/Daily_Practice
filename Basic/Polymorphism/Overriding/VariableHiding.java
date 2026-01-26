public class VariableHiding {
    public static void main(String[] args) {
        RBI rbi=new SBI();
        System.out.println(rbi.ifscCode+" : "+rbi.loan());
    }
    
}
class RBI 
{
    protected  String ifscCode="RBIHYD0001";
    public String loan()
    {
        return "provide the loan to customer";
    }
}

class SBI extends RBI{
protected  String ifscCode="SBIHYD0001";
@Override
public String loan()
{
    return "Providing loan @ 9.2% ROI";
}
}
