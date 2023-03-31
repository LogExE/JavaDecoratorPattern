import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtectedArchiveDecorator extends ArchiveDecorator {
    String password;
    BufferedReader rdr;
    public ProtectedArchiveDecorator(Archive archive, String password) {
        super(archive);
        this.password = password;
        rdr = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String unwrap() {
        try {
            if (rdr.readLine().equals(password))
                return super.unwrap();
            else return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
