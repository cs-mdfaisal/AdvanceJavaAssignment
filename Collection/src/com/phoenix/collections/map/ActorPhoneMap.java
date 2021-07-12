package com.phoenix.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Long> actorPhMap=new HashMap<String,Long>();
		actorPhMap.put("Shahrukh Khan", 9432102557L);
		actorPhMap.put("Salman Khan", 943442557L);
		actorPhMap.put("Amir Khan", 9445102557L);
		actorPhMap.put("Amitabh Bachchan", 9432102557L);
		
		System.out.println("phone no of Shahrukh Khan: "+actorPhMap.get("Shahrukh Khan"));
		System.out.println(actorPhMap);
		
		//using iterator
		Set<String> actors = actorPhMap.keySet();
		Iterator<String> it = actors.iterator();
		while(it.hasNext()) {
			String actorName=it.next();
			long phoneNo=actorPhMap.get(actorName);
			System.out.println("Actor: "+actorName+"\tPhoneNo : "+phoneNo);
		}
	}

}
