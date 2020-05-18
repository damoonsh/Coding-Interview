import java.util.ArrayList;

class IsUnique{
    public static void main(String[] args) {
        // Implement an algorithm to determine if a string has all unique 
        // characters. What if you cannot use additional data structures?
        String test = "qwertyuiopasdfghjklzxcvbnm";
        ArrayList<String> letters = new ArrayList<String>(); 

        for (int i=1;i<test.length();i++) {
            if (!letters.contains(test.charAt(i))) {
                letters.add(Character.toString(test.charAt(i)));
            }
        }
        System.out.println(letters.size());
        if (letters.size() == 25) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}