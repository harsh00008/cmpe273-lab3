package edu.sjsu.cmpe.cache.client;

import java.util.ArrayList;
import java.util.List;

import edu.sjsu.cmpe.cache.client.CacheServiceInterface;
import edu.sjsu.cmpe.cache.client.DistributedCacheService;
import edu.sjsu.cmpe.cache.client.CacheController;


public class Client {

	public static void main(String[] args) throws Exception {
    	System.out.println("\n\n=========== Adding Data to the server ===========");

    	CacheController cacheController = new CacheController();
    	cacheController.addKeyPairToCacheServer(1, "a");
    	cacheController.addKeyPairToCacheServer(2, "b");
    	cacheController.addKeyPairToCacheServer(3, "c");
    	cacheController.addKeyPairToCacheServer(4, "d");
    	cacheController.addKeyPairToCacheServer(5, "e");
    	cacheController.addKeyPairToCacheServer(6, "f");
    	cacheController.addKeyPairToCacheServer(7, "g");
    	cacheController.addKeyPairToCacheServer(8, "h");
    	cacheController.addKeyPairToCacheServer(9, "i");
    	cacheController.addKeyPairToCacheServer(10, "j");
    	
    	System.out.println("\n============ Getting Keys ===============");
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(1)");
    	System.out.println("| Result : " + cacheController.getByKey(1));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(2)");
    	System.out.println("| Result : " + cacheController.getByKey(2));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(3)");
    	System.out.println("| Result : " + cacheController.getByKey(3));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(4)");
    	System.out.println("| Result : " + cacheController.getByKey(4));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(5)");
    	System.out.println("| Result : " + cacheController.getByKey(5));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(6)");
    	System.out.println("| Result : " + cacheController.getByKey(6));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(7)");
    	System.out.println("| Result : " + cacheController.getByKey(7));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(8)");
    	System.out.println("| Result : " + cacheController.getByKey(8));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(9)");
    	System.out.println("| Result : " + cacheController.getByKey(9));
    	System.out.println("|=========================================|");
    	
    	System.out.println("\n|=========================================|");
    	System.out.println("| Execute : GET(10)");
    	System.out.println("| Result : " + cacheController.getByKey(10));
    	System.out.println("|=========================================|");
    	
   }
}
