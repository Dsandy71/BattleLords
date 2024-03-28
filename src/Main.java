import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        showMenu();
    }

    public static void showMenu()
    {
        // Welcome msg w/ username input
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!\n--------\nCreate username: ");
        String n = sc.nextLine();

        // Create player object w/ correct parameters
        Player p;
        if (n.length() < 1)
        {
            p = new Player();
        }
        else
        {
            p = new Player(n, "unranked", 5);
        }

        System.out.println(p.toString());

    }
}
