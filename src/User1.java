import java.util.Scanner;

public class User1 {

    static int user1Row, user1Col;

    public static void input(Scanner in) {

        try {
            System.out.print("\nUser 1 (X) >> ");
            user1Row = in.nextInt();
            user1Col = in.nextInt();
        } catch (Exception e) {
            System.out.println("You gave invalid parameters");
        }

    }
}
