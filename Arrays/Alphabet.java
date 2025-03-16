class Alphabet{
	public static void setalpha(char[] alpa){
		int n = alpa.length;
		
		for(int i=0;i<n-1;i++){
			for(int j=0; j<n-i-1;j++){
				if(alpa[j]>alpa[j+1]){
					char temp = alpa[j];
					alpa[j]=alpa[j+1];
					alpa[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted alphabets :");
		for(char ref: alpa){
			System.out.println(ref);
		}
		
	}
}