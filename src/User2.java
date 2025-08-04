import java.util.Scanner;

public class User2 {

    static int user2Row, user2Col;

    public static void input(Scanner in) {

        do {
            try {
                System.out.print("\nUser 2 (O) >> ");
                user2Row = in.nextInt();
                user2Col = in.nextInt();

                if ((user2Row > 3 || user2Col > 3) || (user2Row < 1 || user2Col < 1))
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("You entered invalid parameters");
            }
        } while (true);
    }
}
