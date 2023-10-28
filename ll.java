public class ll{
   
    Node head;
    
    public int size=0;

    public class Node{
    Integer data;
    Node next;

    Node( int data){
        this.data = data;
        this.next=null;
        size++;
    }
   }
 
  //add first

    public void addFirst(int data){
          Node newNode = new Node(data);
        newNode.data = data;
        newNode.next=head;
        head= newNode;
     
    }
 
   // printlist

    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+"  ");
            currNode = currNode.next;
        }
    }

    //addLast

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
          
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
     
    }

    //removeFirst    
    
    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=this.head.next;
       size--;
    }

    //removeLast

    public void removeLast(){
          if(head==null){
            System.out.println("list is empty");
            return;
        }
          size--;
          if(head.next==null){
            head=null;
            
            return;
        }
       
        Node prv = head;
        Node nex = head.next;
        while(nex.next!=null){
            prv= prv.next;
            nex= nex.next;
        }
        prv.next= null;
       
    }

    // size

    public int printSize(){
        return size;
    }
    public static void main(String args[]){
        
          ll list = new ll();
          list.addFirst(0);
          list.addFirst(8);
          list.addFirst(4);
          list.addFirst(8);
           list.addLast(3);
           list.addLast(6);
           list.removeFirst();
           list.removeFirst();
           list.removeLast();
           list.printList();
           System.out.println();
           System.out.println(list.printSize()); 
    }
}
