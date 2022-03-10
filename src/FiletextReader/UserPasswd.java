package FiletextReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UserPasswd{

    public static void main(String[] args) throws IOException {
        
        Path fileStaff = Path.of("./ressources/staff.txt");
        List<String> lines = Files.readAllLines(fileStaff);
        for (String line : lines) {
            //On isole le nom
            String username = line;
            Path fileAgent = Path.of("./ressources/"+username+".txt");
            List<String> linesAgent = Files.readAllLines(fileAgent);
            String passwd;
            //List<String> equpmt = new ArrayList<String>();

            passwd =linesAgent.get(3);
            //for (int i = 5; i < linesAgent.size(); i++) {
                //equpmt.add(linesAgent.get(i));
            //}
            try(
            FileWriter sf = new FileWriter("C:/xampp/htdocs/"+".htpasswd", true);
            BufferedWriter bf = new BufferedWriter(sf);
            PrintWriter ht = new PrintWriter(bf))
            {
            bf.write(username+":"+passwd+"\n");
            bf.close();
            }catch (IOException e) {}

        }
    }
}