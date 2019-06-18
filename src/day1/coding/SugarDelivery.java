package day1.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SugarDelivery {
	public static void main(String[] args) {
		// kg 선언
		int kg5 = 5;
		int kg3 = 3;
		
		// 키보드 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			
		line = br.readLine();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		// 총 kg 변수에 저장
		int tot = Integer.parseInt(line);
		
		// 개수
		int count = 0;
		
		// 5kg양만큼 뺀 나머지
		int rest = 0;

		// 일단 최대한 많이 5kg으로 채운다.
		count = tot/kg5;
		
		// 채우고 남은 나머지 
		rest = tot - count*kg5;
		
		// 
		while(true) {
			if(rest%kg3==0) {
				count += rest/kg3;
				break;
			}
			else {
				count -=1;
				rest = tot- count*kg5;
			}
			if(count<0) {
				count = -1;
				break;
			}
		}
		System.out.println(count);
	}
}
