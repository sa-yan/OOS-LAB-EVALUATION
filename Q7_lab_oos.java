
/*
 * Write a java class that will copy a text file into another empty file
 */
import java.io.*;

class Q7_lab_oos {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        int nextChar = 0;
        try {
            fr = new FileReader("a.txt");
            fw = new FileWriter("a1.txt");
            while ((nextChar = fr.read()) != -1) {
                fw.write(nextChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
