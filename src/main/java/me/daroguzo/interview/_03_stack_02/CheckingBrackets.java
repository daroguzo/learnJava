package me.daroguzo.interview._03_stack_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CheckingBrackets {

    public static void main(String[] args) {
        CheckingBrackets checkingBrackets = new CheckingBrackets();
        System.out.println(checkingBrackets.check("[{1 + 2 * (2 + 2)} - (1 - 3)]"));
        System.out.println(checkingBrackets.check("[{1 + 2 * (2 + 2)} - [1 - 3)]"));
        System.out.println(checkingBrackets.check("((())"));
        System.out.println(checkingBrackets.check("(()))"));
        System.out.println(checkingBrackets.check("{{()}}"));
    }

    /**
     * TODO 주어진 수식의 괄호짝이 맞는지 확인하는 코드를 작성하라.
     *  예) [{1 + 2 * (2 + 2)} - (1 - 3)]   => true
     *  예) [{1 + 2 * (2 + 2)} - [1 - 3)]   => false
     */
    private boolean check(String mathExpression) {
        Stack<Character> stack = new Stack<>();
        List<Character> openingBrackets = Arrays.asList('(', '{', '[');
        List<Character> closingBrackets = Arrays.asList(')', '}', ']');

        for (char c : mathExpression.toCharArray()) {
            if (openingBrackets.contains(c)) {
                stack.push(c);
            } else if (closingBrackets.contains(c)) {
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();
                if (openingBrackets.indexOf(pop) != closingBrackets.indexOf(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
