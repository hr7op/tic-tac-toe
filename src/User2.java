import java.util.Scanner;
public class User2 {

    static int user2Row, user2Col;

    public static void input(Scanner in) {

        try{
            System.out.print("\nUser 2 (O) >> ");
            user2Row = in.nextInt();
            user2Col = in.nextInt();
        }catch(Exception e){
            System.out.println("You entered invalid parameters");
        }
    }
}
