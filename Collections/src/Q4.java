import java.util.*;

//Write a program to sort HashMap by value.
public class Q4 {
    static HashMap<Character, Integer> sortByVal(HashMap<Character, Integer> map) {
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        List<Map.Entry<Character, Integer>> l = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                return (entry1.getValue() - entry2.getValue());
            }
        });

        for (Map.Entry<Character, Integer> t : l) {
            temp.put(t.getKey(), t.getValue());
            //System.out.println(t.getKey() + " : "+ t.getValue());
        }
        for(Map.Entry<Character,Integer> entry : temp.entrySet())
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        return temp;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character,Integer> freq = new HashMap<>();
        int i=0;
        while(i<str.length())
        {
            Character temp = str.charAt(i);
            if(!freq.containsKey(temp))
            {
                freq.put(str.charAt(i),1);
            }
            else
            {
                Integer in = (Integer)(freq.get(temp));
                in = in +1;
                freq.replace(temp,in);
            }
            i++;
        }
        System.out.println("Before Sorting:");
        for(Map.Entry entry : freq.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
       HashMap<Character,Integer> sortmap = Q4.sortByVal(freq);
        System.out.println("After Sorting:");
        for(Map.Entry entry : sortmap.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
