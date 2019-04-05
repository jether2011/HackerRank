package com.jetherrodrigues.sockmerchant;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
    	int totalPairs = 0;
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!values.add(ar[i])) {
                totalPairs++;
                values.remove(ar[i]);
            }
        }

        return totalPairs;
    }

    public static void main(String[] args) {
        
    	/**
    	 * test one - 3 pairs
    	 * {10,10,10,10,20,20,20,30,50}
    	 */
    	int n = 9;
    	int [] ar = {10,20,20,10,10,30,50,10,20}; 
        System.out.println(sockMerchant(n, ar));

        /**
    	 * test two - 4 pairs
    	 * {1,1,1,1,2,3,3,3,3,3}
    	 */
    	int n2 = 10;
    	int [] ar2 = {1,1,3,1,2,1,3,3,3,3}; 
        System.out.println(sockMerchant(n2, ar2));
        
        /**
    	 * test tree - 0 pairs
    	 * {100}
    	 */
    	int n3 = 1;
    	int [] ar3 = {100}; 
        System.out.println(sockMerchant(n3, ar3));
        
        int n4 = 100;
        int [] ar4 = new int[100];
        for (int i = 0; i < ar4.length; i++) {
			ar4[i] = 42;
		}
        System.out.println(sockMerchant(n4, ar4));
    }
}

