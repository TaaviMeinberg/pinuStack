package pinuStack;

public class Queue extends AbstractStack{

	public Integer pop() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		int firstElement = getFirstElement();
		elements.remove(elements.get(0));
		stacksize--;
		return firstElement;
	}

	public Integer peek() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		return getFirstElement();
	}
	
	private Integer getFirstElement(){
		return  elements.get(0);
	}

}
