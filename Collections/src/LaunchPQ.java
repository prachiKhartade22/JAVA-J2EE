import java.util.PriorityQueue;

//priority queue
public class LaunchPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PriorityQueue pq=new PriorityQueue();
     pq.add(100);
     pq.add(50);
     pq.add(150);
     pq.add(25);
     pq.add(75);
     pq.add(125);
     pq.add(175);
     System.out.println(pq);
     pq.add(25);//duplicates allowed
     System.out.println(pq);
	}

}
