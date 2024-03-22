public class ReverseString {
    public static void main(String[] args) {
        char[] original = new char[]{'H','e','l','l','o', 'W','o','r','l','d','!'};
        String reversed = reverseString(original);

//        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println();
        System.out.println("=====reverse()====");
        System.out.println(reverse("ROMEO"));
    }

    // Function to reverse a string using StringBuilder
    public static String reverseString(char[] input) {
        // Create a StringBuilder object and append the input string
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);

        // Use the reverse() method of StringBuilder to reverse the string & Convert the StringBuilder back to a string
        return stringBuilder.reverse().toString();

        // Convert the StringBuilder back to a string
//        return stringBuilder.toString();
    }
    static String reverse(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >=0; --i){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}