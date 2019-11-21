public class List {
    class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    public Node reverseList(Node head){
        if(head == null){
            return null;
        }
        Node cur = head;
        Node result = null;
        Node last = null;
        while(cur != null){
            if(result == null){
                result = cur;
            }else{
                last.next = cur;
                last = cur;
            }
            cur = cur.next;
        }
        return result;
    }
}
