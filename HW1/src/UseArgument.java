import java.util.Scanner;
public class UseArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("Hi, "+name+". How are you?");
    }
}