import java.util.Scanner;
class PronicNumber
{
        public static void main(String args[]) 
       {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the Number: ");
           int num = sc.nextInt();
           int res = 0;
           
          for(int i=0;i<num;i++)
          {
                    if(i*(i+1) == num)
                    { 
                             res =1;
                             break;
                    }
           }
          
         if(res == 1)
                    System.out.println("This number is Pronic Number");
            else
                     System.out.println("This number is Not Pronic Number");
       } 

}