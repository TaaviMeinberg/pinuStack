package pinuStack;

import java.util.ArrayList;

public class Stack {
	// private Integer[] elements = new Integer[100];
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	private int stacksize = 0;

	public static void main(String[] args) {

		Stack sk = new Stack();
		System.out.println(sk);
		sk.push(5);
		sk.push(2);
		System.out.println(sk);
		sk.pop();
		
		
		System.out.println(sk.getLastElement());
		
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
		elements.remove(elements.size()-1);
		stacksize--;
		return elements.size();
	}

	public Integer peek() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		return elements.get(stacksize);
	}
	
	public Integer getLastElement(){
		return  elements.get(elements.size()-1);
	}

	@Override
	public String toString() {
		return "Stack [" + (elements != null ? "elements=" + elements + ", " : "") + "stacksize=" + stacksize + "]";
	}

}
