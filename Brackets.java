import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Brackets ob = new Brackets();
        System.out.println(ob.solution("[]"));
    }
    public boolean solution(String brackets){
        Stack<Character> bracket = new Stack<>();
        for (int i=0;i<brackets.length();i++){
            char ch = brackets.charAt(i);
            switch (ch){
                case '{':
                case '(':
                case '[':bracket.push(ch);
                    break;
                case '}': if (!bracket.empty() && bracket.peek().equals('{'))
                                bracket.pop();
                            else
                                return false;
                            break;
                case ']': if (!bracket.empty() && bracket.peek().equals('['))
                                bracket.pop();
                            else
                                return false;
                            break;
                case ')': if (!bracket.empty() && bracket.peek().equals('('))
                                bracket.pop();
                            else
                                return false;
                                break;
            }
        }
        if (bracket.empty())
        return true;
        else
            return false;
    }
}
