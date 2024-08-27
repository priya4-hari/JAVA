class Task implements Runnable{
  public void run(){
		  System.out.println("Printed from Thread");
	}
}

class Main{
  public static void main(String args[]){
     
	   Task a = new Task();
    Thread t = new Thread(a);
	   t.start();
	 
  }
}
