import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x==0 && y==0)
        {
            System.out.println("The point (x,y) is origin");
        }
            if(x>0 && y==0)
            {
                System.out.println("The point (x,y) is in x-axis");
            }
            if(x==0 && y>0)
            {
                System.out.println("The point (x,y) is in y-axis");
            }
            if(x>0 && y>0)
            {
                System.out.println("The point (x,y) is in First Quadrant");
            }
            if(x<0 && y>0)
            {
                System.out.println("The point (x,y) is in Second Quadrant");
            }
            if(x<0 && y<0)
            {
                System.out.println("The point (x,y) lies in Third Quadrant");
            }
            if(x>0 && y<0)
            {
                System.out.println("The point (x,y) is in Fourth Quadrant");
            }
        }
    }

 
