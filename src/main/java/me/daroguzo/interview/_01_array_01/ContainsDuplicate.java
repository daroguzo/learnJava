package me.daroguzo.interview._01_array_01;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(containsDuplicate.solution(new int[]{1, 1, 2, 3, 5}));
    }

    /**
     * TODO 숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하라. 중복된 숫자가 있다면 true 없다면 false.
     *  예) 1 2 3 4 5 6 => false
     *  예) 1 1 2 2 3 1 => true
     */
    private boolean solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        boolean answer = false;
        for (int i :
                numbers) {
            if (set.contains(i))
                answer = true;
            else
                set.add(i);
        }
        return answer;

    }

}
