
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countHi("codecozecote"));
	}
	
	public static int countHi(String str){
		char[] c = str.toCharArray();
		int l = c.length;
		int answer = 0;
		
		for(int i=0;i<l-3;i++){
			if(c[i] == 'c' && c[i+1]=='o' && c[i+3]=='e'){
				answer++;
			}
		}
		return answer;
		}
	
	public static void rand_f(){
		System.out.println("I dont do anything");
	}
}
