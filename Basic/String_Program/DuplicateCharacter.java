import java.util.Scanner;
public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char []arr=str.toCharArray();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate Character is : "+arr[j]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("total number of duplicate ccharacters are :"+count);
    sc.close();
    
    }
    
}
