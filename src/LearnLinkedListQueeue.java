import java.util.Queue;
import java.util.LinkedList;

public class LearnLinkedListQueeue {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(45);
        list.offer(65);
        list.offer(400);
        list.offer(23);
        System.out.println(list.contains(400));
        System.out.println(list.remove(23));

        System.out.println(list.peek());
        System.out.println(list);
        for( Integer arr : list){
            System.out.print(arr+" ");
        }
        System.out.println();

    }
}
