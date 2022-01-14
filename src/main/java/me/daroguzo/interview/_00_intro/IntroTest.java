package me.daroguzo.interview._00_intro;

import java.util.Arrays;
import java.util.Comparator;

public class IntroTest {
    public static void main(String[] args) {
        String[] arr = {"one", "man", "group", "korea", "friend", "apple"};
        IntroTest introTest = new IntroTest();
        introTest.solution(arr);
        for (String word : arr) {
            System.out.print(word + " ");
        }
    }

    private void solution(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });
    }

    /**
     * TODO 알파벳 소문자로 이루어진 N개의 단어 배열 arr, 알파벳 역순으로 정렬
     */
}
