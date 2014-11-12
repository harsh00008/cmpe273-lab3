package edu.sjsu.cmpe.cache.client;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

public class ConsistentHashing{
	

		private final HashFunction hashFunction;
	    private final int numberOfReplicas;
	    private final SortedMap<String, String> circle =  new TreeMap<String, String>();

	  public ConsistentHashing(int numberOfReplicas, Collection<String> nodes) {

	    this.hashFunction = new HashFunction();
	    this.numberOfReplicas = numberOfReplicas;

	    for (String node : nodes) {
	      add(node);
	    }
	  }

	  public void add(String node) {
	    for (int i = 0; i < numberOfReplicas; i++) {
	      circle.put(hashFunction.hash(node.toString() + i), node);
	    }
	  }

	  public void remove(String node) {
	    for (int i = 0; i < numberOfReplicas; i++) {
	      circle.remove(hashFunction.hash(node.toString() + i));
	    }
	  }

	  public String get(String key) {
	    if (circle.isEmpty()) {
	      return null;
	    }
	    String hash = hashFunction.hash(key);
	    if (!circle.containsKey(hash)) {
	      SortedMap<String, String> tailMap = circle.tailMap(hash);
	      hash = tailMap.isEmpty() ? circle.firstKey() : tailMap.firstKey();
	    }
	    return circle.get(hash);
	  } 

}