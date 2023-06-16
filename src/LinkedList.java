class LinkedList<I extends Number> {
    private ListNode head;

    public void add(I v) {
    }

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        ListNode current = head ;
        int count =0 ;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }


//    ------------------------------------ Insert ------------------------
    public void insertBeggining(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    public void inserLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null ){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){

            current = current.next;
        }
        current.next = newNode;

    }

    public void insert_Given_Position(int value , int position){
        ListNode node = new ListNode(value);
        if(head == null){
            node.next= head;
            head = node;
        }else {
            ListNode current = head;
            int count = 1;
            while( count < position-1){
                current = current .next;
                count++;
            }
            ListNode past = current.next;
            current.next = node;
            node.next =past;
        }
    }


//    ------------------------------------- Delete ----------------------------
    public  ListNode delete_First(){
        if(head == null ){
            return null;
        }
        ListNode temp = head ;
        head =  head.next;
        temp.next = null;
        return temp;
    }

    public ListNode delete_lastNode(){
        if(head == null && head.next == null){
            return null;
        }
        ListNode current =head ;
        ListNode privious = null;
         while(current.next != null){
              privious = current;
              current = current.next;
         }
         privious.next = null ;
         return current;
    }

    public void delete_Given_position(int position){
        if(position == 1){
            ListNode temp = head;
            head =head.next;
            temp = null;
        }else {
            ListNode privious = head;
            int count = 1 ;
            while (count < position -1){
                privious = privious.next;
                count++;
            }
           ListNode current = privious.next;
            privious.next = current.next;
        }
    }


//    -------------- Search Element of the Linked List -----------------
    public boolean searchElement(int  searchKey){
        ListNode current = head ;
        while(current != null){
            if(current.data == searchKey ){
                return true;
            }
            current=current.next;
        }
        return false;
    }


//    ----------------- Reverse Of the Linked List ---------------
    public ListNode reverse_LinkedList(ListNode head){
        if(head == null) return head;
        ListNode current = head;
        ListNode privious = null;
        ListNode next = null ;
        while(current != null){
            next= current.next;
            current.next = privious;
            privious = current;
            current =next;
        }
        return privious;
    }

//    ----------- Merge Two Sorted List -----------------
    public ListNode mergeTwoLists(ListNode List1, ListNode List2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(List1 != null && List2 != null){
            if(List1.data <= List2.data){
                tail.next =List1;
                List1=List1.next;
            }else{
                tail.next = List2;
                List2= List2.next;
            }
            tail=tail.next;
        }
        if(List1 == null){
            tail.next =List2;
        }else{
            tail.next = List1;
        }
        return dummy.next;
    }

//    ----------------------Find nth node from the end of the linked List-----------------

    public int nthNodeFromTheEnd(int n){
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0 ;
        while (count < n){
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr.data;
    }


    public static void main(String[] args) {
        LinkedList<Number> sll = new LinkedList<Number>();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode forth = new ListNode(40);
        sll.head.next =second;
        second.next = third ;
        third.next = forth;
        sll.insertBeggining(9);
        sll.insertBeggining(8);

        sll.inserLast(50);
        sll.inserLast(60);


        sll.insert_Given_Position(25,5);
        sll.insert_Given_Position(35,7);

        sll.delete_First();
        sll.delete_lastNode();
        sll.delete_Given_position(4);


        System.out.println("length of the Singly linked  list : " + sll.length());
        sll.display();
        System.out.println("Index of the search Key is : "+ sll.searchElement(9));
        int nthNode =sll.nthNodeFromTheEnd(5);
        System.out.println(nthNode);




    }

}