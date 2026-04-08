package twoDArrays;

public class SumOfAllElements {

	public static void main(String[] args) {
	int arr[][]= {{10,20,30},{40,50,60},{20,10,30}};
	int sum=0;
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		sum+=arr[i][j];
    	}
    }
    System.out.println("Sum of all the elements is "+sum);
	}

}
