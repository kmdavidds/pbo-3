import java.util.HashMap;
import java.util.StringTokenizer;

public class TugasPraktikum {
    public static void main(String[] args) {
        String string = "Saya belajar bahasa Java. Bahasa Java mempunyai kelas berupa String. Belajar String Java itu mudah. String Java juga sering diimplementasikan.";
        StringTokenizer st = new StringTokenizer(string, ". ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (map.containsKey(token)) {
                map.put(token, map.get(token) + 1);
            } else {
                map.put(token, 1);
            }  
        }
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
