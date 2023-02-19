package testBasicJavaCertificate;
import java.util.*;

public class JavaMultiSum {
    public Integer sum(Integer[] ints){

        //sum the integers
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        //return the sum
        return sum;
    }

    public String sum(String[] ints){
//        concatenate the string
        String sum = "";
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        //return the sum
        return sum;
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
//        parse each integer from the input with space separated
        String[] input = sc.nextLine().split(" ");
//        create an array of integers with length between 1 and 100
        if(input.length < 1 || input.length > 100){
            System.out.println("Invalid input");
            return;
        }
        Integer[] ints = new Integer[input.length];

//        parse each string to an integer
        for (int i = 0; i < input.length; i++) {
            ints[i] = Integer.parseInt(input[i]);
        }
//        create a new instance of JavaMultiSum

        JavaMultiSum jms = new JavaMultiSum();
        System.out.println(jms.sum(ints));
    }
}