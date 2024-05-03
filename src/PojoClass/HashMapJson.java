package PojoClass;

import java.util.HashMap;

import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.GsonBuilder;

public class HashMapJson {
	
	
	
	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("test", "pradeep");
		map.put("test1", "gabura");
		
		GsonBuilder gson=new GsonBuilder();
		
		//Gson gsonObject=gsonMapBuilder.create();
		//String JSONObject=gsonObject.toJson(map);

		Gson prettyGson=new GsonBuilder().setPrettyPrinting().create();
		String prettyJson=prettyGson.toJson(map);
		
		

	}

}
