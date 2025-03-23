import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        feedDataLists();
    }

    public static void feedDataLists(){

        List<String> list = new ArrayList<>();  // good for storage
        LinkedList<String> linkedList = new LinkedList<>(); // good for operations/ data manipulations
        Vector<String> vector = new Vector<>(); // Vector methods are synchronised, so its thread safe
        Stack<String> stack = new Stack<>(); // Undo redo previous operations are saved.

        for (int i=0; i<100; i++){
            list.add("List Strings"+i);
            linkedList.add("Linked List Strings"+i);
            vector.add("vector List Strings"+i);
            stack.add("stack List Strings"+i);
        }

    }

    public static void feedDataQueue(){
        Queue<String> queue = new PriorityQueue<>();
        Deque<String> deque = new ArrayDeque<>();

    }

    public static void feedDataSet(){
        Set<String> set = new HashSet<>();
        Set<String> linked = new LinkedHashSet<>();
        SortedSet<String> sortedSet = new TreeSet<>();
    }

    public static void feedDataMap(){
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> Linkedmap = new LinkedHashMap<>();
        Map<Integer, String> linkedHashTable = new Hashtable<>();
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
    }


}
