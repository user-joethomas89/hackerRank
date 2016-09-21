package hackerRank;

import java.util.Scanner;

public class HourGlassPattern {
	
	private static final int MINIMUM = -64;
    
	public static void main(String[] args) {
    	int max = MINIMUM;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + 
                		arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > max){
                    max = sum;
                }
            }
        }
        
        System.out.println(max);
    }

}
