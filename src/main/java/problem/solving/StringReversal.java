package problem.solving;

public class StringReversal {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] initialArr = str.toCharArray();
        char[] finalArr = new char[str.length()];
//        for (int i = str.length() - 1, j = 0; i >= 0; i--) {
//            finalArr[j] = initialArr[i];
//            j++;
//        }
        for (int i = 0; i < str.length(); i++) {
            finalArr[str.length() - 1 - i] = initialArr[i];
        }

        String a = new String(finalArr);

        System.out.println(a);
    }


}
