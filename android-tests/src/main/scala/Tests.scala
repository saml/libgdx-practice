package saml.libgdxpractice.tests

import saml.libgdxpractice._
import junit.framework.Assert._
import _root_.android.test.AndroidTestCase

class AndroidTests extends AndroidTestCase {
  def testPackageIsCorrect() {
    assertEquals("saml.libgdxpractice", getContext.getPackageName)
  }
}
