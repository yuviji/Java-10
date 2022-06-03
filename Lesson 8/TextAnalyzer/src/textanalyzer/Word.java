package textanalyzer;

public class Word {
    private int count;
    private final String val;
    
    public Word(String val){
        this.count = 1;
        this.val = val;
    }
    
    public String getValue(){
        return this.val;
    }
    public int getCount(){
        return this.count;
    }
    public int getLength(){
        return this.val.length();
    }
    public void setCount(int n){
        this.count = n;
    }
    public boolean equals(Word w){
        return this.val.equals(w.getValue());
    }
}
