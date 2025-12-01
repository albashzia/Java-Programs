public class TheatreSeatingCounter 
{
    public static void main(String[] args) 
    {
        int totalAvailable = 0;
        int theatre[][] = {
                           {1,0,0,1,1,1,1,0,0,1},
                           {1,1,0,1,0,1,0,0,0,1},
                           {1,1,1,0,0,0,1,1,1,1},
                           {1,0,0,0,1,1,1,0,1,0},
                           {0,0,1,1,0,1,1,0,0,1}
                          };
        for(int i = 0; i < theatre.length; i++)
        {
            int availableInRow = 0;
            for(int j = 0; j < theatre[0].length;j++)
            {
                if(theatre[i][j]==0)
                {
                    availableInRow++;
                }  
            }
            totalAvailable+=availableInRow;
            System.out.println("The seats available in row "+(i+1)+" are "+availableInRow);
        }
        System.out.println("The total available seats are "+totalAvailable);
    }
}
