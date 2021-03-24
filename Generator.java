import java.util.*;

class Generator {

public static void main(String[] sg) {
StringBuilder stringBuilder = new StringBuilder();
for (int i = 0; i < 123; i++) {
if (i >= 65) { 
if (i <= 90 || i>= 97) {
stringBuilder.append(Character.toString((char) i));
}
}
}
System.out.println(stringBuilder.toString());

}

}
