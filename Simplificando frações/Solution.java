public class Solution {
    public static int[] myFraction(int[] fractions){
        for(int i = 2; i<=fractions[0];){
            if ((fractions[0] % i == 0) && (fractions[1] % i == 0)){
                fractions[0] /= i;
                fractions[1] /= i;
                return myFraction(fractions);
            } else {
                i++;
            }
        }
        return fractions;
    }
}
