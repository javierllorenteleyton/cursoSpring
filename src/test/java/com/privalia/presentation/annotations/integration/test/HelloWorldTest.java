package com.privalia.presentation.annotations.integration.test;

import static org.junit.Assert.assertNotNull;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import com.privalia.presentation.annotations.HelloWorld;
import com.privalia.presentation.annotations.SpringConfiguration;

@ContextConfiguration(classes = { SpringConfiguration.class})
public class HelloWorldTest {

	 @ClassRule
	 public static final SpringClassRule SPRING_CLASS_RULE= new SpringClassRule();
	 
	 @Rule
	 public final SpringMethodRule springMethodRule= new SpringMethodRule();
	 
	 @Autowired
	 private HelloWorld subject;
	 
	 @Test
	 public void test() {
		 assertNotNull(subject);
	 }
}
