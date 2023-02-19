import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length() == 0){
            System.out.println(0);
            return;
        }
        String[] arr = s.trim().split("[ !,?._'@]+");
        System.out.println(arr.length);
        for(String str : arr){
            System.out.println(str);
        }
        scan.close();
    }
}

