class Program4{
	public static void main(String[] args) {
		
		for(int i = 1;i <= 4;i++){
			char ch = 'A';
			
			for(int j = 1;j <= 5 - i;j++){
				System.out.print(ch + "  ");
				ch++;
				
			}
			System.out.println();
		}


	}
}