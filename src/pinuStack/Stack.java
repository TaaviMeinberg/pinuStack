package pinuStack;

import java.util.ArrayList;

public class Stack {
	// private Integer[] elements = new Integer[100];
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	private int stacksize = 0;

	public static void main(String[] args) {

		Stack sk = new Stack();
		System.out.println(sk);
		sk.push(2);
		sk.push(4);
		sk.push(8);
		System.out.println(sk);
		System.out.println(sk.pop());
		System.out.println(sk);
//		System.out.println(sk.peek());

	}

	public Stack() {

	}

	public int getSize() {
		return stacksize;
	}

	public void push(Integer i) {
		elements.add(i);
		stacksize++;
	}

	public Integer pop() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		stacksize--;
		return elements.get(stacksize);
	}

	public Integer peek() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		return elements.get(stacksize);
	}

	@Override
	public String toString() {
		return "Stack [" + (elements != null ? "elements=" + elements + ", " : "") + "stacksize=" + stacksize + "]";
	}

}
