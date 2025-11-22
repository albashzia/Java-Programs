import java.util.Scanner;
public class ArrayMerger
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in list 1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter the number of elements in list 2 : ");
        int n2 = input.nextInt();
        int[] list1 = new int[n1];
        int[] list2 = new int[n2];
        int mergedList[] = new int[n1+n2];
        System.out.println("Enter the "+n1+" elements for list 1: ");
        for(int i = 0 ; i < n1; i ++)
        {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter the "+n2+" elements for list 2: ");
        for(int j = 0 ; j < n2; j ++)
        {
            list2[j] = input.nextInt();
        }
        for(int k = 0; k < n1; k++)
        {
            mergedList[k] = list1[k];
        }
        for(int m = 0; m < n2 ;m++)
        {
            mergedList[n1+m] = list2[m];
        }
        System.out.print("The merged list is : ");
        for(int l = 0; l < mergedList.length;l++)
        {
            System.out.print(mergedList[l]+" ");
        }
        input.close();
    }
}
