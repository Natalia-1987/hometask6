import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileTask {

    public static void main(String[] args) {
        File f = new File(FileTask.class.getClassLoader().getResource("textFile.txt").getFile());
//        String fileName = "/Users/nataliamurzahanova/IdeaProjects/textFile.txt";
        List<String> list = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }

            System.out.println(list);

            for (int i = list.size()-1; i>=0; i--){
                list2.add(list.get(i));
            }

            System.out.println(list2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
