import java.util.ArrayList;
import java.util.List;
public class AList {
    public static void main(String[] args){

        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(76);
        list.add(55);
        list.add(35);
       System.out.println(list);
        list.set(1,44);
        System.out.println(list);
        list.contains(43);
        System.out.println(list);
        List<Integer> newlist = new ArrayList<>();
        newlist.add(46);
        newlist.add(65);
        list.addAll(newlist);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(Integer.valueOf(35));
        System.out.println(list);

        list.clear();
        System.out.println(list.contains(44));

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }


    }
}
