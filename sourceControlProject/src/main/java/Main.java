import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("version.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
    //v1
}