import java.util.Scanner;

public class GetSmallestAndLargest {

    public static String Mantap(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; i<s.length(); i++){
            if(i+k > s.length()){
                break;
            }
            String sub = s.substring(i, i+k);
            if(i == 0){
                smallest = sub;
            }
            if(sub.compareTo(largest) > 0){
                largest = sub;
            } else if(sub.compareTo(smallest) < 0){
                smallest = sub;
            }
        }

        return smallest + "\n" + largest;
    }
}

