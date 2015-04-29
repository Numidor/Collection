/*
* Counts if anny combination of countries in the input array adds up to the specified number
*/
package intq1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INtQ1 {

    public static void main(String[] args) {
        String[] countries = {"Italy", "France", "USA", "UK", "Germany", "Italy", "Mexico", "USA", "Canada", "Italy"};
        System.out.println( counter(countries, 7) );
        System.out.println( counter(countries, 3) );
    }

    private static boolean counter(String[] countries, int n) {

        List<String> countrySet = new ArrayList<>();
        List<Integer> countryCounts = new ArrayList<>();
        
        for( String country: countries ) {
            int index = countrySet.indexOf( country );
            if (index == -1) {
                countrySet.add( country );
                countryCounts.add( 1 );    
            } else {
                countryCounts.set(index, countryCounts.get( index ) + 1);
            }
        }
        int test, i, k, m;
        int size = countryCounts.size();
        for(i = 0; i<size; i++){
            for(k = 1; k<size; k++){
                for(m = k+1; m<size; m++){
                    test = countryCounts.get(i)+ countryCounts.get(k)+countryCounts.get(m);
                    if(test == n){
                        return true;
                    }
                    m++;
                }
                k++;
            }
            i++;
        }
        return false;
    }
    
}
