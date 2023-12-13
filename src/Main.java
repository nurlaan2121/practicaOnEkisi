import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(45, 7, 48, 9, 8, 4));
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("set1.size() = " + set1.size());
        set1.clear();
        System.out.println("set1.isEmpty() = " + set1.isEmpty());
        set1.add(45);
        Set<Integer> treeset = new TreeSet<>(set1);
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(455, 488, 84756, 8465));
        set1.addAll(linkedList);
        Set<Integer> set2 = new HashSet<>(Set.of(7, 444, 6, 546));
        System.out.println("set1.equals(set2) = " + set1.equals(set2));
        int[] massive = new int[set2.size()];
        int counter = 0;
        for (Integer ee : set2) {
            massive[counter] = ee;
            counter++;
        }
        System.out.println("massive = " + Arrays.toString(massive));


        //TREE SET TASKS
        Set<Integer> treeset2 = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            treeset2.add(new Random().nextInt(1, 50));
        }
        Set<Integer> treeset3 = new TreeSet<>(Set.of(45, 78));
        treeset3.addAll(treeset2);
        System.out.println("treeset3.size() = " + treeset3.size());
        System.out.println("treeset3.equals(treeset2) = " + treeset3.equals(treeset2));
        Set<Integer> treeser4 = new TreeSet<>();
        Iterator<Integer> iterator5 = treeset2.iterator();
        while (iterator5.hasNext()) {
            if (iterator5.next() < 7) {
                treeser4.add(iterator5.next());
            }
        }
        System.out.println("treeser4 = " + treeser4);
        Set<Integer> treesen5 = new TreeSet<>(Set.of(45, 8, 7, 4, 5646, 6));
        System.out.println("treesen5 = " + treesen5);
        Set<Integer> treeSet5 = new TreeSet<>((s1, s2) -> -s1-s2);
        treeSet5.addAll(treesen5);
        reverseSet(treeSet5);
        System.out.println("treeSet5  reversed=  " + treeSet5);

        System.out.println("Write {8} numbers: ");
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        try {
            for (int i = 0; i < 8; i++) {
                int num = new Scanner(System.in).nextInt();
                integerLinkedList.add(num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Write numbers");
        }
        System.out.println("metod(integers) = " + metod(integerLinkedList));


        System.out.println("Write number S PROBELOM  example: (456 46 7 46 8 46)");
        String number = new Scanner(System.in).nextLine();
        String [] srr =  new String[number.trim().split(" ").length];
        if (number.contains("1") ||number.contains("2") ||number.contains("3") ||number.contains("4") ||number.contains("5") ||number.contains("6") ||number.contains("7") ||number.contains("8") ||number.contains("9")){
            srr = number.trim().split(" ");
        }
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < srr.length; i++) {
            integers.add(Integer.valueOf(srr[i]));
        }
        System.out.println("metod(MENIKI) = " + metod(integers));
        Map<String ,String> map = new HashMap<>();
        Student student = new Student("Nurlan","nurlan@gmail.com");
        map.put(student.getEmail(),student.getName());
        Student student2 = new Student("Erzat","erzat@gmail.com");
        map.put(student2.getEmail(),student2.getName());
        Student student3 = new Student("Timur","timur@gmail.com");
        map.put(student3.getEmail(),student3.getName());
        System.out.println("metodd(map,\"nurlan@gmail.com\") = " + metodd(map, "nurln@gmail.com"));
    }

    private static <T> void reverseSet(Set<T> set) {
        List<T> list = new ArrayList<>(set);
        Collections.reverse(list);
        set.clear();
        set.addAll(list);
    }
    public static Map<Integer,Integer> metod(LinkedList<Integer> lisst){
        Map<Integer,Integer> newMap = new HashMap<>();
        for (Integer rr:
             lisst) {
            if (!newMap.containsKey(rr)){
                newMap.put(rr,1);
            }else {
                newMap.put(rr,newMap.get(rr)+1);
            }
        }
        return newMap;
    }
    public static String metodd(Map<String,String> map,String student) {
            if (map.containsKey(student)){
                return "BAR";
            }
        return "«сиздин базанызда мындай эмайл менен студент бар";
    }


}