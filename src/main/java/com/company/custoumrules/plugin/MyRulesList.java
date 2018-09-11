/*
 * SonarQube Java Custom Rules Example
 * Copyright (C) 2018 MyCompany 
 *
 */
package com.company.custoumrules.plugin;

import java.util.List;

import org.sonar.plugins.java.api.JavaCheck;

import com.company.customrules.check.AvoidTooManyParametersForMethodRule;
import com.google.common.collect.ImmutableList;

/**
 * @author Bibhuti
 * 
 */
public final class MyRulesList {

  private MyRulesList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
  }

  public static List<Class<? extends JavaCheck>> getJavaChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .add(AvoidTooManyParametersForMethodRule.class)
      .build();
  }

  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      .build();
  }
}
