package com.sachin.google;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KickSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("A-small-attempt4.in");
		 try {
			FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			 Scanner in = new Scanner(file);
			int noOfTests = in.nextInt();
			int n=0;
			int[] inpArray= {};
			for(int i = 1;i<=noOfTests;i++) {
				n = in.nextInt();
				inpArray = new int[n];
				for(int j = 0;j<n;j++) {
					inpArray[j] = in.nextInt();
				}
				System.out.println(kickSortCheck(n,inpArray));
				if(kickSortCheck(n,inpArray))
					bufferedWriter.write("Case #" + i +":"+ " YES");
				else
					bufferedWriter.write("Case #" + i +":"+ " NO");
				bufferedWriter.newLine();
			}
			int a[] = {2,3,1};
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static boolean kickSortCheck(int n, int[] inpArray) {
		int evenEnd;
		int oddBeg;
		if((inpArray[0] != 1 && inpArray[0]!=2)||(inpArray[n-1] != 1 && inpArray[n-1]!=2))
			return false;
		if(n == 2)
			return true;
		else if(n==3) 
			return inpArray[1] == 3;
		else if(n%2==0) 
			evenEnd = (n-1)/2;
		else 
			evenEnd = ((n-1)/2)-1;
		oddBeg = evenEnd + 1;
		if(inpArray[evenEnd]%2 !=0 )
			return false;
		if(inpArray[oddBeg]%2 == 0)
			return false;
		for(int  i = 1; i < evenEnd; i++) {
			if((inpArray[i]+2 != inpArray[i+1]) || inpArray[i]%2 != 0 )
				return false;
		}
		for(int i = oddBeg; i<n-2; i++) {
			if(inpArray[i] != inpArray[i+1]+2 || inpArray[i]%2 == 0)
				return false;
		}
		return true;
	}

}
