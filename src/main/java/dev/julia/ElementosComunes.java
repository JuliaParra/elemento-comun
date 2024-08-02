package dev.julia;

import java.util.ArrayList;
import java.util.List;

public class ElementosComunes {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        List<Integer> comunes = buscarElementosComunes(array1, array2);
        
        System.out.println("Elementos comunes: " + comunes);
    }
    
    public static List<Integer> buscarElementosComunes(int[] array1, int[] array2) {
        List<Integer> comunes = new ArrayList<>();
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !comunes.contains(array1[i])) {
                    comunes.add(array1[i]);
                }
            }
        }
        
        return comunes;
    }
}