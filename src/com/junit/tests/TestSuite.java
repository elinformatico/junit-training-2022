package com.junit.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
    AppTest.class,
	Test1.class,
	Test2.class,
	AppTest.class,
	AppTest2.class,
	AccountServiceImpTest.class
})
public class TestSuite {

}
