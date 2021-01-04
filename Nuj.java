import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Nuj {
  public static void main(String[] args) {
    LinkedList<Integer>nujsua=new LinkedList<>();
    LinkedList<String>book=new LinkedList<>();
    // book.add("java ");
    // book.add("PHP ");
    // book.add("html");
    // book.addFirst("js");
    // book.addLast("jsp");
    // book.add(2,"reat");
    // book.delete("java");
    // System.out.println(book); 

    nujsua.add(8);
    nujsua.add(16);
    nujsua.add(20);
    nujsua.addLast(1);

    nujsua.add(1,14);
    nujsua.remove(2);
    System.out.println(nujsua);
    nujsua.add(2,20);
    nujsua.addFirst(7);


    System.out.println(nujsua);
  }

  
}
