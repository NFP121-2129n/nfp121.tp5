package question2;


import java.util.*;
public class CareTaker
{
   private Stack<Memento> mementoStack = new Stack<Memento>();

   public void add(Memento m){
      mementoStack.push(m);
   }

   public Memento rollBack(){
      if(mementoStack.isEmpty()) return new Memento(new LinkedList(), new HashMap<String,Integer>());
      Memento temp = mementoStack.pop();
      if(mementoStack.isEmpty()){
          add(temp);
          return temp;
      }
      return mementoStack.peek();
   }
}
