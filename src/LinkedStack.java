/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tesse
 */

interface StackInterface<T>
{
    public T pop();
    public void push(T anEntry);
    public T peek();
    public boolean isEmpty();
    public void clear();
}
public class LinkedStack <T> implements  StackInterface<T> {

    Node topNode;

    public  LinkedStack ()
    {
        topNode=null;
    }

    public void push(T newEntry)
    {
        Node newNode = new Node(newEntry, topNode);
        topNode=newNode;
    }
    public T pop()
    {
        T result = peek();
        if (topNode!=null)
            topNode=topNode.getNext();

        return result;
    }
    public T peek()
    {
        T result = null;
        if(topNode!=null)
            result=topNode.getData();
        System.out.println(result);
        return result;

    }
    public T peek2(){
        T result = null;
        Node tempNode = new Node(null,null);
        if(topNode.next==null)
            return result;
        else {
            System.out.println(topNode.getNext().getData());
            return topNode.getNext().getData();
        }
    }

    public boolean isEmpty()
    {
        return topNode==null;
    }

    public void clear()
    {
        topNode = null;

    }
    private class Node
    {
        private T data;
        private Node next;


        public Node(T initialData, Node initialNext)
        {
            this.data= initialData;
            this.next = initialNext;
        }
        public T getData()
        {
            return this.data;
        }

        public Node getNext()
        {
            return this.next;
        }

        public void setData(T newData)
        {
            this.data = newData;
        }

        public void setNext(Node newNext)
        {
            this.next = newNext;
        }
    }


    public static void main(String args[])
    {
        LinkedStack<String> ls= new LinkedStack<String>();

        ls.push("Jim");
        ls.peek();
        ls.push("Ann");
        ls.peek();
        ls.push("Lisa");
        ls.peek();
        ls.pop();
        ls.peek();
        ls.pop();
        ls.peek();
        ls.push("Ada");
        ls.peek();
        ls.push("Joe");
        ls.peek();
        ls.push("Tess");
        ls.peek();
        ls.peek2();

    }


}
