public class linkedList {

    nodes head = null;

    public void setAtBeginning(int data) {
        nodes newNode = new nodes(data);
        newNode.nexNodes = head;
        head = newNode;
    }

    public void setAtEnd(int data) {
        nodes newNode = new nodes(data);
        if(head == null) {
            head = newNode;
            return;
        }
        nodes temp = head;
        while(temp.nexNodes != null) {
            temp = temp.nexNodes;
        }
        temp.nexNodes = newNode;
    }

    public void setAtAnyposition(int data, int position) {
        nodes newNode = new nodes(data);
        if(position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        if(position == 0) {
            newNode.nexNodes = head;
            head = newNode;
            return;
        }
        nodes temp = head;
        int index = 0;
        while(temp != null && index < position - 1) {
            temp = temp.nexNodes;
            index++;
        }
        if(temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newNode.nexNodes = temp.nexNodes;
        temp.nexNodes = newNode;
    }

    public void DeleteATBeginning()
    {
    
        if(head == null)
        {
            System.out.println("List is empty");
        }
        head = head.nexNodes;
    }

    public void DeleteAtEnd()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }

        if(head.nexNodes == null)
        {
          head = null;
        }

        nodes temp = head;

        while(temp.nexNodes.nexNodes != null)
        temp = temp.nexNodes;
        temp.nexNodes = null;

    }

    public void printData() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        nodes temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.nexNodes;
        }
        System.out.println(" ");
    }
}