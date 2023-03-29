package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clovek clovek = new Clovek(30);
        Clovek clovek2 = new Clovek("jano", "bratislava", 180.0, 80.0, 30, new ArrayList<>());
        String meno = "tomas";
        clovek.setMeno(meno);
        System.out.println(clovek.getMeno());
        System.out.println(clovek2);
    }
}
