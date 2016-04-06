
public class Sample {
	
	public static void displayHighScorePosition(String player, int position){
		System.out.println(player+" finished in position "+ position);		
	}
	
	public static int calculateHighScorePosition(int score){
		if(score>=1000){
			return 1;
		}else if(score>=500 && score<1000){
			return 2;
		}else if(score>=100 && score<500){
			return 3;
		}
		else{
			return 4;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches){
		if(feet>=0 && (inches>=0 && inches<=12)){
			double cm = (feet*30.48) + (inches*2.54);
			return cm;
		}else{
			return -1;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches){
		if(inches>=0){
			int feet = inches/12;
			int inchRemainder = inches%12;
			return calcFeetAndInchesToCentimeters(feet,inchRemainder);
		}else{
			return -1;
		}
	}
	
	public static void switchCase(char select){
		switch(select){
			case 'A':
				System.out.println("You have selected the first option");
				break;
			case 'B':
				System.out.println("You have selected the second option");
				break;
			case 'C':
				System.out.println("You have selected the third option");
				break;
			case 'D':
				System.out.println("You have selected the fourth option");
				break;
			case 'E':
				System.out.println("You have selected the last option");
				break;
			default:
				System.out.println("None of your options work");
				break;
		}	
	}
	

	public static void interestBank(double amount, double interest){
		
		for(int i=0; i<12; i++){
			System.out.println("Initial amount: "+String.format("%.2f", amount));
			amount = amount + amount*(interest/100);
			System.out.println("New amount: "+String.format("%.2f", amount));
			// to specify only 2 decimals for the double use String.format("%.2f", string)
			System.out.println("Month: " + (i+1));
		}
	}
	
	public static boolean isPrime(int n){
		if(n==1){
			return false;
		}
		for(int i=2;i<= n/2; i++){
			if((n%i)==0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void primeRange(int initial, int end){
		int count = 0;
		for(int i = initial; i<=end;i++){
			if(isPrime(i)){
				System.out.println(i);
				count++;
			}
			if(count==100){
				break;
			}
		}
		System.out.println("left");
		System.out.println(count);
	}
	
	public static boolean isEvenNumber(int number){
		if((number%2)==0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interestBank(15000, .9);
		
		//primeRange(10,200);
		/*int number = 5;
		int finishNumber = 20;
		int total = 0;
		
		while(number<=finishNumber){
			if(!isEvenNumber(number)){
				number++;
				total++;
				continue;
			}
			if(total == 5){
				break;
			}
			System.out.println("Even number "+number);
			number++;
		}
		
		System.out.println("Total odd: "+total);
		Car porsche = new Car();
		porsche.setModel("Carrera");
		System.out.println(porsche.getModel());*/
		
		//BankAccount sg = new BankAccount();
		//sg.setAccountNumber(1738);
		//sg.setAccountBalance(10000);
		//sg.accountDeposit(1000);
		
		/*VipCustomer sgCust = new VipCustomer();
		System.out.println(sgCust.getName());
		
		VipCustomer kgCust = new VipCustomer("Kenny Guayaquil", 7000, "kg@email.com");
		System.out.println(kgCust.getName());*/
		
		/*Porsche carrera = new Porsche("Carrera", 2015, "Red");
		carrera.changeGears();
		carrera.handSteer();
		carrera.move(150);
		carrera.move(250);*/
		
		
	}
}