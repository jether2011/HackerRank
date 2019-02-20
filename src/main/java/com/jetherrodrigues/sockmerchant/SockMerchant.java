package com.jetherrodrigues.sockmerchant;

import java.util.Arrays;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
		int totalPairs = 0;
    	Arrays.sort(ar);
    	
    	if (n == 1) return totalPairs;
    	
    	int aux = ar[0];
    	int auxCont = 0;
    	
		for (int i = 0; i < n;) {
			aux = ar[i];
			if (i == (n-1)) break; 
			for (int j = 0; j < ar.length; j++) {
				if(aux == ar[j]) {
					auxCont++;
					i++;
					continue;
				}
			}
		}
		--auxCont;
		if(auxCont % 2 == 0) {
			totalPairs += auxCont/2; 
		}
		else {
			totalPairs += (auxCont-1)/2;
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
    }
}

