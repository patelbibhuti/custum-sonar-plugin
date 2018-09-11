/*
 * SonarQube Java Custom Rules Example
 * Copyright (C) 2018 MyCompany 
 *
 */
package com.company.custoumrules.plugin;

import org.sonar.api.Plugin;

/**
 * Entry point of your plugin containing your custom rules
 * 
 * @author Bibhuti
 * 
 */
public class MyJavaRulesPlugin implements Plugin {

  @Override
  public void define(Context context) {

    // server extensions -> objects are instantiated during server startup
    context.addExtension(MyJavaRulesDefinition.class);

    // batch extensions -> objects are instantiated during code analysis
    context.addExtension(MyJavaFileCheckRegistrar.class);

  }

}
