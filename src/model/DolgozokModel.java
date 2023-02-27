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

    public ArrayList<Dolgozo> getDolgozok() {
        return dolgozok;
    }

    public Dolgozo legidosebb(ArrayList<Dolgozo> dolgozok) {
        
       
        Dolgozo idos = dolgozok.get(0);
        for (Dolgozo dolgozo : dolgozok) {
            if (dolgozo.getKor() > idos.getKor()) {
                idos = dolgozo;
            }
        }
        return idos;
    }
    public Dolgozo elsoHatEveDolgozo(ArrayList<Dolgozo> dolgozok) {
        boolean nincsTalalat = true;
        int index = 0;
        Dolgozo talalat = null;
        while (nincsTalalat && index  < dolgozok.size()) {
            if (dolgozok.get(index).getMunkToltEv() >= 6) {
                talalat = dolgozok.get(index);
                nincsTalalat = false;
            }
            index += 1;
        }
        return talalat;
    };

    public ArrayList<Dolgozo> sortByNem(String nem) {
         // Szűrés nem szerint
        ArrayList<Dolgozo> csakEgyNem = new ArrayList<>();
        for (Dolgozo dolgozo : dolgozok) {
            if (dolgozo.getNem().equals(nem)) {
                csakEgyNem.add(dolgozo);
            }
        }
        return csakEgyNem;
    }

    public Integer osszes(ArrayList<Dolgozo> dolgozok) {
        Integer osszeg = 0;
        for (Dolgozo dolgozo : dolgozok) {
            osszeg += dolgozo.getKor();
        }
        return osszeg;
    }
    
}