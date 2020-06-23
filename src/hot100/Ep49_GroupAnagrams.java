package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ep49_GroupAnagrams {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rets = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length-1 ; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(map.containsKey(s)){
                List<String> ls = map.get(s);
                ls.add(strs[i]);
                map.put(s,ls);
            }else {
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(s,ls);
            }
        }

        return new ArrayList<>(map.values());
    }
}
