package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listes = new ArrayList<>();
        for (int j = 0; j<100;j++){
            listes.add(j+1);
        }
        for (int j = 0; j<100;j++){
            System.out.println(listes.get(j));
        }

        System.out.println(listes.size());
    }

}
