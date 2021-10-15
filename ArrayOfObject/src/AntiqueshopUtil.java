
import java.util.Random;

public class AntiqueshopUtil {
    public static Vase getRandomVase(){
        String fullname = myUtil.myUtil.getRandomFirstName() + " " + myUtil.myUtil.getRandomLastName();
        Vase result = new Vase(myUtil.myUtil.randIntInRange(50, 300), myUtil.myUtil.getRandomVaseMaterial(), myUtil.myUtil.getRandomColor(), myUtil.myUtil.randIntInRange(1000, 1000000), fullname);
        return result;
    }
    
    public static Statue getRandomStatue(){
        String fullname = myUtil.myUtil.getRandomFirstName() + " " + myUtil.myUtil.getRandomLastName();
        Statue result = new Statue(myUtil.myUtil.randIntInRange(1000, 3000), myUtil.myUtil.getRandomColor(), myUtil.myUtil.getRandomStatueMaterial(), myUtil.myUtil.randIntInRange(10, 300), fullname);
        return result;
    }
    
    public static Painting getRandomPainting(){
        int value = myUtil.myUtil.randIntInRange(1000, 3000);
        int height = myUtil.myUtil.randIntInRange(30, 200);
        int width = myUtil.myUtil.randIntInRange(30, 200);
        boolean isWaterColor = (new Random().nextBoolean());
        boolean isFramed = (new Random().nextBoolean());
        String fullname = myUtil.myUtil.getRandomFirstName() + " " + myUtil.myUtil.getRandomLastName();
        Painting result = new Painting(myUtil.myUtil.randIntInRange(1000, 3000), myUtil.myUtil.randIntInRange(1000, 3000), myUtil.myUtil.getRandomPaintingMaterial(), true, true, 2000, fullname);
        return result;
    }
}
