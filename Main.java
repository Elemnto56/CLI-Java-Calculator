class Cake {
    public static String cakeMaker() {
        return "Cake Made";
    }
}

public class Main {
    public static void main(String[] args) {
        Cake myObj = new Cake();
        System.out.println("Hello World");
        System.out.println(Cake.cakeMaker());
        System.out.println("This changed");
    }
}

