package uniquecharacter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabbccde";

        Set<Character> set = new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                set.remove(str.charAt(i));
            }else{
                set.add(str.charAt(i));
            }
        }

        System.out.println(set);
    }

}
