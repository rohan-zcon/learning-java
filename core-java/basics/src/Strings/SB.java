package Strings;

public class SB {
    public static void main(String[] args) {
//        Sb is mutable unlike String
        appendChars(6);
    }

    static  void appendChars(int count){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char c = (char)('a' + i);
            stringBuilder.append(c);
        };
        System.out.println(stringBuilder.toString());
    }

}
