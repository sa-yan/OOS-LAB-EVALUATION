import java.io.*;

class input_BR {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String s = br.readLine();
        System.out.println(s);
        
    }    
}
