
import java.util.Scanner;

class A027_task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find the Distance travlled give the following data:");
        System.out.println("initial velocity(u):");
        int u = sc.nextInt();
        System.out.println("Accelaration(a):");
        int a = sc.nextInt();
        System.out.println("Time(t): ");
        int t = sc.nextInt();
        int d = u * t + (a * t * t) / 2;
        System.out.println("The distance travelled is: "+d+" m.");

    }
}