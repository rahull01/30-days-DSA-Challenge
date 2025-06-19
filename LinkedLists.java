

public class LinkedLists<T> {
     
    LLNode<T> head = null;
   public void InsertFirst(T data)
   {
    LLNode<T> newNode = new LLNode<>(data, null);
    if(head == null)
    {
        head = newNode;
    }
    else
    {
        newNode.next = head;
        head = newNode;
    }
   }

   public void InsertLast(T data)
   {
    LLNode<T> newNode = new LLNode<>(data,null);
    if(head == null)
    {
        head = newNode;
        return;
    }
       LLNode<T> temp = head;
       while(temp.next != null)
       {
        temp = temp.next;
       }
       temp.next = newNode;
    
   }

   public void InsertAtanyPosition(T data , int position)
   {
    LLNode<T> temp = head;
    int index = 0;
    LLNode<T> newNode = new LLNode<>(data, null);

    if(position < 0)
    {
        System.out.println("Invalid Position :" + position);
    }
    if(position == 0)
    {
        InsertFirst(data);
    }
    
    while(temp != null && index < position-1)
    {
        temp = temp.next;
        index++;
    }
    if(temp == null)
    {
        System.out.println("Position is out of range :");
        return;
    }
    newNode.next = temp.next;
    temp.next = newNode;
   
   }
    public void printData() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        LLNode<T> temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
    }
}
