import java.util.Scanner;


public class Aug18two {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        if (num1 > num2) {
            System.out.println("Max Number is : " + num1);
        } else {
            System.out.println("Max Number is : " + num2);
        }



    }
}
