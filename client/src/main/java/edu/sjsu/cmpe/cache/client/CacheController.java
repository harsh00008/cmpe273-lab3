package edu.sjsu.cmpe.cache.client;

import java.util.ArrayList;
import java.util.List;
import edu.sjsu.cmpe.cache.client.ConsistentHashing;
import edu.sjsu.cmpe.cache.client.CacheServiceInterface;
import edu.sjsu.cmpe.cache.client.DistributedCacheService;


public class CacheController {
	
	ConsistentHashing consistentHashing;
	
	List<String> cacheServerList;
	
	CacheServiceInterface cache;
	
	public CacheController(){
		initServers();
		consistentHashing = new ConsistentHashing(cacheServerList.size(), cacheServerList);
	}
	
	public void initServers(){
		cacheServerList = new ArrayList();
		cacheServerList.add("http://localhost:3000");
		cacheServerList.add("http://localhost:3001");
		cacheServerList.add("http://localhost:3002");
	}
	
	public void addKeyPairToCacheServer(int key, String value) throws Exception{
		
		String keyString = ""+key;
		String cacheServer = consistentHashing.get(keyString);
		cache = new DistributedCacheService(cacheServer);
		System.out.println("\n|-------------------------------------------|");
		System.out.println("| Selected Server : " + cacheServer);
		System.out.println("| Adding data : (" + key +", "+ value + ")  ");
		cache.put(key, value);
		System.out.println("|-------------------------------------------|");
	}
	
	public String getByKey(int key){
		String keyString = ""+key;
		String cacheServer = consistentHashing.get(keyString);
		cache = new DistributedCacheService(cacheServer);
		System.out.println("| Retrieving From : " + cacheServer + " ");
		return cache.get(key).toString();
	}
	
}
