void main(){
    LinkedList lst = new LinkedList();
    lst.add(1);
    lst.add("Hello");
    System.out.println(lst);

    System.out.println("its Python");
    Runnable task = () -> { System.out.println("Hello Virtual Thread!"); };
    Thread.startVirtualThread(task);

    int[] arr={9,1,3,4,9};
    Arrays.stream(arr)
            .distinct()
            .sorted()
            .map(e->e*e)
            .limit(2)
            .forEach(System.out::println);

    for (int i=0; i<arr.length; i++){
        for (int j=i+1; j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
//    System.out.println(Arrays.toString(arr));

    Comparator<Long> cmp = Comparator.reverseOrder();

    List<String> list = Arrays.asList("test", "apple", "orange", "apple");
    list.stream()
            .map(e->e.toUpperCase())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(cmp))
            .limit(1)
            .forEach(e-> {
                System.out.println(e);
            });
    ;

}