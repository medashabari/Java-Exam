public class PrintingOddValues
{
    public static void main(String[] args)
    {
        System.out.println("DAY 4 ASSIGNMENT 2");
    int[] odd = new int[] {5,11,12,43,99};
        System.out.println("Printing odd values");
        for(int i=0;i < odd.length;i++)
        {
            if (odd[i] % 2 != 0)
            {
                System.out.println(odd[i]);
            }
        }
    }
}

