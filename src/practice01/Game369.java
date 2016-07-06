package practice01;

public class Game369 {

	public static void main(String[] args) {
		String answer = null;
		
		System.out.println("실행결과 : ");
		System.out.println("-------");
		
		for(int i=1;i<100;i++){
			int number = i;
			//String -> int : Integer.parseInt(String)
			//int -> String : String.valueOf(int)
			String sNumber = String.valueOf(number);
			//System.out.println(sNumber);
			//System.out.println(sNumber.length());

			for(int j=0; j<sNumber.length();j++){
				int cnt=0;
				char c = sNumber.charAt(j);
				if(c=='3' || c=='6' || c=='9'){
					cnt = cnt + 1;
					System.out.print(number+" ");
				}
				if(cnt>0){
					for(int k=cnt;k>0;k--){
						System.out.print("짝");
					}
				}else{}
			}

			//char c = sNumber.charAt(0);
		}
	}
}
