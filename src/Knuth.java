import java.util.Random;

public class Knuth {
	
	public static int[] getrandomarray(int log){
		int[] result = new int[log];
		for (int i = 0; i < log; i++) {
			result[i] = i;
		}
		for (int i = 0; i < log; i++) {
			int random = (int) (log * Math.random());
			int temp = result[i];
			result[i] = result[random];
			result[random] = temp;
		}
		return result;
	}
	
    public static void Insertion(int[] array)  
    {  
        int temp = 0;
        for (int i = 1; i < array.length; i++)  
        {  
            temp = array[i];
            int j = i; 
            while (j >= 1 && array[j - 1] > temp)  
            {  
                array[j] = array[j - 1];  
                j--;  
            }  
            array[j] = temp;  
        }  
    }  
	public static void Quicksort(int array[],int low,int high){
	 int L=low;
	 int H=high;
	 int pivot=array[low];
	 
	 while(L<H)
	 {
		 if (high - low + 1 < 10)  
		 {  
			 Insertion(array);  
		     return;  
		 }else{
		 
	 while(L<H&&array[H]>=pivot)                                                                               
	 H--;
	 if(L<H){
	 int temp=array[H];
	 array[H]=array[L];
	 array[L]=temp;
	 L++;
	 }
	 
	 while(L<H&&array[L]<=pivot)
	 L++;
	 if(L<H){
	 int temp=array[H];
	 array[H]=array[L];
	 array[L]=temp;
	 H--;
	 }
	 
	 }
	 
	 if(L>low)
		Quicksort(array,low,L-1);
	 if(H<high)
		Quicksort(array,L+1,high);
	}
	}
	public static void main(String []a){
		
		int n =1000;

		int[] array = new int[n];

		Random r = new Random(n);

		array[0] = 0;

		for(int i =0;i<n;i++){

		array[i] = r.nextInt(n)+1;

		array[i] = (int)(Math.random()*n+1);

		for(int j=0;j<i;j++){

		if(array[i] == array[j]){

		i--;

		break;

		}

		}

		}

		int[] b=array;
//		Quicksort(b,0,b.length-1);
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		
	}
}
