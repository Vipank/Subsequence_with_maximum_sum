import java.io.*;
import java.lang.Math;

public class Subsequence_with_maximum_sum{


	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String [] array=br.readLine().split(" ");
		
		int start=0;
		int end=0;
		int var=0;

		int globalsum= 0;
		int currentsum = 0;
		
		for(int i=0;i<array.length;i++){
			
			int currentelement=Integer.parseInt(array[i]);	
			
			currentsum=currentsum+currentelement;

			if(currentsum<0){
				currentsum=0;
				var=i+1;
			}
			
			if (currentsum > globalsum) {
				globalsum=currentsum;
				start=var;
				end=i;
			}
			
		}
		System.out.println("Maximum sum is"+" "+globalsum);
		System.out.println("Start Index"+" "+start);
		System.out.println("End Index"+" "+end);
	}

}