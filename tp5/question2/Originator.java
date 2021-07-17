package question2;

import java.util.*;
public class Originator{
    
    private Map<String,Integer> occurrences;
    private List<String> liste;

   public void setListe(List<String> liste){
      this.liste = liste;
   }
   
   public void setOccurrences(Map<String,Integer> occurences){
      this.occurrences = occurrences;
   }

   public List<String> getListe(){
      return this.liste;
   }
   
   public Map<String,Integer> getOccurrences(){
      return this.occurrences;
   }

   public Memento saveToMemento(){
      return new Memento(this.liste,this.occurrences);
   }
   
   public void getStateFromMemento(Memento memento){
      this.liste = memento.getListe();
      this.occurrences = memento.getOccurrences();
   }
}
