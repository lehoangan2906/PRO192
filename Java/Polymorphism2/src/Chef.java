public class Chef implements Menu{
    private String name;
    
    @Override
    public void getSalad(){
        System.out.println("This is a salad");
    }
    
    @Override
    public void getBeefsteak(){
        System.out.println("This is a beefsteak");
    }

}

// The Chef class will implement Menu's methods