package com.phoenix.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,Long> actorPhMap=new HashMap<String,Long>();//unordered and unsorted
		//Map<String,Long> actorPhMap=new LinkedHashMap<String,Long>();//ordered and unsorted
		//Map<String,Long> actorPhMap=new TreeMap<String,Long>();//ordered and sorted
		TreeMap<String,Long> actorPhMap=new TreeMap<String,Long>();//ordered and sorted
		//Comparator<String> c =Collections.reverseOrder();
		//Map<String,Long> actorPhMap=new TreeMap<String,Long>(c);//ordered and unsorted
		
		
		actorPhMap.put("Varun Dhawan", 9432102557L);
		actorPhMap.put("Aaliya Bhat", 943442557L);
		actorPhMap.put("Shradha Kapoor", 9445102557L);
		actorPhMap.put("Amitabh Bachchan", 9432102557L);
		actorPhMap.put("Raj Kapoor", 9402102557L);

		
		
		System.out.println("phone no of Varun Dhawan: "+actorPhMap.get("Varun Dhawan"));
		System.out.println(actorPhMap);
		
		//using iterator
		Set<String> actors = actorPhMap.keySet();
		Iterator<String> it = actors.iterator();
		while(it.hasNext()) {
			String actorName=it.next();
			long phoneNo=actorPhMap.get(actorName);
			System.out.println("Actor: "+actorName+"\tPhoneNo : "+phoneNo);
		
		}
		NavigableMap<String, Long> hdMap=actorPhMap.headMap("Shradha Kapoor", true);
		System.out.println(hdMap);
		
		NavigableMap<String, Long> tlMap=actorPhMap.tailMap("Shradha Kapoor", false);
		System.out.println(tlMap);
		
		//NavigableMap<String, Long> sbMap =actorPhMap.subMap("Amitabh Bachchan", false, "Shradha Kappor", false);
		SortedMap<String, Long> sbMap = actorPhMap.subMap("Amitabh Bachchan", "Shradha Kapoor");
		System.out.println(sbMap);
		
	}

}
