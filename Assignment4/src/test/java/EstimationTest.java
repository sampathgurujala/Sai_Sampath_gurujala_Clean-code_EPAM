
import org.junit.Assert;
import org.junit.Test;
public class EstimationTest {

	@Test
	public void test() {
		Assert.assertEquals(24000.000000,MyClass.estimator("standard",20.0,false),0);
		Assert.assertEquals(30000.000000,MyClass.estimator("above standard",20.0,false),0);
		Assert.assertEquals(36000.000000,MyClass.estimator("high standard",20.0,false),0);
		Assert.assertEquals(50000.000000,MyClass.estimator("high standard",20.0,true),0);

		}

}
