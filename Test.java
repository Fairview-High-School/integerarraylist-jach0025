public class Test {
    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();

        System.out.println("Test add(val) and get(index): add 5 values to list, and then get the 20 values from the list");
        System.out.println("Expected: 10 20 30 40 50");
        for(int val=10;val<=50;val+=10) {
            list.add(val);
        }
        System.out.println(list);
        for(int i=0;i<5;i++) {
            System.out.print(List.get[i] + " ");
        }
        System.out.println();

        System.out.println("Test get(index): Try to get the item in invalid index (position 5) from the List");
        System.out.println("Expected: IndexOutOfBoundsException at 5");
    }
}
