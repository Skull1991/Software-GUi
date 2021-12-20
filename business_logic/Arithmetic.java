package business_logic;
public class Arithmetic{
    private int first;
    private int second;
    public Arithmetic(int first,int second){
        this.first=first;
        this.second=second;
    }
    public int getfirst(){
        return first;
    }
    public int getsecond(){
        return second;

    }
    public int add(){
        return first+second;
    }
}