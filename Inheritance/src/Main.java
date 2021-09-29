import previousExample.*;
import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
        
        p1 = new Point(5, 6);
        System.out.println(p1);

        
        point3D p2 = new point3D();
        System.out.println(p2);
        
        p2 = new point3D(5, 6); // day la truong hop suy bien tu 3D thanh 2D trong do tat ca thong tin ve z deu bang 0 (is - a)
        System.out.println(p2);
        
        p2 = new point3D(5, 6, 7);
        System.out.println(p2);
        System.out.println("============================");
        
        Employees Em = new Employees();
        System.out.println(Em);
        
        Em = new Employees("E1002", "Tran Dinh", "Tuan", new Date(1900, 5, 24));
        System.out.println(Em);
        System.out.println("============================");
        
        FulltimeEmp Fu = new FulltimeEmp();
        System.out.println(Fu);
        System.out.println("============================");
        
        Fu = new FulltimeEmp("E1006", "Dinh", "Kien", new Date(2001, 5, 9), 8300000, 10000000);
        System.out.println(Fu);
        System.out.printf("Fu has salary: %,.0f\n",  Fu.getSalary());
    }
}
