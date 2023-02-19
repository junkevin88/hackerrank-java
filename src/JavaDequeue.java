import java.util.*;
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (deque.size() == m) {
                if (map.size() > max) {
                    max = map.size();
                }
                int first = deque.pollFirst();
                if (map.get(first) == 1) {
                    map.remove(first);
                } else {
                    map.put(first, map.get(first) - 1);
                }
            }
        }
        System.out.println(max);
    }
}
