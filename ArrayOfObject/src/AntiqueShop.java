import java.util.*;

public class AntiqueShop {
    public static void main(String[] args) {
        ItemList itemlist = new ItemList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        do{
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of given type items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. sample data (10 - 100 items)");
            System.out.println("11. exit");
            System.out.print("input your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    // add a new vase
                    Item vase = new Vase();    // a Vase object is created
                    vase.input();
                    
                    if(itemlist.addItem(vase)){
                        System.out.println("added");
                    }
                    break;
                case 2:
                    // add a new statue
                    Item statue = new Statue();
                    statue.input();
                    if(itemlist.addItem(statue)){
                        System.out.println("added");
                    }
                    break;
                case 3:
                    // add a new painting
                    Item painting = new Painting();
                    painting.input();
                    if(itemlist.addItem(painting)){
                        System.out.println("added");
                    }
                    break;
                case 4:
                    // display all items
                    System.out.println(" ");
                    System.out.println("================================= List of items =================================");
                    itemlist.displayAll();
                    break;
                case 5:
                    // find the item by the creator
                    String creator = sc.nextLine();
                    Item result = itemlist.findItems(creator);
                    if (result == null){
                        System.out.println("the item is not there");
                    }else{
                        System.out.println("the item is found " + result);
                    }
                    break;
                case 6:
                    // update the item by its index
                    int index = sc.nextInt();
                    if(itemlist.updateItem(index)){
                        System.out.println("after updating: ");
                        itemlist.displayAll();
                    }
                    break;
                case 7:
                    // remove the item by its index
                    int index2 = sc.nextInt();
                    if (itemlist.removeItem(index2)){
                        System.out.println("after removing: ");
                        itemlist.displayAll();
                    }
                    break;
                case 8:
                    // display the list of given type item
                    String type = sc.nextLine();
                    System.out.println("the list of item of type " + type + "is: ");
                    itemlist.displayItemByType(type);
                    break;
                case 9:
                    // sort items in ascending order based on their values
                    System.out.println("item list after sort");
                    itemlist.sortItems();
                    itemlist.displayAll();
                    break;
                case 10:
                    // init sampledata
                    itemlist.initData(10);
                    break;
                case 11:
                    break;
            }
        }while(choice < 11);
    }
}
