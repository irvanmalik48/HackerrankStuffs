import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        char x[] = br.readLine().toCharArray();
        char y[] = br.readLine().toCharArray();
        int a[][] = new int[x.length+1][];
        int dir[][] = new int[x.length+1][];
        int baris, kolom;

        for(int i = 0; i < a.length; i++) {
            a[i] = new int[y.length+1];
            dir[i] = new int[y.length+1];
        }

        for(int i = 1; i < x.length+1; i++) {
            for(int j = 1; j < a[0].length; j++)
            {
                if(x[i-1] == y[j-1]) {
                    a[i][j] = a[i-1][j-1] + 1;
                    dir[i][j] = 1;
                } 
                else {
                    if(a[i-1][j] > a[i][j-1]) {
                        a[i][j] = a[i-1][j];
                        dir[i][j] = 3;
                    }
                    else {
                        a[i][j] = a[i][j-1];
                        dir[i][j] = 2;    
                    }
                }
            }
        }
            
        baris = a.length-1;
        kolom = a[0].length-1;
        System.out.println(a[baris][kolom]);
    }
}