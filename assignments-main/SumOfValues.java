import java.util.Scanner;
public class SumOfValues {
    public static void main(String[] args)
    {
        System.out.println("DAY 4 ASSIGNMENT 3");
        Scanner n = new Scanner(System.in);
        int[] num= new int[5];
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            System.out.println("Enter "+i+" Value :");
            num[i]=n.nextInt();
        }
        for(int j=0;j< num.length;j++)
        {
            sum=sum+num[j];
        }
        System.out.println("SUM OF ALL VALUES :"+sum);

    }

}
