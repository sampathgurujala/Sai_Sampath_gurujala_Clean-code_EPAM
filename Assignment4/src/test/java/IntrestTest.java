
import org.junit.Assert;
import org.junit.Test;

public class IntrestTest {

	@Test
	public void test() {
		Assert.assertEquals(36702.400462486534, MyClass.compoundInterest(20000, 8, .17, 12),0);
		Assert.assertEquals(5400.000000000000, MyClass.simpleIntrest(20000, 3, 9.0),0);

	}

}
