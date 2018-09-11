/**
 *This file is the sample code against we run our unit test.
 *It is placed src/test/files in order to not be part of the maven compilation.
 **/
class AvoidTooManyParametersForMethodCheck {

  public void methodWithMyCompanyRule(int input1,int input2,int input3,int input4,int input5,int input6) {// Noncompliant {{Too many inputs parameters}}
	  // ..
  }

  public void methodWithMyCompanyRule(int input1,int input2,int input3) { // Compliant
	  //..
  }

}
