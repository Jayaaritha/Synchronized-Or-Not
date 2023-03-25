package Thread;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;




public class ThreadCheck extends Thread{
	
	static String check;
		
	 @SuppressWarnings("static-access")
	ThreadCheck(String check)
	{
	    this.check=check;	
	}
	
 public static void main(String[] args)
 {
	 
	 //List check:
	 
	 //arrayListCheck();
	 //linkedListCheck();
	// vectorCheck();
	 
	 //Queue:
	 
	 priorityQueueCheck();
	 arrayDequeCheck();
	 
	 //set:
	 
	 hashSetCheck();
	 linkedHashSetCheck();
	 
	 
  }
 
 public static void vectorCheck()
 {
	 Vector<Integer> vector = new Vector<Integer>();
	 Runnable task = () -> {
         for (int i = 1; i <100; i++) {
        	 vector.add(i);
         }
     };

     Thread thread1 = new Thread(task);
     Thread thread2 = new Thread(task);
     Thread thread3 = new Thread(task);
    

     thread1.start();
     thread2.start();
     thread3.start();
    

     
     try {
     	thread1.join();
			thread2.join();
			thread3.join();
	       
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
      System.out.println("Size of list: " + vector.size());
 }
 
 public static void linkedListCheck()
 {
		List<Integer> list = new LinkedList<Integer>();

     Runnable task = () -> {
         for (int i = 1; i <100; i++) {
             list.add(i);
         }
     };

     Thread thread1 = new Thread(task);
     Thread thread2 = new Thread(task);
     Thread thread3 = new Thread(task);
    

     thread1.start();
     thread2.start();
     thread3.start();
    

     
     try {
     	thread1.join();
			thread2.join();
			thread3.join();
	       
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
System.out.println("Size of list: " + list.size());
 }
 
 public static void arrayListCheck()
 {
	 List<Integer> list = new ArrayList<Integer>();
	 

     Runnable task = () -> {
         for (int i = 1; i <100; i++) {
             list.add(i);
         }
     };

     Thread thread1 = new Thread(task);
     Thread thread2 = new Thread(task);
     Thread thread3 = new Thread(task);
    

     thread1.start();
     thread2.start();
     thread3.start();
    

     
     try {
     	thread1.join();
			thread2.join();
			thread3.join();
	       
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       System.out.println("Size of list: " + list.size());
 }
 
 //--------------------------------------------------------------------------------------
 
 
 public static void priorityQueueCheck() {
	    Queue<Integer> list = new PriorityQueue<Integer>();

	    Runnable task = () -> {
	        for (int i = 1; i < 10; i++) {
	            list.add(i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
         System.out.println("\nSize of list: " + list.size());
	    while (!list.isEmpty()) {
	        System.out.print(list.poll() + " ");
	    }

	    
	}
 
 public static void arrayDequeCheck() {
	    Queue<Integer> list = new ArrayDeque<Integer>();

	    Runnable task = () -> {
	        for (int i = 1; i < 10; i++) {
	            list.add(i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
      System.out.println("\nSize of list: " + list.size());
	    while (!list.isEmpty()) {
	        System.out.print(list.poll() + " ");
	    }

	    
	}
 
 //-----------------------------------------------------------------------------------------
 
 public static void treeMapCheck() {
	    Map<Integer,String> list = new TreeMap<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 100; i++) {
	            list.put(i, "as"+i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
      System.out.println("\nSize of list: " + list.size());


	    
	}
 
 public static void hashMapCheck() {
	    Map<Integer,String> list = new HashMap<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 1000; i++) {
	            list.put(i, "as"+i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
   System.out.println("\nSize of list: " + list.size());


	    
	}
 
 
 public static void hashSetCheck() {
	    Set<Integer> list = new HashSet<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 1000; i++) {
	            list.add(i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
   System.out.println("\nSize of list: " + list.size());
  
	}
 
 public static void treeSetCheck() {
	    Set<Integer> list = new HashSet<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 100; i++) {
	            list.add(i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
   System.out.println("\nSize of list: " + list.size());
  
	}
 
 public static void linkedHashSetCheck() {
	    Set<Integer> list = new LinkedHashSet<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 100; i++) {
	            list.add(i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
System.out.println("\nSize of list: " + list.size());

	}
 
 public static void linkedHashMapCheck() {
	    Map<Integer,String> list = new LinkedHashMap<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 1000; i++) {
	            list.put(i,"a"+i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
System.out.println("\nSize of list: " + list.size());

	}
 
 public static void linkedHashTableCheck() {
	    Map<Integer,String> list = new Hashtable<>();

	    Runnable task = () -> {
	        for (int i = 1; i < 1000; i++) {
	            list.put(i,"a"+i);
	        }
	    };

	    Thread thread1 = new Thread(task);
	    Thread thread2 = new Thread(task);
	    Thread thread3 = new Thread(task);

	    thread1.start();
	    thread2.start();
	    thread3.start();

	    try {
	        thread1.join();
	        thread2.join();
	        thread3.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
System.out.println("\nSize of list: " + list.size());

	}
 
    
}




