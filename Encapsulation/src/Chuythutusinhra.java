class ParentClass{
    int cuaCha;
    
    public ParentClass(int x){
        cuaCha = x;
    }
}

class SubClass extends ParentClass{
    int cuaCon;

    public SubClass(int cuaCon, int x) {
        super(x);
        this.cuaCon = cuaCon;
    }
    
    
}

public class Chuythutusinhra {
    // Chú ý thứ tự các tham số sinh ra, để sau này sử dụng
    public static void main(String[] args){
        int cuaCon = 5; 
        int cuaCha = 100;
        SubClass sub = new SubClass(cuaCon, cuaCha);
    }
}
