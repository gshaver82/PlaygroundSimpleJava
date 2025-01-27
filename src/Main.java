import organisms.*;

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
//        int max = 3;
//        char pound = '#';//char single ' strings "
//        for (int i = 1; i <= max; i++) {
//            System.out.println();
//            for (int j = 1; j <= max - i; j++) {//start
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(pound);
//            }
//            System.out.print("  "); //middle
//            for (int j = 1; j <= i; j++) {//end
//                System.out.print(pound);
//            }
//        }
//        System.out.println();
//        //phase 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("what should i say?: ");
//        String text = scanner.nextLine();
//        //scanner.nextLine();//this will catch the end line \n for anything else afterwards that might accidentally get it only needed after INT input
//        System.out.println(text);
//        scanner.close();
        //phase4
        //fizzbuzznolook

        System.out.println("Method1-----------------");
        for (int i = 1; i <= 40; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Method2-----------------");
        for (int i = 1; i <= 40; i++) {
            String output = "";
//            String output = String.valueOf(i);
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }
            System.out.println(output.equals("") ? i : output);
        }
        //phase4
        String[] PCparts = {"GPU", "CPU", "RAM"};
        System.out.print("----------\n");
        for (String part : PCparts) {
            System.out.println(part);
        }
        String z = "t";
        String x = "ca" + z;
        String y = "cat";
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println("----------------------------");
        System.out.println("this begins access modifiers section");
        System.out.println(cat.legs);
        cat.grow();
        maineCoon myPet = new maineCoon();
        myPet.move();
//        cat my2ndPet = new cat();
//        my2ndPet.move(); //not allowed, it implements a protected method outside the package AND outside the subclass
        customCat pixie = new customCat("jumping playfully", "pixie");
        pixie.move();
        customCat max = new customCat("jumping playfully", "max", "grey");
        max.move();

    }

}

class maineCoon extends cat {
    @Override
    protected void move() {
        System.out.println("The maine coon gracefully walks");
    }
}

class customCat extends cat {
    private final String movement;
    private final String name;
    private String color;

    @Override
    protected void move() {
        System.out.println("Your " + (color != null ? color + " " : "") + "cat named " + name + " moves by " + movement);
    }


    customCat(String movement, String name) {
        this.movement = movement;
        this.name = name;
    }

    customCat(String movement, String name, String color) {
        this.movement = movement;
        this.name = name;
        this.color = color;
    }
}