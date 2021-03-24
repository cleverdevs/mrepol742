import java.util.*;

class How_do_you_check_if_a_string_contains_only_digits {

public static void main(String[] sg) {
System.out.println("Enter a value");
Scanner scanner = new Scanner(System.in);
String data = scanner.nextLine();

try {
Integer.parseInt(data);
} catch (NumberFormatException nfe) {
System.out.println("the value contains a letter and/or a symbol");
}
}
}