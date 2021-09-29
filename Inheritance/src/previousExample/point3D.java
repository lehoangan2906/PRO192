
package previousExample;

public class point3D extends Point{
    // Xét mối quan hệ thi lop Point la super-class
    int z;
    
    public point3D(){
        super();
        z = 0;
    }
    
    public point3D(int x, int y){
        super(x, y);
        z = 0;
    }
    
    public point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() +", z=" + z;
    }
}
