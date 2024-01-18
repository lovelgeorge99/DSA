import java.util.*;

public class Q380 {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> array;
    public Q380() {
    map= new HashMap<>();
    array=new ArrayList<>();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)){
            array.add(val);
            map.put(val,array.size()-1);
            return true;
        }
        return false;

    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
           return false;
        }
        int index= map.get(val);
        array.set(index,array.get(array.size()-1));
        array.remove(array.size()-1);
        map.remove(val);
        return true;

    }

    public int getRandom() {
        Random rnd = new Random();
        return array.get(rnd.nextInt(array.size()));


    }

    public static void main(String[] args) {
        Q380 obj = new Q380();
        obj.insert(0);
        obj.insert(1);
        obj.remove(0);
        obj.insert(2);
        obj.remove(1);
        System.out.println(obj.getRandom());


    }
}
