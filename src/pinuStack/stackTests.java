package pinuStack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class stackTests {

	@Test
	public void isEmpty(){
		Stack stack = new Stack();
		assertThat(stack.getSize(), is(0));
	}
}
