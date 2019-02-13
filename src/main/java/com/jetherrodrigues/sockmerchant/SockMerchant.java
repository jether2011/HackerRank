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
    	
    	int aux = ar[0];
    	int auxCont = 0;
		for (int i = 0; i < n; i++) {
			 
			for (int j = 0; j < ar.length; ) {
				if(aux == ar[j]) {
					auxCont++;
				}
				j++;
			}
			System.out.println(auxCont);
			if(auxCont % 2 == 0) {
				totalPairs += auxCont/2; 
			}
			else {
				totalPairs += (auxCont-1)/2;
			}
			aux = ar[auxCont];
			//i+=(j-1);
			auxCont = 0;
		}
    	return totalPairs;
    }

    public static void main(String[] args) {
        
    	/**
    	 * test one
    	 */
    	int n = 9;
    	int [] ar = {10,20,20,10,10,30,50,10,20}; 
        System.out.println(sockMerchant(n, ar));

        /**
    	 * test two
    	 */
    	int n2 = 10;
    	int [] ar2 = {1,1,3,1,2,1,3,3,3,3}; 
        System.out.println(sockMerchant(n2, ar2));
    }
}

