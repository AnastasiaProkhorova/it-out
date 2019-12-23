import java.io.*;
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
