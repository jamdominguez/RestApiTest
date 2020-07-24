package com.example.restapitest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest, I must know how testing with spring boot
class AppTests {

	App app = new App();

	@Test
	void helloTest() {
		Assert.assertTrue(app.hello(null) instanceof String);
	}

	@Test
	void helloNameTest() {
		Assert.assertEquals("Hello Frodo!", app.hello("Frodo"));
	}

	@Test
	void byeTest() {
		Assert.assertTrue(app.bye(null) instanceof String);
	}

	@Test
	void byeNameTest() {
		Assert.assertEquals("Bye Frodo", app.bye("Frodo"));
	}

}
