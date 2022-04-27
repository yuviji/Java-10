package j2048;

public class J2048Pair {
    int first;
    int second;
    
    public J2048Pair(int a, int b){
        this.first = a;
        this.second = b;
    }
    
    public boolean equals(J2048Pair pair){
        return (this.first == pair.first) && (this.second == pair.second);
    }
}
