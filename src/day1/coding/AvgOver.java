package day1.coding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgOver {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		List list = new ArrayList();
		try {
			while(!((line = br.readLine()).replaceAll(" ","").equals(""))) {
				 list.add(line);
				 //System.out.println(list);
			}
		}catch (Exception e) {
			
			// TODO: handle exception
		}
		//System.out.println(list);
		String[][] score = new String[list.size()][];

		for( int i =0; i<score.length; i++) {
			double avg = 0;
			double sum = 0;
			double count = 0;
			
			score[i] = list.get(i).toString().split(" ");
			if(score[i][0].equals((score[i].length-1)+"")) {
				for(int j=1; j<score[i].length; j++) {
						sum += Double.parseDouble(score[i][j]);
				}
				avg = sum/Double.parseDouble(score[i][0]);
				for(int j=1; j<score[i].length; j++) {
					if(avg < Integer.parseInt(score[i][j])) {
						count +=1;
					}
				}
			//System.out.println(avg);
				System.out.println(String.format("%.3f",(count/Integer.parseInt(score[i][0])*100))+"%");
			}
			else {
			}
		}
		//for(int i =0; i<c ;i++) {
		//	System.out.println(allScore[i]);
		//	}

		/*Scanner sc= new Scanner(System.in);

		System.out.println("점수 입력(첫번째 칸은 몇개인지 입력)");

		String[][] score = null;

		int test=0;
		while(true) {
			try {

				String inputLine = sc.nextLine();
				System.out.println(sc.nextLine());
				if(inputLine != null) {
					allScore[test] = inputLine;
				}
				else {
					System.out.println(test+"줄 이 마지막");
					break;
				}
			}
			catch(Exception e) {
				System.out.println("에러발생");
				break;
			}
			test++;
		}
		for(int i = 0 ; i<allScore.length; i++) {
			score[i] = allScore[i].split(" ");
		}
		test=0;
		while(test<allScore.length) {
			double avg = 0;
			double sum = 0;
			double count = 0;
			int allCount = Integer.parseInt(score[test][0]);
			for(int i =1; i<allCount; i++) {
				sum += Double.parseDouble(score[test][i]);
			}
			avg = sum/allCount;
			for(int i =0; i<allCount; i++) {
				if(Double.parseDouble(score[test][i])>avg) {
					count+=1;
				}
			}
			System.out.println(String.format("%.3f", (count/allCount)*100)+"%");
			test++;
		}
		 */

	}
}
