public class charsort {

    public static void main(String[] args) {
        String s = "ADHIKARI";
        char[] hoho = s.toCharArray(); 

        for (int i = 0; i < hoho.length - 1; i++) {
            for (int j = i + 1; j < hoho.length; j++) {
                if (hoho[i] > hoho[j]) 
                { 
                    char temp = hoho[i]; 
                    hoho[i] = hoho[j];
                    hoho[j] = temp;
                }
            }
        }

        System.out.println("Sorted characters are:");
        for (char c : hoho) {
            System.out.print(c + " ");
        }
    }
}
