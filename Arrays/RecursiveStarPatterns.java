public class RecursiveStarPatterns
{
    static void printSpaces(int n) 
    {
        if (n <= 0) 
            return;
        System.out.print("  "); 
        printSpaces(n - 1);
    }
    
    static void printStars(int n)
    {
        if (n <= 0) 
            return;
        System.out.print("* ");
        printStars(n - 1);
    }
    
    static void patternLeftAlignedTriangle(int n) 
    {
        if (n == 0) 
            return; 
        patternLeftAlignedTriangle(n - 1);
        printStars(n);
        System.out.println();
    }

    static void patternRightAlignedTriangle(int n, int total) {
        if (n == 0) 
            return; 
        patternRightAlignedTriangle(n - 1, total);
        printSpaces(total - n);
        printStars(n);
        System.out.println();
    }
    static void patternInvertedTriangle(int n) {
        if (n <= 0) 
            return;
        printStars(n);
        System.out.println();
        patternInvertedTriangle(n - 1);
    }
    static void patternPyramid(int n, int current) {
        if (current > n) 
            return;
        printSpaces(n - current);
        printStars(2 * current - 1);
        System.out.println();
        patternPyramid(n, current + 1);
    }
    public static void main(String[] args) {
        int n = 5; 
        System.out.println("\nPattern 1 :");
        patternPyramid(n, 1);
        System.out.println("\nPattern 2 :");
        patternRightAlignedTriangle(n, n);
        System.out.println("Pattern 3 :");
        patternLeftAlignedTriangle(n);
        System.out.println("\nPattern 4 :");
        patternInvertedTriangle(n);  
    }
}
