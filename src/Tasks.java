import java.util.Scanner;

public class Tasks {
    public static void main(String[] a){
            // TASK 1
//        String firstName;
//        String lastName;
//        firstName = "Saad";
//        lastName = "Ahmad";
//        String name = firstName + lastName;
//        System.out.println(name);

            // TASK 2
//        int num1, num2;
//        num1 = 47;num2 = 3_000;
//        System.out.println(num1 + num2);
//
//        double result = (double)num2/(double)47;
//        System.out.println(result);
//
//        int num3 = 8;
//        System.out.println(num3++);//prints first, then increment
//        System.out.println(++num3);//first increments, then prints

            // TASK 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = sc.next();
        System.out.println("Please enter your last name: ");
        String lastName = sc.next();
        System.out.println("Welcome " + firstName + " " + lastName + " to my java Demo");

        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("The Sum is .. (drumroll) ... : " + result);
    }
}
