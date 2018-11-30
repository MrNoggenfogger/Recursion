
import java.util.ArrayList;

public class Array11 {

    ArrayList<int[]> testdata;
    ArrayList<Integer> expected;
    String id;

    Array11(ArrayList<int[]> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }

    public int solve(int[] nums, int index) {
        if (nums.length <= 0) {
            return 0;
        }
        if (nums[index] == 11 && (nums.length - index - 1) > 0) {
            return 1 + solve(nums, index + 1);
        } else if (nums[index] == 11) {
            return 1;
        } else if ((nums.length - index - 1) > 0) {
            return 0 + solve(nums, index + 1);
        } else {
            return 0;
        }
    }

    public void test() {
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("===================================");
        for (int x = 0; x < testdata.size(); x++) {
            String output = id + "(" + testdata.get(x) + ")->" + expected.get(x);
            System.out.print(String.format("%-25s", output));
            int result = solve(testdata.get(x),0);
            String status = result == expected.get(x) ? "Ok" : "FAIL";
            System.out.println(result + "\t" + status);
        }
    }

    public static void main(String[] args) {
        ArrayList<int[]> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        int x[][] = {{1,2,11},{11,11},{1,2,3,4},{1,11,3,11,11},{11},{1},{},{11,2,3,4,11,5},{11,5,11}};
        for (int[] nums : x) {
            in.add(nums);
        }
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
        Array11 prob = new Array11(in, out, "Array11");
        prob.test();
    }

}
