
import java.util.Scanner;


class A027_task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the annual Depreciation: ");
        float depreciation = sc.nextFloat();
        System.out.println("Enter the Purchase Price:");
        float pp = sc.nextFloat();
        System.out.println("Enter the Years of Service");
        float yos = sc.nextFloat();
        float sv = pp -(depreciation * yos); //Salvage value

        System.out.println("The Salvage value is: "+sv);

    }
}