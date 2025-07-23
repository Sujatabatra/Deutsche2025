import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int location=-1;
        try {
            System.out.println("Enter First Number : ");
            int number1 = scanner.nextInt();
            System.out.println("Enter Second Number : ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;
            System.out.println("Division Result : " + result);

            int arr[];
            System.out.println("Enter Total number of elements in an array : ");
            int total=scanner.nextInt();
            arr=new int[total];

            for(int i=0;i<total;i++){
                arr[i]=10*i;
            }
            System.out.println("Enter location in an array to get the value : ");
            location=scanner.nextInt();
            System.out.println("Value at location "+location+" = "+arr[location]);
        }
        catch (ArithmeticException exception){
            System.out.println("Division By Zero is Undefined");
        }
        catch(InputMismatchException exception){
            System.out.println("Invalid Input, Please Try Again!");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Location "+location+" does not exist in an array");
        }
        catch(Exception exception){
            System.out.println("Something went wrong, please try again!");
        }
        System.out.println("Good Bye from main()!");
    }
}