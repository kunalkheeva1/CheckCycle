public class CheckCycle {

    //Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public static boolean checkCycle(Node head){
        if(head== null|| head.next== null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
                slow = slow.next;
                if(slow == fast){
                    return true;
            }
        }return false;
    }
    public static void main(String[] args) {

    }
}
