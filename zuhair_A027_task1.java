
import java.util.Scanner;

class zuhair_A027{
    public static void main(String[] args) {
        int firstnumber,secondnumber,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one: ");
        firstnumber = sc.nextInt();
        System.out.println("Enter number two: ");
        secondnumber = sc.nextInt();

        sum = firstnumber + secondnumber;

        System.out.println("Sum of "+firstnumber+" and "+secondnumber+" is "+sum);
    }
}