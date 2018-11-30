
public class Simpsons {

    static String start[] = {"Simpsons in Cave", "Lisa Trapped with Burns", "Burns at Moe's", "Moe with Edna", "Edna in School"};
    static String end[] = {"Simspons leave cave", "Lisa takes picture with Burns", "Burns gets gold", "Moe puts gold in machine", "Edna stays on as teacher"};

    public static void main(String[] args) {
        story(4);
    }

    public static void story(int n) {
        System.out.println(start[n]);
        if (n < 4) {
            story(n + 1);
        }
        System.out.println(end[n]);
    }
}
