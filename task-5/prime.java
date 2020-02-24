import java.util.*; 

class prime{

    public static void main(String[] args) {

        int num,i;
        int result;
        boolean flag=true;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: "); 
        num = sc.nextInt();

        
        for(i=2; i< (num-1); i++)
        {
            result = num % i;

            if (result == 0)
            {
                System.out.println("Not a prime number");
                flag=false;
                break;
            }
            else
            {
                continue;
            }
        }

        
        if (flag==true)
        {
            System.out.println(num+" is a prime number.");
        }

        

        

    }
}