import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private String pattern;
    public  Validate(String pattern) {
        this.pattern=pattern;
    }

    public Validator(String s) {

    }

    public boolean validate(String value) {
        Pattern p = Pattern.compile(pattern);
        Matcher m=p.macher(value);
        return m.maches();
    }
}
