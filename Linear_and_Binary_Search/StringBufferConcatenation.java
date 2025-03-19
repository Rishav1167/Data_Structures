package Linear_and_Binary_Search;

public class StringBufferConcatenation {
    public static String concatenateStrings(String[] strings) {//used to concatenate string array with StringBuffer
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!"};
        String result = concatenateStrings(words);
        System.out.println(result);
    }
}
