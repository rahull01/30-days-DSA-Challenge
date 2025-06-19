class main
{
    public static void main (String[] args) {


         linkedList ln = new linkedList();
        ln.setAtBeginning(30);
        ln.setAtBeginning(65);
       
      //  ln.setAtBeginning(2345);
      ln.setAtEnd(4883);
      ln.setAtAnyposition(654, 3);
      ln.setAtAnyposition(543, 4);
     // ln.DeleteATBeginning();
     ln.DeleteAtEnd();
       ln.printData();
       
       
    }
}