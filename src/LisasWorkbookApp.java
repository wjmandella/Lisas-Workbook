// My solution to the HackerRank.com problem "Lisa's Workbook."
// https://www.hackerrank.com/challenges/lisa-workbook/problem

import java.util.Scanner;

public class LisasWorkbookApp {
    static int workbook(int n, int k, int[] arr) {
        int specialCount = 0;
        int pageNbr = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	int min = 1;
        	int max = Math.min(arr[i], (min + (k-1)));
        	while(min <= arr[i]) {
        		pageNbr++;
        		if(min <= pageNbr && pageNbr <= max) {
        			specialCount++;
        		}
        		min += k;
        		max += k;
        		if(max > arr[i]) {
        			max = arr[i];
        		}
        	}
        }      
        return specialCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of chapters, n (integer 1-100): "); 
        int n = in.nextInt();
        System.out.print("Enter the number of problems per page, k (integer 1-100): "); 
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            System.out.print("Enter the number of problems for chapter #"+(arr_i +1)+", (integer 1-100): "); 
            arr[arr_i] = in.nextInt();
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
