 /*
  *use BufferedReader to take input a sentence, now find longest word from the sentence 
  */
 import java.io.*;
 class Q1_lab_oos {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String s = br.readLine();

        //splitting into words

        int maxLength = 0;
        String longestWord = "";

        String words[] = s.split("\\s");
        for(int i=0;i<words.length;i++){
            // System.out.println(words[i]);
            if(words[i].length()>maxLength){
                maxLength=words[i].length();
                longestWord=words[i];
            }
            
        }

        System.out.println("The longest word in your sentence is: "+longestWord+" with length = "+maxLength);

        br.close();
        ir.close();
    }
}
