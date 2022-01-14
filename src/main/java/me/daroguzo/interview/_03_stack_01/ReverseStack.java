package me.daroguzo.interview._03_stack_01;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println(numbers);
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.solution2(numbers);
        System.out.println(numbers);
    }

    // TODO 스택을 뒤집는 코드를 작성하라.
    private Stack<Integer> solution(Stack<Integer> stack) {
        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
        return reversedStack;
    }

    private void solution2(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int pop = stack.pop();
        solution2(stack);
        insertAtBottom(stack, pop);
    }

    private void insertAtBottom(Stack<Integer> stack, int number) {
        if (stack.isEmpty()) {
            stack.push(number);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, number);
        stack.push(temp);
    }

}
