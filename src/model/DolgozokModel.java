package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DolgozokModel {
    private Path myPath = Paths.get("emberek.txt");
    private ArrayList<Dolgozo> dolgozok = new ArrayList<>();
    public DolgozokModel() throws IOException {
        
        List<String> myFile = Files.readAllLines(myPath);
        for (int i = 1; i < myFile.size(); i++) {
            String[] sor = myFile.get(i).split(";");
            if (sor.length > 3) {
                dolgozok.add(new Dolgozo(sor[0], Integer.parseInt(sor[1]), sor[2], Integer.parseInt(sor[3])));
            }
            else dolgozok.add(new Dolgozo(sor[0], Integer.parseInt(sor[1]), sor[2]));
        }
    }
    
}
