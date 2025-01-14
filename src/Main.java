import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //phase 1
        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 2; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //phase 2
        int max = 3;
        char pound = '#';//char single ' strings "
        for (int i = 1; i <= max; i++) {
            System.out.println();
            for (int j = 1; j <= max - i; j++) {//start
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(pound);
            }
            System.out.print("  "); //middle
            for (int j = 1; j <= i; j++) {//end
                System.out.print(pound);
            }
        }
        System.out.println();
        //phase 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("what should i say?: ");
        String text = scanner.nextLine();
        System.out.println(text);
        scanner.close();
    }
}