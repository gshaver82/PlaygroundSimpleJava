package organisms;

public class cat extends animal {
    public static int legs = 4;

    public void grow() {
        System.out.println("kitten grows into cat");
    }

    @Override
    protected void move() {
        System.out.println("This cat runs");
    }
}
