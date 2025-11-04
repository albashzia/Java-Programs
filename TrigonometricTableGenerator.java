public class TrigonometricTableGenerator 
{    
    public static void main(String[] args) 
    { 
        // Display the header of the table using System.out.printf() 
        System.out.printf("%10s %10s %10s %10s %10s","Degree","Radian","Sine","Cosine","Tangent");
        System.out.println("");
        int degrees = 30; 
        double radians = Math.toRadians(degrees); 
        double sin = Math.sin(radians); 
        double cos = Math.cos(radians); 
        double tan = Math.tan(radians); 
        System.out.printf("%10d %10.4f %10.4f %10.4f %10.4f", degrees,radians,sin,cos,tan);
        System.out.println("");
        // Display the Data of the table using System.out.printf()     
        degrees = 60; 
        radians = Math.toRadians(degrees); 
        sin = Math.sin(radians); 
        cos = Math.cos(radians); 
        tan = Math.tan(radians); 
        // Display the Data of the table using System.out.printf() 
        System.out.printf("%10d %10.4f %10.4f %10.4f %10.4f", degrees,radians,sin,cos,tan);
        System.out.println("");
    } 
}