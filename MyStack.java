public class MyStack<E> {
    public ListNode<E> pHead;
    public int count;

    public void push(E x){
        if(isEmpty()){
            ListNode<E> listNode = new ListNode(x);
            count++;
            pHead = listNode;
        }else{
            ListNode<E> listNode = new ListNode(x);
            listNode.next = pHead;
            pHead = listNode;
            count++;
        }
    }
    public E pop(){
        if(!isEmpty()){
            ListNode<E> h = pHead;
            pHead = pHead.next;
           count--;
            E x = h.val;
            return x;
        }
        return null;
    }
    public E peek(){
        if(!isEmpty()){
            ListNode<E> h = pHead;
            return h.val;
        }
        return null;
    }

    public boolean isEmpty(){
        if(count == 0){
            return  true;
        }
        return false;
    }

}

class ListNode<E>{
    public ListNode next;
    public E val;

    public ListNode(E val) {
        this.val = val;
    }
}
