import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^(?=[a-z]*\\d).{6,15}@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    // So với "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$"    này thì không bắt buôc có ký tự số
    // Còn tham chiếu EMAIL_REGEX định dạng regex thì bắt buộc phải có ít nhất 1 ký tự số.

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
