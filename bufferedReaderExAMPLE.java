import java.io.*;

class Demo{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String data ="";
        
        while ((data = br.readLine()) != null) {
            System.out.println(data);
           
        }
        br.close();
    }
}