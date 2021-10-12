public class AntiqueShop {
    public static void main(String[] args) {
        Vase v1 = new Vase();
        v1.input();
	v1.output();
	System.out.println("value of v1:" + v1.getValue());

	Item tmp=v1;
	System.out.println("value of tmp:" + tmp.getValue());
	tmp.input();
	tmp.output();	
    }
    
}
