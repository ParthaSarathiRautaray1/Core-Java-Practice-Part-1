class CommArgPrac3{
	public static void main(String [] pinu){
		
		int sum = 0;
		for(int i = 0; i<pinu.length; i++){


			//by using parseInt we take input as integer becoz the class is Integer

			
			sum = sum + (Integer.parseInt(pinu[i]));
			

		}
		System.out.println(sum);
	}
}