import java.util.Scanner;

public class User1 {

    static int user1Row, user1Col;

    public static void input(Scanner in) {

        do {
            try {
                System.out.print("\nUser 1 (X) >> ");
                user1Row = in.nextInt();
                user1Col = in.nextInt();

                if ((user1Row > 3 || user1Col > 3) || (user1Row < 1 || user1Col < 1))
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("You gave invalid parameters");
            }
        } while (true);

    }
}
