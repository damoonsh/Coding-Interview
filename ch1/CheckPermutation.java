public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "Damoon", str2 = "nomaDo";

        // They should have the same characters and length
        // with different arranging
        if (str1.length() != str2.length())
            System.out.println("False");
        int[] indexes = new int[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            if (indexes[i] != 0) {
                int index = findLetterIndex(str1.substring(i+1), str2.charAt(i));
                if (index == -1) {
                    System.out.println("False");
                    break;
                }
            } else {
                int index = findLetterIndex(str1, str2.charAt(i));
                if (index == -1) {
                    System.out.println("False");
                    break;
                }
            }

            if (i == str1.length() - 1) 
                System.out.println("True");
        }
    }

    public static int findLetterIndex(String subString, char letter) {
        for (int i = 0; i < subString.length(); i++) {
            if (subString.charAt(i) == (letter)) {
                return i;
            }
        }
        return -1;
    }
}