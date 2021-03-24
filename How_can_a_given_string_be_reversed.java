import java.util.*;

class How_can_a_given_string_be_reversed {

public static void main(String[] sg) {
System.out.println("Enter string that will be reverse");
Scanner scanner = new Scanner(System.in);
String str = scanner.nextLine();
StringBuilder stringBuilder = new StringBuilder(str);
stringBuilder.reverse();
String strReversed = stringBuilder.toString();

System.out.println(strReversed);
}
}