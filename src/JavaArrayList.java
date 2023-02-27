import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> l = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                l.add(sc.nextInt());
            }
            list.add(l);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}