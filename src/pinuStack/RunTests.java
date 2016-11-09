package pinuStack;

import org.junit.Test;

public class RunTests {
	
	
	@Test
    public void runAllTests() throws Exception {
		QueueTests qTests = new QueueTests();
		qTests.callAllQueueTests();
		StackTests sTests = new StackTests();
		sTests.callAllStackTests();
    }

}
