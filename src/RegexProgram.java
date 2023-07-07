import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProgram {
    public static void main(String[] args) {
        //1st way
        Pattern pattern=Pattern.compile("s");
        Matcher matcher=pattern.matcher("sa");
        boolean b= matcher.matches();
        System.out.println(b);
        //2nd way
        boolean b1=Pattern.compile(".s").matcher("as").matches();
        System.out.println(b1);
        //3rd way
        boolean b2=Pattern.matches(".s","sa");
        System.out.println(b2);
    }
}
