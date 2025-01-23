import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Main {
    public static void main(String[] args) {
        Pattern type = Pattern.compile("^(type )((?s).*)"); 
        Matcher matcher = type.matcher("type stuff");
        if (matcher.find()) System.out.println(matcher.group(2));
    }
}