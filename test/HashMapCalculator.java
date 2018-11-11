import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int amount = 0;
		
		for (String s : hashmap1.keySet()) {
			if (hashmap2.containsKey(s)) {
				if (hashmap2.get(s).equals(hashmap1.get(s))) {
					amount++;
				}
				
			}
		}
		return amount;
	}

}
