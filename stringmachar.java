import java.util.Scanner;

public class stringmachar {
    public static void main(String[] args) {
        char[] name = { 'a', 'b', 'c', 'd', 'e' };
     

        StringBuilder name1 = new StringBuilder();
        for (int i= 0;i<name.length;i++) {
            name1.append(name[i]);
            System.out.println("Current string:" +name1.toString());//toString gives the original string without changing//
        }
        System.out.println("Final string: "+ name1.toString());
    }
}
