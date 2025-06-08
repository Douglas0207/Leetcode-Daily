public class removeNthNodeSLL 
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,4,5,6,7,8};
        int n = 5;
        Node head = LinkedListUtils.createNode(arr);
        LinkedListUtils.printList(head);
        head = removeNthNode(head,n);
        LinkedListUtils.printList(head);
    }
    public static Node removeNthNode(Node head, int n)
    {
       Node fast = head;
       for(int i=0;i<n;i++)
       {
        fast = fast.next;
       }
       if(fast==null)
       {
        return head.next;
       }
       Node slow = head;
       while(fast.next!=null)
       {
         slow = slow.next;
         fast = fast.next;
       }
       slow.next = slow.next.next;
       return head;
    }
}
