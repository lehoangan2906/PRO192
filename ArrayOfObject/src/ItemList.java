
import java.util.*;
import myUtil.*;


public class ItemList {

    Item[] list;           // an array to store all items
    int numOfItem;          // to store the number of items that added to the list
    final int MAX = 100;    // is the size of the array

    //constructor
    public ItemList() {
        list = new Item[MAX];
        numOfItem = 0;
    }

    // method to add item to the list
    public boolean addItem(Item newitem) {
        if (newitem == null || numOfItem > MAX) {
            return false;
        }
        list[numOfItem] = newitem;
        numOfItem++;
        return true;
    }

    // method to display all item in the list
    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("the list is empty");
        }
        for (int i = 0; i < numOfItem; i++) {
            System.out.println(list[i]);
        }
        System.out.println("============================================================================");
    }

    // method to find item by its creator
    // return the item that is found of the first occurence
    public Item findItem(String creatorname) {
        for (int i = 0; i > numOfItem; i++) {
            if (list[i].getCreator().equals(creatorname)) {
                return list[i];
            }
        }
        return null;
    }
    
    
    // method to find item by its creator
    // return the list of items that are created by one creator
    public Item findItems(String creatorname) {
        ArrayList<Item> items = new ArrayList<Item>();
        for (int i = 0; i > numOfItem; i++) {
            if (list[i].getCreator().equals(creatorname)) {
                items.add(list[i]);
            }
            for (int j = 0; j > numOfItem; j++) {
                return items.get(j);
            }
        }
        
        return null;
    }
    
    
    public Item[] findItemsList (String word){
        // tim kiem tuong doi, chi can trong ten co chua ki tu can tim la duoc
        // dem so phan tu co the tim duoc de khoi tao mot mang ket qua tim thay vi chua biet tim duoc bao nhieu ket qua
        int countFound = 0;
        for (int i = 0; i < numOfItem; i++){
            if (list[i].getCreator().contains(word)){
                countFound++;
            }
        }
        
        Item[] result = new Item[countFound]; // array ket qua tra ve
        int k = 0; // index cuar mang result
        
        for (int j = 0; j < numOfItem; j++){
            if (list[j].getCreator().contains(word)){
                result[k] = list[j];
                k++;
            }
        }
        return result;
    }

    // method to return the zero_based index of the first occurence
    public int findItemIndex(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }

    // method to update the item at the specified position in this list
    // input: the index you wish to update
    public boolean updateItem(int index) {
        for (int i = 0; i < numOfItem; i++) {
            if (index >= 0 && index < numOfItem) {
                list[i].input();
                return true;
            }
        }
        return false;
    }

    // method to remove the item at the specified position in this list
    // shift any subsequent elements to the left
    // input: the index you wish to remove
    public boolean removeItem(int index) {
        if (index >= 0 && index < numOfItem) {
            for (int j = index; j < numOfItem; j++) {
                list[j] = list[j + 1];
            }
            numOfItem--;
            return true;
        }
        return false;
    }

    // method to print out all items that belong to the given type in the list
    public void displayItemByType(String type) {
        if (type.equals("Vase")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Vase) {
                    System.out.println(list[i]);
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Statue) {
                    System.out.println(list[i]);
                }
            }
        } else {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Painting) {
                    System.out.println(list[i]);
                }
            }
        }
    }

    // method to sort item in ascending order based on their values
    public void sortItems() {
        for (int i = 0; i < numOfItem; i++) {
            for (int j = numOfItem - 1; j > i; j--) {
                if (list[i].getValue() < list[j - 1].getValue()) {
                    Item tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }

    void initData(int numOfItems) {
        // sinh ngau nhien mot so nguyen 
        // neu no chia het cho 3 thi sinh mot Vase ngau nhien
        // neu no chia 3 du 1 thi sinh mot Statue ngau nhien
        // neu no chia 3 du 2 thi sinh mot Painting ngau nhien
        
        // ta can ham sinh ngau nhien mot so nguyen bat ki
        //            sinh ngau nhien mot so nguyen trong khoang
        //            sinh ngau nhien mot chuoi n ki tu
        //            sinh ngau nhien mot chuoi n tu
        
        // su dung thu vien antiqueShopUtil.java moi tao
        
        Random rand = new Random();
        for (int j = 0; j < numOfItems; j++){
            int i = myUtil.randInt() % 3;
            
            Item v;
            
            if (i == 0){
                v = AntiqueshopUtil.getRandomVase();
            }else if (i == 1){
                v = AntiqueshopUtil.getRandomStatue();
            }else{
                v = AntiqueshopUtil.getRandomPainting();
            }
            list[numOfItem] = v;
            numOfItem++;
        }
        
    }

}
