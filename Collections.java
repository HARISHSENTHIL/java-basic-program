// import java.util.ArrayList;
// import java.util.Iterator;
//list interface - add(index, element), size(), clear(), index(), lastindex(), equals(), hashcode(), isempty(), sort(), removeall(), removeif(), removerange(), 

import java.util.*;

public class Collections {
    public static void main(String[] args) {/* 
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add("Vasan");
        list.add("aa");
        list.add("bb");
        list.add("cc");

        System.out.println(list);

        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(list.subList(1, 3));
        System.out.println(list.contains("Vasan"));

        list1.addAll(list);
        System.out.println(list1);

        list.remove("aa");

        System.out.println(list);

        list.set(2, "new");

        System.out.println(list);


        LinkedList<String> llist = new LinkedList<>();
        // LinkedList<String> llist1 = new LinkedList<>();

        llist.add("Vasan");
        llist.add("aa");
        llist.add("bb");
        llist.add("cc");

        System.out.println(llist);

        Iterator<String> li = llist.iterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        Vector<String> lllist = new Vector<>();
        // Vector<String> lllist1 = new Vector<>();

        lllist.add("Vasan");
        lllist.add("aa");
        lllist.add("bb");
        lllist.add("cc");

        System.out.println(lllist);

        Iterator<String> lli = lllist.iterator();
        while (lli.hasNext()) {
            System.out.println(lli.next());
        }

        Stack<String> Stack = new Stack<>();
        // LinkedList<String> llist1 = new LinkedList<>();

        Stack.push("Vasan");
        Stack.push("aa");
        Stack.push("bb");
        Stack.push("cc");

        Stack.pop();

        System.out.println(Stack);
        System.out.println(Stack.peek());
        Iterator<String> s = Stack.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }

        HashSet<String> HashSet = new HashSet<>();

        HashSet.add("Vasan");
        HashSet.add("aa");
        HashSet.add("bb");
        HashSet.add("cc");

        System.out.println(HashSet);

        Iterator<String> it = HashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        TreeSet<String> TreeSet = new TreeSet<>();

        TreeSet.add("Vasan");
        TreeSet.add("aa");
        TreeSet.add("bb");
        TreeSet.add("cc");

        System.out.println(TreeSet);

        Iterator<String> itt = TreeSet.iterator();
        while (itt.hasNext()) {
            System.out.println(itt.next());
        }
        

        LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<>();

        LinkedHashSet.add("Vasan");
        LinkedHashSet.add("aa");
        LinkedHashSet.add("bb");
        LinkedHashSet.add("cc");

        System.out.println(LinkedHashSet);

        Iterator<String> itt = LinkedHashSet.iterator();
        while (itt.hasNext()) {
            System.out.println(itt.next());


        LinkedHashMap<Integer, String> LinkedHashMap = new LinkedHashMap<>();

        LinkedHashMap.put(1,"Vasan");
        LinkedHashMap.put(2,"aa");
        LinkedHashMap.put(3,"bb");
        LinkedHashMap.put(4,"cc");

        System.out.println(LinkedHashMap);
        
        for ( Map.Entry i  : LinkedHashMap.entrySet()) {
            System.out.println(i.getKey()+" "+i.getValue());
        }
        
        TreeMap<Integer, String> TreeMap = new TreeMap<>();

        TreeMap.put(1, "Vasan");
        TreeMap.put(2, "aa");
        TreeMap.put(3, "bb");
        TreeMap.put(4, "cc");

        System.out.println(TreeMap);

        for (Map.Entry ii : TreeMap.entrySet()) {
            System.out.println(ii.getKey() + " " + ii.getValue());
        }
        */

        Hashtable<Integer, String> Hashtable = new Hashtable<>();

        Hashtable.put(1, "Vasan");
        Hashtable.put(2, "aa");
        Hashtable.put(3, "bb");
        Hashtable.put(4, "cc");

        System.out.println(Hashtable);

        for (Map.Entry iii : Hashtable.entrySet()) {
            System.out.println(iii.getKey() + " " + iii.getValue());
        }
    }
}
