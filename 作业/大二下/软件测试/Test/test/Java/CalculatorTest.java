package Java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Calculator ca=new Calculator();
		int result=ca.add(1, 2);
		int devide=3;
//		断言
		assertEquals(devide,result);
//		判断结果是否在1到5之间
		assertThat(result,allOf(greaterThan(1),lessThan(5)));
	}

}
