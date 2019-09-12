import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacter {
    private File f;
    public static void main(String[] args) {
        File f = new File(CountCharacter.class.getClassLoader().getResource("example.txt").getFile());
        CountCharacter cl1 = new CountCharacter(f, 'e');
        System.out.println(cl1.count());
    }

    private char lookFor;

    CountCharacter(File f, char lookFor) {
        this.f = f;
        this.lookFor = lookFor;
    }

    private int count() {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == lookFor) {
                        count++;
                    }
                }
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return count;

    }
}
