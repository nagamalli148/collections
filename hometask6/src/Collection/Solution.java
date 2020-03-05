package Collection;

public class Solution {

    public static void main(String[] args) 
    {
        CustomList<Integer> list = new CustomList<>();
        
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println("The size of list is "+list.size());
    }

}
