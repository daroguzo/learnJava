package me.daroguzo.interview._01_array_02;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.solution3("Hello".toCharArray()));
    }

    /**
     * TODO 주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.
     *  예) hello => olleh
     *  예) happy new year => reay wen yppah
     *
     * @param message
     * @return
     */
    private char[] solution1(char[] message) {
        char[] reversedChars = new char[message.length];

        // 10 -> 0, 9 -> 1, 8 -> 2
        for (int i = message.length - 1 ; i >= 0 ; i--) {
            reversedChars[message.length - 1 - i] = message[i];
        }

        return reversedChars;
    }

    /**
     * TODO 주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성하라.
     *  예) hello => olleh
     *  예) happy new year => reay wen yppah
     *
     * @param message
     * @return
     */
    private char[] solution2(char[] message) {
        for (int i = 0 ; i < message.length/2 ; i++) {
            char temp = message[i];
            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
        return message;
    }

    private char[] solution3(char[] message) {
        StringBuilder sb = new StringBuilder();
        for (int i = message.length - 1; i >= 0; i--) {
            sb.append(message[i]);
        }
        return sb.toString().toCharArray();
    }
}
