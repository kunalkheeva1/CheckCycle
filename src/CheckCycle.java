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
        //two pointers point towards the head
        Node slow = head;
        Node fast = head;
        //loop until the fast reaches to the end
        while(fast!=null && fast.next!=null){
            //until then move fast by two points
            fast= fast.next.next;
            //slow by one point
                slow = slow.next;
                //where they match return true
                if(slow == fast){
                    return true;
            }//otherwise false
        }return false;
    }
    public static void main(String[] args) {

    }
}
