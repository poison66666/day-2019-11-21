import java.util.*;
import java.lang.String;

public class Solution {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String[] cpdomains = {"900 google.mail.com"};
        for(String cpdomain : cpdomains){
            String[] a = cpdomain.split(" ");
            int n = Integer.valueOf(a[0]);
            String domain = a[1];

            String[] b = domain.split("\\.");
            for(int i =0;i<b.length;i++){
                String[] c = Arrays.copyOfRange(b,i,b.length);
                String sub = String.join(".",c);
                int oldCount = map.getOrDefault(sub,0);
                map.put(sub,oldCount+n);
            }
        }

        List<String> ret = new ArrayList<>();
        for(Map.Entry<String,Integer> e : map.entrySet()){
            String domain = e.getKey();
            int n = e.getValue();
            String s = String.format("%d %s",n,domain);
            ret.add(s);
        }
        System.out.println(ret);
    }
}
