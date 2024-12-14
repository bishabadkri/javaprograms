import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("people");
        for (int i = 0; i < sb.length() / 2; i++) //just change front and back,, so getting length of half of total string
        {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
