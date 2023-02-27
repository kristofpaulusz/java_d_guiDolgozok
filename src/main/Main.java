/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import model.Dolgozo;
import model.DolgozokModel;
import view.DolgozokView;

/**
 *
 * @author paulusz.k.csanad
 */
public class Main {
    public static void main(String[] args) throws IOException {
        DolgozokModel model = new DolgozokModel();
        DolgozokView view = new DolgozokView();
        view.main(args);
        view.setDolgozok(model.getDolgozok());
        ArrayList<Dolgozo> fiuk = model.sortByNem("F");
        ArrayList<Dolgozo> lanyok = model.sortByNem("L");
//       
        System.out.println("Legidősebb L: "+ model.legidosebb(lanyok).getKor());
        System.out.println("Összesk L: " + model.osszes(lanyok));
        System.out.println("6 éve d L: " + model.elsoHatEveDolgozo(lanyok));
        
        System.out.println("Legidősebb F: "+ model.legidosebb(fiuk).getKor());
        System.out.println("Összesk F: " + model.osszes(fiuk));
        System.out.println("6 éve d F: " + model.elsoHatEveDolgozo(fiuk).getNev());
        
        view.setEredmeny(Integer.toString(model.legidosebb(fiuk).getKor()), Integer.toString(model.osszes(fiuk)), model.elsoHatEveDolgozo(fiuk).getNev());

    }
}
