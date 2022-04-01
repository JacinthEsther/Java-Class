package chapterSixteen.linkedList;

public class LinkedList {
    Node head;
    void addToEnd(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }
    void addToStart(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void addAfter(int insertAfter, int data){
        Node current = head;
        while (current != null) {
            if(current.data == insertAfter) {
                Node node = new Node(data);
                node.next = current.next;
                current.next = node;
                break;
            }
            current = current.next;
        }

    }
    Node deleteLast(){
        Node curr = head;
        if(curr == null || curr.next == null){
            head = null;
            return curr;
        }
        Node nextNode = curr.next;
        while(curr.next != null){
            if(nextNode.next == null){
                curr.next= null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;
    }

    Node deleteStart(){
        if (head!= null){
            Node toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }

    Node deleteAfter(int data){
        Node curr = head;
        Node toDelete = null;
        while (curr!=null){
            if(curr.data == data && curr.next != null){
                toDelete = curr.next;
                curr.next = toDelete.next;
                break;
            }
            curr= curr.next;
        }
        return toDelete;
    }

}
