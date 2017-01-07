/*
驼峰式命名测试文件
1.首字母必须小写
2.除首字母为的其他词语首字母大写
 */
class AvoidNamesCheck {

  int aField;

  public void MethodWithName() { // Noncompliant {{非驼峰式命名}}

  }

  public void methodwithname() { // Noncompliant {{非驼峰式命名}}

  }

  public void methodWithName() { // Compliant

  }

}
