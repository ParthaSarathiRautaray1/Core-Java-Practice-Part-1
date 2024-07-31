package Employee;
public class Emp{
	
	private String name ;
	private int empid;
	private int netBalance ;
	private int incometax;
	private int da;
	private int bpay;
	private int hra;
	private int pf;
	private int grosspay;
	private int allowance;
	
	public Emp(int employeId , int balpay ,  int netBalanceof, int grosspayof , int incometaxof , int daof , int allowanceof){
		
		empid = employeId;
		bpay = balpay;
		netBalance = netBalanceof;
		grosspay = grosspayof;
		incometax = incometaxof;
		da = daof;
		allowance = allowanceof;

	}
	public void netBalanceSet(){
		netBalance = grosspay - incometax;
		System.out.println("Net balance is :"+ netBalance);

	}
	public void grosProfitFind(){
		grosspay = netBalance + incometax + da + allowance;
		System.out.println("Gross balance is :"+ grosspay);
	}
}