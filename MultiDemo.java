class MultiDemo extends Thread{  
  public void run(){  
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     MultiDemo obj=new MultiDemo();   
     obj.start();  
  }  
}