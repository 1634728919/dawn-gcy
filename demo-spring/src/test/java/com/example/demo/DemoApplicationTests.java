package com.example.demo;

import com.example.demo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * SpringBoot 单元测试
 *
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
@Autowired
	Person person;
	@Test
	public void contextLoads() {
		System.out.println(person);
		System.out.println("");
	}

}
