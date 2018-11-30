
import java.util.ArrayList;

public class CountPairs {

    ArrayList<String> testdata;
    ArrayList<Integer> expected;
    String id;

    CountPairs(ArrayList<String> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }

    public int solve(String pairs) {
        if (pairs.length() <= 2) {
            return 0;
        }
        if (pairs.charAt(0) == pairs.charAt(2)) {
            return 1 + solve(pairs.substring(1));
        } else {
            return 0 + solve(pairs.substring(1));
        }
    }

    public void test() {
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("===================================");
        for (int x = 0; x < testdata.size(); x++) {
            String output = id + "(" + testdata.get(x) + ")->" + expected.get(x);
            System.out.print(String.format("%-25s", output));
            int result = solve(testdata.get(x));
            String status = result == expected.get(x) ? "Ok" : "FAIL";
            System.out.println(result + "\t" + status);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        in.add("axa");
        in.add("axax");
        in.add("axbx");
        in.add("hi");
        in.add("hihih");
        in.add("ihihhh");
        in.add("ihjxhh");
        in.add("");
        in.add("a");
        in.add("aa");
        in.add("aaa");
        out.add(1);
        out.add(2);
        out.add(1);
        out.add(0);
        out.add(3);
        out.add(3);
        out.add(0);
        out.add(0);
        out.add(0);
        out.add(0);
        out.add(1);
        CountPairs prob = new CountPairs(in, out, "CountEars");
        prob.test();
    }

}
