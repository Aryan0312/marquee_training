package Day7;
import java.util.Scanner;

public class RBAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();

        switch (role) {
            case "ADMIN":
                System.out.println("you are a admin");
                break;
            case "STUDENT":
                System.out.println("you are a admin");
                break;
            case "TEACHER":
                System.out.println("you are a admin");
                break;
            case "GUEST":
                System.out.println("you are a admin");
                break;
            default:
                System.err.println("unavailable role");
        }

    }
}
