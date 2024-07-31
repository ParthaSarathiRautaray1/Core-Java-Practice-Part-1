package Pack1;
public class Multi{
	private int x;
	int mul = 1;
	public void setdata(int p){
		x=p;
		
	
	}

	public void printTable(){

		for(int i = 1; i<=10 ; i++){
			mul = x * i ;
			System.out.println(mul);
		}
	}
}