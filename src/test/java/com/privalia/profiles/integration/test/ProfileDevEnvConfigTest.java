package com.privalia.profiles.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import com.privalia.profiles.DevEnvConfig;
import com.privalia.profiles.User;



@ActiveProfiles(profiles = "dev")
@ContextConfiguration(classes= {DevEnvConfig.class})
public class ProfileDevEnvConfigTest {
	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE =  new SpringClassRule();
	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();
	
	@Autowired
	private DevEnvConfig subject;
	
	@Test
	public void testUSer(){
		User user = subject.user();
		assertEquals("Dev User",user.name);
	}
}
