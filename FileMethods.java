// import java.io.BufferedWriter;
// import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException{
        // FileWriter writer = new FileWriter("D://java//tutorial//Files//Test.txt");
        // BufferedWriter buffer = new BufferedWriter(writer);
        // buffer.write("Welcome all"); 
        // buffer.close();
        // System.out.println("Success");
        FileReader fr = new FileReader("D://java//tutorial//Files//Test.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }

        br.close();
        fr.close();

    }   
}
