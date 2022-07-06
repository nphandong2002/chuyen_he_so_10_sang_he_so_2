import java.util.Scanner;

public class progam {
    public static String  chuyen(int n ){
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n%2);
            n = n/2;


        }
        return sb.reverse().toString();

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + chuyen(number));
    }
}
