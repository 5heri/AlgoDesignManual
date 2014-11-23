import java.util.Stack;

public class ParenthesesCheck {
	
	public boolean isCorrect(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			} else if (s.charAt(i) == ')') {
				if (stack.isEmpty()) return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	// if return == -1, it means correct parentheses
	public int getIndexOfIncorrect(String s) {
		int index = -1;
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
				index++;
			} else if (s.charAt(i) == ')') {
				if (stack.isEmpty()) return i;
				stack.pop();
				index--;
			}
		}
		return index;
	}

}
