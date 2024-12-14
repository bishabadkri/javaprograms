import java.util.*;

public class addressinstring {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Vishnu");
        int hashCode = System.identityHashCode(name);
        System.out.println("The address before the change is: " + hashCode);
        
        name.insert(0, 'i');
        int hashCode1 = System.identityHashCode(name);
        System.out.println("The address after the change is: " + hashCode1);

        String hello = "hehheee";
        int orad = System.identityHashCode(hello);
        System.out.println("before change in string is "+orad);
        hello = hello+"hahaaa";
        int orad1 = System.identityHashCode(hello);
        System.out.println("after/ change in string is "+orad1);
    }
}
