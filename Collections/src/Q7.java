import java.util.*;

//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
// then print the one which came first.
class Charfreq implements  Comparable
{
       private Integer key;
        private Integer frequency;

    public Charfreq(Integer key, Integer frequency) {
        this.key = key;
        this.frequency = frequency;
    }

    public Integer getKey() {
        return key;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Charfreq charfreq = (Charfreq) o;
        if((this.key.compareTo(charfreq.key))==0)
             return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, frequency);
    }

    public Integer getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Charfreq{" +
                "key=" + key +
                ", frequency=" + frequency +
                '}';
    }

    @Override
    public int compareTo(Object o)
    {
        Charfreq charfreq = (Charfreq) o;
            if((this.frequency-charfreq.frequency)>0)
                return -1;
            else if((this.frequency-charfreq.frequency)<0)
                return 1;
            else {
                    return (0);
                 }

    }
}
public class Q7
{

    public static void main(String[] args)
    {
        Integer arr [] = {4,7,4,1,4,8,9,9,7,3};
       // List<Integer> list = Arrays.asList(arr);
        List<Charfreq> freq = new ArrayList<Charfreq>();
        for(Integer i : arr)
        {
            Charfreq temp = new Charfreq(i,1);
            if(!freq.contains(temp))
            {
                freq.add(temp);
            }
            else
            {
                int index = freq.indexOf(temp);
                System.out.println(index);
                int fretemp = (freq.get(index).getFrequency());
                System.out.println("Frequency : "+fretemp + "index" + index);
                    freq.get(index).setFrequency(++fretemp);
            }
        }
        System.out.println("Before Sorting on frequency : ");
        for(Charfreq c : freq)
            System.out.println(c);
        Collections.sort(freq);
        System.out.println("After Sorting on frequency : ");
        for(Charfreq c : freq)
            System.out.println(c);

    }
}
