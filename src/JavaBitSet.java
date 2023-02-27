import java.io.*;
import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (op.equals("AND")) {
                if (x == 1) {
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
            } else if (op.equals("OR")) {
                if (x == 1) {
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
            } else if (op.equals("XOR")) {
                if (x == 1) {
                    b1.xor(b2);
                } else {
                    b2.xor(b1);
                }
            } else if (op.equals("FLIP")) {
                if (x == 1) {
                    b1.flip(y);
                } else {
                    b2.flip(y);
                }
            } else if (op.equals("SET")) {
                if (x == 1) {
                    b1.set(y);
                } else {
                    b2.set(y);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }



    }
}