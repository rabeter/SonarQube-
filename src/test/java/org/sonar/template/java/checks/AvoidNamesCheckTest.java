
package org.sonar.template.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class AvoidNamesCheckTest {

  @Test
  public void detected() {
    JavaCheckVerifier.verify("src/test/files/AvoidNamesCheck.java", new AvoidNamesRule());
  }
}
