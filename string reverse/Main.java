

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Pasan Kamburugamuwa"));
    }

    public static String reverseString(String myString){
        int len = myString.length();
        char[] c = new char[len];
        for(int j= len-1,i=0; j>= 0; j--, i++){
            c[i] = myString.charAt(j);
        }
        return String.copyValueOf(c);
    }
}
