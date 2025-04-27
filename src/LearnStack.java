import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(33);
        stack.push(22);
        stack.push(90);
        stack.push(23);
        stack.push(26);

        for(Integer value:stack){
            System.out.print(value+ " ");
        }
        System.out.println();
        System.out.println(stack);

        System.out.println(stack.get(3));

        System.out.println(stack.contains(35));

        stack.set(3,30);
        System.out.println(stack);

        Stack<Integer> st = new Stack<>();
        st.push(100);
        stack.addAll(st);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
