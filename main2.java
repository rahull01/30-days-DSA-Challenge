public class main2 {
    
    public static void main(String[] args) {
        LinkedLists<Object> ls = new LinkedLists<>();
        ls.InsertFirst(543);
        ls.InsertFirst("Rahul");
     
        ls.InsertFirst(987.65);
           ls.InsertFirst(-76);
        ls.InsertLast(500);
        ls.InsertLast(900);
        ls.InsertAtanyPosition(300, 2);
        ls.InsertAtanyPosition("Rohan", 4);
        ls.printData();
    }
}
