package com.co.devco.javaDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void deberiaObtener2AlSumar1Y1(){
		int resp = 1 + 1;
		assertThat(resp, equalTo(2));
	}

	@Test
	public void deberiaObtener4AlMultiplicar2Y2(){
		int resp = 2 * 2;
		assertThat(resp, equalTo(4));
	}

}
