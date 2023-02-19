import java.util.*;
class JavaStack{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            Stack<Character> stack = new Stack<Character>();
            if (input.length() % 2 != 0) {
                System.out.println("false");
                continue;
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '{' || c == '[' || c == '(') {
                    stack.push(c);
                } else if (c == '}' || c == ']' || c == ')') {
                    if (stack.isEmpty()) {
                        System.out.println("false");
                        break;
                    }
                    char top = stack.pop();
                    if (c == '}' && top != '{') {
                        System.out.println("false");
                        break;
                    } else if (c == ']' && top != '[') {
                        System.out.println("false");
                        break;
                    } else if (c == ')' && top != '(') {
                        System.out.println("false");
                        break;
                    }
                }
                if (i == input.length() - 1) {
                    if (stack.isEmpty()) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }
            }
        }

    }
}




