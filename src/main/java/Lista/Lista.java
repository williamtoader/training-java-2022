package LinkList;

public class Lista {

    private Node start;

    public class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Lista(){};

    public void printList(){
        Node n = start;
        if(start == null)
            System.out.println("Lista e goala");
        while(n.getNext() != null)
        {
            System.out.println(n.getVal());
            n = n.getNext();
        }
    }

    public void add(int val){
        Node aux = new Node(val);
        aux.next = null;

        if(start == null) {
            start = aux;
            return;
        }

        Node n = start;

        while(n.getNext() != null)
        {
            n = n.getNext();
        }
        n.setNext(aux);
    }

    public int size(){
        int s = 0;
        if(start == null) {
            return 0;
        }

        Node n = start;

        while(n.next != null) {
            s++;
            n = n.getNext();
        }
        return s;
    }

    public void addAtPosition(int val, int position){
        if(position == 0)
        {
            Node aux = new Node(val);
            aux.next = start;
            start = aux;
        }
        if(position > size()) {
            System.out.println("Pozitia este prea mare");
            return;
        }

        Node n = start;
        int counter =0;
        while (n.next != null){
            if(counter++ == position){
                Node nextNode = n.next;
                Node aux = new Node(val);
                aux.next = nextNode;
                n.next = aux;
                return;
            }
            n = n.next;
        }
    }

    public int inspectPosition(int position){
        Node n = start;
        int counter =0;
        while (n.next != null) {
            if (counter++ == position) {
                return n.val;
            }
            n = n.next;
        }
        return 0;
    }

    public void removePosition(int position){
        if(size() == 0){
            System.out.println("Lista goala");
        }
        if(position == 0)
        {
            start = start.next;
            return;
        }
        if(position > size()) {
            System.out.println("Pozitia este prea mare");
            return;
        }

        Node n = start;
        int counter =0;
        while (n.next != null){
            if(counter++ == position){
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }

    public void setAtPosition(int val, int position){
        if(size() == 0){
            System.out.println("Lista goala");
        }
        if(position == 0)
        {
            start.val = val;
            return;
        }
        if(position > size()) {
            System.out.println("Pozitia este prea mare");
            return;
        }

        Node n = start;
        int counter =0;
        while (n.next != null){
            if(counter++ == position){
                n.val = val;
                return;
            }
            n = n.next;
        }
    }

}
