package day1.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail {
	public static void main(String[] args) {
	
		// 키보드 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] input = line.split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int v = Integer.parseInt(input[2]);
		
		int day = 0;
		while(true) {
			day+=1;
			if(v-a<=0) {
				break;
			}
			else {
				v= v-a+b;
			}
		}
		System.out.println(day);
	}
}
