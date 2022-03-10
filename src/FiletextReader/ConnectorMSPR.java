package FiletextReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ConnectorMSPR {

    public static void main(String[] args) throws IOException {
        
        Path fileStaff = Path.of("./ressources/staff.txt");
        List<String> lines = Files.readAllLines(fileStaff);
        for (String line : lines) {
            //On isole le nom
            String username = line;
            Path fileAgent = Path.of("./ressources/"+username+".txt");
            List<String> linesAgent = Files.readAllLines(fileAgent);
            String nom;
            String prenom;
            String metier;
            String passwd;
            String equpmt1;
            String equpmt2;
            String equpmt3;
            //List<String> equpmt = new ArrayList<String>();

            nom =linesAgent.get(0);
            prenom =linesAgent.get(1);
            metier =linesAgent.get(2);
            passwd =linesAgent.get(3);
            equpmt1 = linesAgent.get(5);
            equpmt2 = linesAgent.get(6);
            equpmt3 = linesAgent.get(7);
            for (int i = 5; i < linesAgent.size(); i++) {
                //equpmt.add(linesAgent.get(i));
            }
            
            try(
            FileWriter fw = new FileWriter(username+".html", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
           
            {
            bw.write("<html><head><title>FICHE AGENT</title></head><body style=background-color:#379EC1;><div><div><span style=border:3px solid black;padding: 10px;>"+nom+" "+prenom+"</span></div><div align=right><img src=img/cberthier.jpg width=450 height=300></div></div><br><br><br><h1></h1><div style=text-align:center><label>"+equpmt1+"</label><input type=checkbox><br><label>"+equpmt2+"</label><input type=checkbox><br><label>"+equpmt3+"</label><input type=checkbox><br></div></body></html>");
            bw.close();
            }catch (IOException e) {}
            System.out.println(nom +" "+prenom+" "+metier+" "+passwd+" "+equpmt1+" "+equpmt2+" "+equpmt3);
        }
        
        try(
        FileWriter aw = new FileWriter("index.html", true);
        BufferedWriter ow = new BufferedWriter(aw);
        PrintWriter lout = new PrintWriter(ow))
        {
        ow.write("<html><head><title>FICHE AGENT</title></head><body style=background-color:#659224;><br><div><div align=center><img src=img/go.jpg width=450 height=300></div></div><br><div align=center><h1>LISTE DES AGENTS :</h1></div><div id=liste_agent style=text-align:center><a href=cberthier.html><label>cberthier</label></a><br><a href=sconnor.html><label>sconnor</label><br /></a><a href=afoley.html><label>afoley</label><br></a><a href=jmacclane.html><label>jmacclane</label><br /></a><a href=mriggs.html><label>mriggs</label><br /></a><a href=jwest.html><label>jwest</label><br /></a><a href=sholmes.html><label>sholmes</label><br /></a><a href=jrouletabille.html><label>jrouletabille</label><br></a></div></body></html>");
        ow.close();
        }catch (IOException e) {}
    }
}