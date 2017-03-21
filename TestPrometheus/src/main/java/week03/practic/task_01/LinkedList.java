package week03.practic.task_01;

public class LinkedList {
	private Node root;
	private Node node;
    private int size;

	public LinkedList() {
		//PUT YOUR CODE HERE
        root = new Node();
        root.setData(null);
        root.setNext(root);
        this.size = 0;
		//PUT YOUR CODE HERE
	}

	public void add(Integer data) {
                //PUT YOUR CODE HERE
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(root);
		//System.out.println("newNode.getData() = " + newNode.getData());

		if (this.size>0){
		        node = root.getNext();
			    //System.out.println(size + " " + node.getData());

			    while (!node.getNext().equals(root))
				{
					node = node.getNext();
					//System.out.println(size + " " + node.getData());
				}
		        node.setNext(newNode);
		       }
		        else {
		        	root.setNext(newNode);
			        //System.out.println("root.getNext().getData() = " + root.getNext().getData());
			   }

		this.size++;
                //PUT YOUR CODE HERE
	}

	public Integer get(int index) {
		//PUT YOUR CODE HERE
		Integer result = null;
		node = root;
		if (index>=0 && index<size && size>0){
			for (int i=0; i<=index; i++)
			{
				node = node.getNext();
			}
			result = node.getData();
		}
		return result;
		//PUT YOUR CODE HERE
	}

	public boolean delete(int index) {
                //PUT YOUR CODE HERE
		Boolean result = false;
		node = root;
		Node prev = node;

		if (index>=0 && index<size && size>0){
			for (int i=0; i<=index; i++)
			{
				prev = node;
				node = node.getNext();
			}
			prev.setNext(node.getNext());

			this.size--;
			result = true;
		}
		return result;
                //PUT YOUR CODE HERE
	}




	public int size() {
                //PUT YOUR CODE HERE
       return this.size;
                //PUT YOUR CODE HERE
	}

	public static void main(String[] args) {
      LinkedList list = new LinkedList();
        list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("size = " + list.size());

		System.out.println("list.get(-1) = " + list.get(-1));
		System.out.println("list.get(0) = " + list.get(0));
		System.out.println("list.get(1) = " + list.get(1));
		System.out.println("list.get(2) = " + list.get(2));
		System.out.println("list.get(3) = " + list.get(3));
		System.out.println("list.get(4) = " + list.get(4));
		System.out.println("list.get(5) = " + list.get(5));
		System.out.println("list.get(6) = " + list.get(6));
		System.out.println("list.get(7) = " + list.get(7));

		System.out.println("list.delete(0) = " + list.delete(0));
		System.out.println("size = " + list.size());
		System.out.println("list.delete(-1) = " + list.delete(-1));
		System.out.println("size = " + list.size());
		System.out.println("list.delete(5) = " + list.delete(5));
		System.out.println("size = " + list.size());
		System.out.println("list.delete(3) = " + list.delete(3));
		System.out.println("size = " + list.size());


		System.out.println("list.get(-1) = " + list.get(-1));
		System.out.println("list.get(0) = " + list.get(0));
		System.out.println("list.get(1) = " + list.get(1));
		System.out.println("list.get(2) = " + list.get(2));
		System.out.println("list.get(3) = " + list.get(3));
		System.out.println("list.get(4) = " + list.get(4));
		System.out.println("list.get(5) = " + list.get(5));
		System.out.println("list.get(6) = " + list.get(6));
		System.out.println("list.get(7) = " + list.get(7));
	}
}  