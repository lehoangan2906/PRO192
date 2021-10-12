public class VIPChef implements VIPMenu, Menu{
    private String name;
    
    @Override
    public void getSalad(){
        System.out.println("This is a salad made by VIP chef");
    }
    
    @Override
    public void getBeefsteak(){
        System.out.println("This is a beefsteak made by VIP chef");
    }
    
    @Override
    public void getSalmon(){
        System.out.println("This is a salmon meal made by VIP chef");
    }

    @Override
    public void getFishEggs(){
        System.out.println("This is a fish egg made by VIP chef");
    }
}
