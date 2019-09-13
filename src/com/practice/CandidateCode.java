package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandidateCode {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testcase = 0;
		int testCaseCheck = in.nextInt();
		while (testcase < testCaseCheck) {
			in.nextLine();
			ArrayList<Integer> villianStrenght = new ArrayList<Integer>();
			ArrayList<Integer> playerEnergy = new ArrayList<Integer>();
			int number = in.nextInt();
			in.nextLine();
			for (int i = 0; i < number; i++) {
				villianStrenght.add(in.nextInt());

			}
			in.nextLine();
Boolean result=Boolean.FALSE;
			for (int i = 0; i < number; i++) {
				playerEnergy.add(in.nextInt());

			}
			
			Collections.sort(villianStrenght);
			Collections.sort(playerEnergy);
			
			
			for(int j=0;j<villianStrenght.size();j++) {
				
				if(villianStrenght.get(j)>playerEnergy.get(j)) {
					
					
					result=Boolean.TRUE;
					
				}
				
			}
			if(result) {
				System.out.println("LOSE");
				
			}
			else{
				System.out.println("WIN");
			}
			/*
			 * int max=0; for(int i = 0; i < villianStrenght.size(); i++ ){
			 * 
			 * 
			 * If current value is less than min value, it is new minimum value
			 * 
			 * 
			 * if( villianStrenght.get(i) > max ){ max = villianStrenght.get(i);
			 * 
			 * }
			 * 
			 * 
			 * } int maxPlayer=0;
			 * 
			 * for(int i = 0; i < playerEnergy.size(); i++ ){
			 * 
			 * 
			 * If current value is less than min value, it is new minimum value
			 * 
			 * 
			 * if( playerEnergy.get(i) > maxPlayer ){ maxPlayer = playerEnergy.get(i);
			 * 
			 * }
			 * 
			 * 
			 * }
			 * 
			 * if(maxPlayer<max) { System.out.println("LOOSE"); } else {
			 * System.out.println("WIN");
			 * 
			 * }
			 */
			testcase++;
		}

	}

}
