import java.util.*;
import java.io.*;

class JavaMap{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();

            phoneBook.put(name, phone);
        }

        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer phone = phoneBook.get(s);
            if(phone != null){
                System.out.println(s + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
