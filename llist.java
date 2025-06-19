public class llist {

    nodes1 head = null;

    public void setAtBeginning1(int data)
    {
        nodes1 newnode = new nodes1(data);
        newnode.next = head;
        head = newnode;
    }
    public void DeleteATBeginning()
    {
    
        if(head == null)
        {
            System.out.println("List is empty");
        }
        head = head.next;
    }

    public void DeleteAtEnd()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }

        if(head.next == null)
        {
          head = null;
        }

        nodes1 temp = head;

        while(temp.next.next != null)
        temp = temp.next;
        temp.next = null;

    }

    public void printD()
    {
        nodes1 temp = head;
        while(temp != null)
        System.out.print(temp.data +"==>");
        temp = temp.next;
    }
    
}
