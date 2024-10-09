
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc1786_mergestring {

    /*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, 
 * and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
     */
    public static void main(String[] args) {
        lc1786_mergestring solution = new lc1786_mergestring();
        String result = solution.mergeAlternately("abc", "12");
        System.out.println(result);
    }

    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int combined = word1.length() + word2.length();
        int i = 0;

        while (i != combined)
        {
            if (i < word1.length())
            {
                result += word1.charAt(i);
            }
            if (i < word2.length())
            {
                result += word2.charAt(i);
            }
            i++;
        }

        return result;
    }
}
