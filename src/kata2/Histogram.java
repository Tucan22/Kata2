/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.*;

/**
 *
 * @author amct2
 */
public class Histogram {
    private final int[] data;
    
    public Histogram(int [] data){
        this.data = data;
    }
    
    public Map <Integer, Integer> getHistogram(){
        HashMap<Integer, Integer> histogram = new HashMap <>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? 
                    histogram.get(key) + 1 : 1);
        }
        
        return histogram;
        
    }
    
    
    
}
