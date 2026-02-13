import java.util.Scanner;

public class DivisionHandling {

        public static void main(String args[]){

                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int d;

                try{
                        d= a/b;
                        System.out.println(d);
                }

                catch(ArithmeticException e){
                        System.out.println("Divide by zero error");
                }
                sc.close();
        }
        
}
