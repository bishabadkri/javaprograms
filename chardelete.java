public class chardelete {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println("Original String: " + str);

        for (int i = 0; i < str.length(); i++)
         {
            System.out.println(str.substring(i)); // Print the substring starting from index 'i'
        }
    }
}
