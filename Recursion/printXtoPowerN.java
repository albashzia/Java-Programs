package Recursion;
public class printXtoPowerN {
    public static int calcPower(int x, int n) 
    {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        return x*calcPower(x,n-1);
    }
    public static void main(String[] args) {
        int result = calcPower(2,5);
        System.out.println(result);
    }
}
