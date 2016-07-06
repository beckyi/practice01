package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		while(true){
			int First = 1;
			int End = 100;
			int i=1;
			int Ianswer;
			Random random = new Random();
			int number = random.nextInt(100)+1;
			
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			//System.out.println(number);
			Scanner scanner = new Scanner(System.in);
			
			while(true){
				System.out.println("["+First + "-" + End+"]");
				System.out.print((i++)+">> ");
				String answer = scanner.next();
				
				Ianswer = Integer.parseInt(answer);
				
				if(Ianswer>number){
					System.out.println("더낮게");
					End = Ianswer;
				}else if(Ianswer==number){
					System.out.println("맞았습니다.");
					break;
				}else{
					System.out.println("더 높게");
					First = Ianswer;
				}
			}
			System.out.println("다시 하시겠습니까?(y,n)>>");
			String Eanswer = scanner.next();
			if( Eanswer.equals("n") ){
				scanner.close();
				System.out.println("게암을 종료합니다.");
			    break;//종료하도록 작성한다.	
			}else{
				continue;
			}

		}
	}
}