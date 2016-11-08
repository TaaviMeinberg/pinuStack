package pinuStack;

import java.util.ArrayList;

import Interfaces.InterfaceStack;

public abstract class AbstractStack implements InterfaceStack {
	protected ArrayList<Integer> elements = new ArrayList<Integer>();
	protected int stacksize = 0;
	
	@Override
	public int getSize() {
		return stacksize;
	}

	@Override
	public void push(Integer i) {
		elements.add(i);
		stacksize++;
	}
	
	
	@Override
	public String toString() {
		return "[" + (elements != null ? "elements=" + elements + ", " : "") + "stacksize=" + stacksize + "]";
	}
}
