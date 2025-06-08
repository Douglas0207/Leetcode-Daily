import java.util.Stack;

public class palindromeSLL 
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,3,2,1};
        Node head = LinkedListUtils.createNode(arr);
        LinkedListUtils.printList(head);
        boolean headIsPal = checkPal(head); 
        if(headIsPal)
        {
            System.out.println("Its a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }
    }
    public static boolean checkPal(Node head)
    {
       Node temp = head;
       Stack<Integer> st = new Stack<>();
       while(temp!=null)
       {
        st.push(temp.data);
        temp = temp.next;
       }
       temp = head;
       while(temp!=null)
       {
        if(temp.data != st.peek())
        {
            return false;
        }
        temp = temp.next;
        st.pop();
       }

        return true;
    }
}
