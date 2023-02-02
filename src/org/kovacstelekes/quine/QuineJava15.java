package org.kovacstelekes.quine;
import static java.lang.String.valueOf;
public class QuineJava15 {
public static void main(String[] args) {
String src = 
"""
package org.kovacstelekes.quine;
import static java.lang.String.valueOf;
public class QuineJava15 {
public static void main(String[] args) {
String src = %s;
var qm = valueOf((char) 34);
var nl = System.lineSeparator();
var srcDefinition = nl + qm + qm + qm + nl + src + qm + qm + qm;
System.out.print(src.formatted(srcDefinition));
}
}
""";
var qm = valueOf((char) 34);
var nl = System.lineSeparator();
var srcDefinition = nl + qm + qm + qm + nl + src + qm + qm + qm;
System.out.print(src.formatted(srcDefinition));
}
}
