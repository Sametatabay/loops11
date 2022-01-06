import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min=0, max=0;

        System.out.print("How Many Enter is Number: ");
        int n = input.nextInt();

        System.out.println("User " + n+ " number want.");

        for(int i=1; i<=n; i++){
            System.out.println(i+"." + "Number Enter: ");
            int number = input.nextInt();

            if (i==1){
                max=number;
                min=number;
            }
            if (number>max)
                max=number;

            if (number<min)
                min=number;
        }
        System.out.println("Input" + n + "number for the biggest: " + max);
        System.out.println("Input" + n + "number for smallest : " + min);
    }
}
