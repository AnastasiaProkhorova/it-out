import java.util.Scanner;
import java.io.*;

public class Main {
    /*  public static void main(String[] args){
          Scanner in = new Scanner(System.in);
   int n = Integer.parseInt(args[0]);
  double r = Math.random();
  n = (int)(r*n);
  System.out.println(n); */
/*        double sum = 0.0;
        int n = 0;
        while(in.next() != null){
            double x = in.nextDouble();
            sum += x;
            n++;
            System.out.println(sum/n);
        }
        System.out.println(sum/n);
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
