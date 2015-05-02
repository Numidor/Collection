/*
* NxN grid + queens problem solution
*/
package gameofqueens;

import java.util.*;

public class GameofQueens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the board: ");
        int gridSize = in.nextInt();
        if(gridSize <0){
            System.out.println("Choose a positive number. Try again.");
        }else{
            enumerate(gridSize);
        }
    }
        public static void enumerate(int N) {
        int[] a = new int[N];
        enumerate(a,0);      
    }

    public static void enumerate(int[] q, int n) {
        int N = q.length;
        if (n == N){
            printQueens(q);
        } else {
            int i, c = 0;
            for (i = 0; i < N; i++) {
                q[n] = i;
                if (isConsistent(q, n)) {
                    enumerate(q, n+1);
                } else {
                  c++;  
                }
            }
            if(c == i){
                q[n] = i+1;
                enumerate(q, n+1);
            }
        }
    } 
        public static boolean isConsistent(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) {
                return false;
            }
            if ((q[i] - q[n]) == (n - i)){
                return false;
            }
            if ((q[n] - q[i]) == (n - i)){
                return false;
            }
        }
        return true;
    }
    public static void printQueens(int[] q) {
        int N = q.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (q[i] == j) {
                    System.out.print("Q ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        /*System.out.println(Arrays.toString(q));
        System.out.println();*/
        
    }

    
    
}
