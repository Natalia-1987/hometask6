import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class ClassProperty {

    public static void main(String[] args) {
        try (InputStream input = ClassProperty.class.getClassLoader().getResourceAsStream("application.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            prop.put("newKey", "newValue");
            prop.put("newKey2", "newValue2");

            writeToConsole(prop);

            prop.setProperty("firstName", "Bla-Bla-Bla");

            writeToConsole(prop);

            store(prop);
        }catch (Exception e){

        }
    }

    private static void writeToConsole(Properties prop) {
        for (Object key : prop.keySet()) {
            System.out.println(key+" = "+prop.get(key));
        }
        System.out.println("---------------------------");
    }

    private static void store(Properties prop) throws URISyntaxException, IOException {
        URL resourceUrl = ClassProperty.class.getClassLoader().getResource("application.properties");
        File file = new File(resourceUrl.toURI());
        OutputStream output = new FileOutputStream(file);
        prop.store(output,null);
        output.close();
    }
}
