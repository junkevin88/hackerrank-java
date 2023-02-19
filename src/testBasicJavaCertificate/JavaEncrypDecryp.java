package testBasicJavaCertificate;


import java.io.*;

class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {
//        world hello => hello world
//        hello world => world hello
//        hello world how are you => you are how world hello
//        hello world how are you => you are how world hello
//        hello world how are you => you are how world hello
//        hello world how are you => you are how world hello
//        hello world how are you => you are how world hello
//        for each word adjacent repeated letters are compressed in format <characted><frequency>

        String[] words = encryptedMessage.split(" ");
        String[] decryptedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String decryptedWord = "";
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j + 1 < word.length()) {
                    char next = word.charAt(j + 1);
                    if (Character.isDigit(next)) {
                        int frequency = Character.getNumericValue(next);
                        for (int k = 0; k < frequency; k++) {
                            decryptedWord += c;
                        }
                        j++;
                    } else {
                        decryptedWord += c;
                    }
                } else {
                    decryptedWord += c;
                }
            }
            decryptedWords[i] = decryptedWord;
        }
        String decryptedMessage = "";
        for (int i = decryptedWords.length - 1; i >= 0; i--) {
            decryptedMessage += decryptedWords[i] + " ";
        }
        return decryptedMessage.trim();



    }

}
public class JavaEncrypDecryp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String encryptedMessage = bufferedReader.readLine();

        String result = Result.decryptMessage(encryptedMessage);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
