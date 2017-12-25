package pkg;

class dummy{
	
	public static void main(String[] args){
		int a=2;
		a += ++a;
		
		System.out.println(a);
		System.out.println(a+"  ");
		
		int[] arr = {1,16,4,3,56,67,4};
		int temp;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
	}
}