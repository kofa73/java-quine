package org.kovacstelekes.quine;
import static java.lang.String.valueOf;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
public class Quine {
public static void main(String[] args) {
String[] src = {
"package org.kovacstelekes.quine;",
"import static java.lang.String.valueOf;",
"import static java.util.Arrays.stream;",
"import static java.util.stream.Collectors.joining;",
"public class Quine {",
"public static void main(String[] args) {",
"String[] src = {%s};",
"var qm = valueOf((char) 34);",
"var comma = valueOf((char) 44);",
"var nl = System.lineSeparator();",
"var allSrc = stream(src).map(s -> qm + s + qm).collect(joining(comma  + nl, nl, nl));",
"stream(src).map(line -> line.formatted(allSrc)).forEach(System.out::println);",
"}",
"}"
};
var qm = valueOf((char) 34);
var comma = valueOf((char) 44);
var nl = System.lineSeparator();
var allSrc = stream(src).map(s -> qm + s + qm).collect(joining(comma  + nl, nl, nl));
stream(src).map(line -> line.formatted(allSrc)).forEach(System.out::println);
}
}
