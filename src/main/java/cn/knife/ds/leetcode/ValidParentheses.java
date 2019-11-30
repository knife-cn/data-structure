package cn.knife.ds.leetcode;


import java.util.Stack;

/**
 * description:  package cn.knife.ds.leetcode; <br>
 * date: 2019/11/30 21:26 <br>
 * author: knife <br>
 * version: 1.0 <br>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if(c==']'&& topChar!='['){
                    return false;
                }
                if(c=='}'&& topChar!='{'){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}