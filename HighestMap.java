package com.trading;

import java.util.HashMap;
import java.util.Map;

public class HighestMap {

	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 34);

		String keyWithHighestValue = findKeyWithHighestValue(map);
        
        System.out.println("Key with the highest value: " + keyWithHighestValue);
    }

    public static String findKeyWithHighestValue(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Return null if the map is empty or null
        }

        String keyWithHighestValue = null;
        int highestValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestValue) {
                highestValue = entry.getValue();
                keyWithHighestValue = entry.getKey();
            }
        }

        return keyWithHighestValue;
	}

}
