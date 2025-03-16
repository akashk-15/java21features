import java.util.*;
class OrderedCollectionFeature {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        System.out.println(STR."first element of the list is \{firstElement}");
        System.out.println(STR."last element of the list is \{lastElement}");
    }    
}