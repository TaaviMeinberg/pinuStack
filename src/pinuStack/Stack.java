package pinuStack;

public class Stack extends AbstractStack{
	
	@Override
	public Integer pop() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		int lastElemente = getLastElement();
		elements.remove(elements.size()-1);
		stacksize--;
		return lastElemente;
	}

	@Override
	public Integer peek() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		return getLastElement();
	}
	
	private Integer getLastElement(){
		return  elements.get(elements.size()-1);
	}

	

}
