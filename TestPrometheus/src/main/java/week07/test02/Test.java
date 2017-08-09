package week07.test02;

class Test extends Exception { }
  
class Main {
   public static void main(String args[]) {




      try {
         throw new Test();
      }
      catch(Test t) {
         System.out.print("A");
      }
      finally {
         System.out.print("B");
      }
  }
}