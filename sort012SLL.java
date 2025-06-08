public class sort012SLL 
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,1,2,0,0,1,2,0,2,2,1,0,1,2,0};
        Node head = LinkedListUtils.createNode(arr);
        LinkedListUtils.printList(head);
        head = sortBy012(head);
        LinkedListUtils.printList(head);
    }
    public static Node sortBy012(Node head)
    {
        // brute force must have 3 counters of 012 and then traverse again and change the data
        Node zeroHead = new Node(-1, null);
        Node oneHead = new Node(-1, null);
        Node twoHead = new Node(-1, null);
        
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        while(temp!=null)
        {
            if(temp.data==0)
            {
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data==1)
            {
                one.next = temp;
                one = temp;
            }
            else
            {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
       
        zero.next = (oneHead.next!=null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next=null;

       return zeroHead.next;
    }

}
