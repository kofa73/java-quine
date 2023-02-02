package org.kovacstelekes.quine;
import static java.lang.String.valueOf;
import static java.util.Arrays.stream;
import java.util.stream.Collectors;
public class Quine {
public static void main(String[] args) {
String[] src = {"package org.kovacstelekes.quine;","import static java.lang.String.valueOf;","import static java.util.Arrays.stream;","import java.util.stream.Collectors;","public class Quine {","public static void main(String[] args) {","String[] src = {%s};","var qm = valueOf((char) 34);","var comma = valueOf((char) 44);","var allSrc = stream(src).map(s -> qm + s + qm).collect(Collectors.joining(comma));","stream(src).map(line -> line.formatted(allSrc)).forEach(System.out::println);","}","}"};
var qm = valueOf((char) 34);
var comma = valueOf((char) 44);
var allSrc = stream(src).map(s -> qm + s + qm).collect(Collectors.joining(comma));
stream(src).map(line -> line.formatted(allSrc)).forEach(System.out::println);
}
}
