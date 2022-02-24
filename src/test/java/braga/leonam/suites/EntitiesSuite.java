package braga.leonam.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import braga.leonam.entities.ConstructorTest;
import braga.leonam.entities.GettersSetterTest;
import braga.leonam.entities.MathValueMethodTest;

@RunWith(Suite.class)
@SuiteClasses({ GettersSetterTest.class, ConstructorTest.class, MathValueMethodTest.class })
public class EntitiesSuite {
	//remove if you can
}
