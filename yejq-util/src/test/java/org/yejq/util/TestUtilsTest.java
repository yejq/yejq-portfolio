package org.yejq.util;

import java.math.BigDecimal;

import org.junit.Test;

public class TestUtilsTest extends TestUtils{

	@Test
	public void pltest(){
		pl("ooo", 111, new BigDecimal(90.888));
	}
}
