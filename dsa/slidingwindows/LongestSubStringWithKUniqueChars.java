package dsa.slidingwindows;

import java.util.HashMap;

public class LongestSubStringWithKUniqueChars {

    public static void main(String[] args) {


        String str= "aabacbebebe";
        str= "joizyglhbetjlvglzvvktxqsslufceppzpgogrifbeyuiblmgcqtkhhbimxigczvbtvrtsperlhunsyywgnttbwjgunjwjtqzqvrdumddtzaffcmjlakmfappoqqkvmfnevaabqxtzslodalgvtwvbsknohmjcumrrqktskvidbizexkprdonsjkbcoeplcafdalmvfaswnjkiqcwowhykczbdkankmkrrwsmcomaubfelnljztemcbmmoptndjodpqnikglvraezkvfxcphvgdgkouirhidbdtesjogrilbxhgtqprexyxptbqdxnwsuddzoiuumlbbgmhuzbgaslssvtexzlipsqfrfvxbkxmazocqvtaguvxmoqvhkfklucswkizrpatpakmuswqdsmxtnuujewtwtrnofowrgmxegwkxokotqhfodaegkmopjpdvpxzjrunwfqeldjhajnjzaargszgxakniopptsoakustvpbtocrovfceofpbeddqeidyvosbwbspesilldkdvocbfrbzthbgsnzaabjfbeanwoicritttjvkromyiodiazfgzktgkeqjmojamqrdusaibheiivnvmokacqudrcairqtisixcjxjsdubgusrcpleludvkjiabbeukbeadqruccuhwcrgosagtuyjfhnaniapxkrqdbmdsbxrzriyszsoguditxxpvdopzktljyrdzxunnybfzfqoezhizbustnwlpqypfqtgxapvwrcybnsjfrsdhyafsdglucczqtoazaycxybnlratmdqphtdwqsddhkrhvbgsytp";
//        System.out.println(longestSubStringWithKUniqueChars(str,3));
//        System.out.println(longestSubStringWithKUniqueChars(str,5));
        System.out.println(longestSubStringWithKUniqueChars(str,10));
    }

    private static Integer longestSubStringWithKUniqueChars(String str, int k) {

        int n = str.length();
        int i=0, j= 0;

        Integer max = Integer.MIN_VALUE;
        HashMap<Character,Integer> countMap = new HashMap<>();

        while(j < n){

            countMap.put(str.charAt(j), countMap.containsKey(str.charAt(j))? countMap.get(str.charAt(j)) + 1 : 1);

            if(countMap.size() < k){
                j++;
            }else if (countMap.size() == k){

                max = max > (j-i+1)? max : (j-i+1);
                j++;
            }else if(countMap.size() > k){

                while(countMap.size() > k){

                    if(countMap.containsKey(str.charAt(i))){
                        countMap.put(str.charAt(i), countMap.get(str.charAt(i)) - 1);

                        if(countMap.get(str.charAt(i)) == 0){
                            countMap.remove(str.charAt(i));
                        }

                        i++;
                    }else{
                        i++;
                    }
                }

                if(countMap.size() == k){
                    max = max > (j-i+1)? max : (j-i+1);
                    j++;
                }
            }
        }
        if(max == Integer.MIN_VALUE){
            return -1;
        }
        return max;
    }
}
