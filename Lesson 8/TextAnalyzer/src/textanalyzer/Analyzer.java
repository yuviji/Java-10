package textanalyzer;

import java.util.*;

public class Analyzer {
    public ArrayList<Word> analyze(ArrayList<Word> words, int n) {
        ArrayList<Word> stats = new ArrayList<>();
        for (Word w : words){
            if (w.getLength() >= n){
                int ind = -1;
                for (int i = 0; i < stats.size(); i++){
                    if (stats.get(i).getValue().equals(w.getValue())){
                        ind = i;
                        break;
                    }
                }
                if (ind == -1){
                    stats.add(w);
                }
                else{
                    Word x = stats.get(ind);
                    x.setCount(x.getCount() + 1);
                    stats.set(ind, x);
                }
            }
        }
        stats.sort(Comparator.comparing(Word::getCount).reversed());
        for (int i = stats.size() - 1; i >= 10; i--) stats.remove(i);
        stats.trimToSize();
        return stats;
    }
}
