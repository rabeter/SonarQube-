
package org.sonar.template.java.checks;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.MethodTree;

import java.util.regex.*;
@Rule(key = "AvoidMethodNames")
public class AvoidNamesRule extends BaseTreeVisitor implements JavaFileScanner {

  private JavaFileScannerContext context;


  @Override
  public void scanFile(JavaFileScannerContext context) {
    this.context = context;

    scan(context.getTree());

  }

  /**
   * Overriding the visitor method to implement the logic of the rule.
   * @param tree AST of the visited method.
   */
  @Override
  public void visitMethod(MethodTree tree) {
    /*
    驼峰式命名
     */

    String name = tree.simpleName().name().toString();
    String firstName = name.substring(0,1);
    Pattern pattern = Pattern.compile("[A-Z]");
    Matcher matcher = pattern.matcher(name);
    Matcher firstMatcher = pattern.matcher(firstName);
    if (firstMatcher.find() || (name.length() > 6 && !matcher.find())){
      context.reportIssue(this, tree, "非驼峰式命名");
    }

    super.visitMethod(tree);

  }

}
