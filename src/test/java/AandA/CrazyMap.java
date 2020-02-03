package AandA;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CrazyMap {
//find how many times char repeated
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccddeeffgghhiijjkkllmmnnooppqrstuvwwwxxxyyyzzzz";
		//numberOfVowels(str);
		String test2="ABC";
		String test3="ABC";
		String test4=test2;
		String test5= new String("ABC");
		System.out.println(test5==test3);

		//System.out.println(map);
		tree();

	}

	private static void numberOfVowels(String str) {
		// TODO Auto-generated method stub
		
		char[] ca = str.replace(" ", "").toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<=ca.length-1;i++) {
			if(map.containsKey(ca[i])) {
				map.put(ca[i], map.get(ca[i])+1);
			}else {
			map.put(ca[i], 1);
			}
		}
		
		Iterator<Entry<Character,Integer>> i = map.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Character,Integer> entryset = i.next();
			System.out.println(entryset.getKey() + "  " +  entryset.getValue());
			
		}
		
	}

	private static void tree(){
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(5,"Sudha");
		tm.put(15,"uuha");
		tm.put(25,"buh");
		tm.put(50,"zua");
		tm.put(5,"cua");
		tm.put(3,"fa");
		//tm.put(Integer.parseInt("3"),"fa");

		Iterator<Entry<Integer,String>> i = tm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer,String> entryset = i.next();
			System.out.println(entryset.getKey() + "  " +  entryset.getValue());

		}

		

	}
}
