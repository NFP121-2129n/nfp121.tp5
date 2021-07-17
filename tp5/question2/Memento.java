package question2;

import java.util.*;

public class Memento
{
    private List<String> liste;
    private Map<String,Integer> occurrences;
    
    public Memento(List<String> liste, Map<String,Integer> occurrences){
        this.liste = liste;
        this.occurrences = occurrences;
    }
    
    public List<String> getListe(){
        return this.liste;
    }
    public Map<String,Integer> getOccurrences(){
        return this.occurrences;
    }


}
