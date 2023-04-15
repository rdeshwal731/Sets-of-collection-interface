/*(b) Create a program to show the usage of the Sets of Collection interface.
The Collection framework is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of implementation details.
*/
import java.util.*;
public class exp5b {
 
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();

        stack.push("I");
        stack.push("dont");
        stack.push("like");
        stack.push("java");
        stack.push("language");

        stack.pop();
 
        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
 
            // Print all popped elements
            System.out.println(itr.next());
        }
    }
}