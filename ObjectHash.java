import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.lang.NumberFormatException;
import static java.security.MessageDigest.getInstance;

class ObjectHash {

public static void main(String[] string_00) {

System.out.println("Object: ");
Scanner scanner = new Scanner(System.in);
String string = scanner.nextLine();
try {
int it = Integer.parseInt(string);
System.out.println(getObjectHash(it));
} catch (NumberFormatException numberFormatException) {
System.out.println(getObjectHash(string));
main(new String[]{"742"});
}
main(new String[]{"742"});


}

    public static String getObjectHash(Object object) {
        String a = "742";
        String b = Integer.toString(object.hashCode());
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyymmsshh", Locale.US);
        String currentDate = sdf.format(date);
        String total = a + b + currentDate;
        return a(new HashDataModel("SHA-1", total));
    }

 public static String a(HashDataModel w1) {
        try {
            MessageDigest md = getInstance(w1.sg);
            md.update(w1.e);
            byte[] bytes = md.digest(w1.sg1.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte be2:bytes) {
                sb.append(Integer.toString((be2 & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ne) {
           
        }
        throw new RuntimeException();
    }

public static class HashDataModel {
    public final String sg;
    public final String sg1;
    public final byte[] e;
    public HashDataModel(String sg, String sg1) {
        this.e = new byte[]{7, 4, 2};
        this.sg = sg;
        this.sg1 = sg1;
    }

}
}
