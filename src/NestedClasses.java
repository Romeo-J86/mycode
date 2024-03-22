import java.util.Hashtable;
import java.util.Stack;

/**
 * @author romeo.jerenyama
 * @created 22/01/2024 - 16:39
 */
public class NestedClasses {
    public static void main(String[] args) {
        var outer = new NestedClasses();
        var inner = outer.new Inner();
        System.out.println(inner.x);

        Stack<Integer> s = new Stack<>();
        s.push(78);
        s.pop();
        System.out.println(s);
        s.push(44);
        s.push(12);
        s.push(18);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push(19);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push(12);
        s.push(28);
        System.out.println(s);

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("a", 1);
        hashtable.put("b", 2);
        hashtable.put("c", 3);
        System.out.println(hashtable);
    }
    class Inner {
        private int x = 25;
    }
}
