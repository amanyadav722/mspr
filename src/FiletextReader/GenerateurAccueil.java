package FiletextReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateurAccueil {
    
    public static void main(String[] args) throws IOException {
        
        try(
        FileWriter aw = new FileWriter("index.html", true);
        BufferedWriter ow = new BufferedWriter(aw);
        PrintWriter lout = new PrintWriter(ow))
        {
        ow.write("<html><head><title>FICHE AGENT</title></head><body style=background-color:#659224;><br><div><div align=center><img src=img/go.jpg width=450 height=300></div></div><br><div align=center><h1>LISTE DES AGENTS :</h1></div><div id=liste_agent style=text-align:center><a href=cberthier.html><label>cberthier</label></a><br><a href=sconnor.html><label>sconnor</label><br /></a><a href=afoley.html><label>afoley</label><br></a><a href=jmacclame.html><label>jmacclame</label><br /></a><a href=mriggs.html><label>mriggs</label><br /></a><a href=jwest.html><label>jwest</label><br /></a><a href=sholmes.html><label>sholmes</label><br /></a><a href=jrouletabille.html><label>jrouletabille</label><br></a></div></body></html>");
        ow.close();
        }catch (IOException e) {}
    }

}
