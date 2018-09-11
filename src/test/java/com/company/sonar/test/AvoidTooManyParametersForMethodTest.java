/*
 * SonarQube Java Custom Rules Example
 * Copyright (C) 2018 MyCompany 
 *
 */
package com.company.sonar.test;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

import com.company.customrules.check.AvoidTooManyParametersForMethodRule;

/**
 * This file is the sample code against we run our unit test. It is placed
 * src/test/files in order to not be part of the maven compilation.
 **/
public class AvoidTooManyParametersForMethodTest {

	@Test
	public void verify() {
		JavaCheckVerifier.verify("src/test/files/AvoidTooManyParametersForMethodCheck.java",
				new AvoidTooManyParametersForMethodRule());
	}

}
