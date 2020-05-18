public class URLify {
    public static void main(String[] args) {
        System.out.println(urlify(15, "Mr mamad nubari    sfsfs     "));
    }

    public static String urlify(int max_len, String input) {
        String chars = "";
        int chars_letter_len = 0;
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i) != ' ') {
                chars += input.charAt(i);
                chars_letter_len += 1;
            } else {
                chars += "%20";
            }
            if (chars_letter_len == max_len) break;
        }

        return chars;
    }
}