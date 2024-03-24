package Map;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArrayElements {

    public static void main(String[] args) {

        int[] arr = {10,5,10,15,10,5};

        countFrequency(arr);
    }

    private static void countFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int j : arr) {
            if (freqMap.containsKey(j)) {
                freqMap.put(j, freqMap.get(j) + 1);
            } else {
                freqMap.put(j, 1);
            }
        }

        System.out.println(freqMap);

        int maxElement=0, maxFreq = 0;
        int minElement = 0, minfreq = arr.length;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq){
                maxElement = element;
                maxFreq = count;
            }

            if (count < minfreq){
                minElement = element;
                minfreq = count;
            }
        }

        System.out.println("Max : " + maxElement);
        System.out.println("Min : " + minElement);
    }
}
