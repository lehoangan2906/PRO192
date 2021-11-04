import java.util.*;
import java.lang.*;
import java.io.*;

public class CarList {
    // brand list must be existed in advance
    BrandList brandList;
    Scanner sc ;
    Brand brand;
    Car car;
    List<Car> carlist;
    
    public CarList(){
        carlist = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    
    String filename = "src/cars.txt";
    
    public boolean loadFromFile(String filename){
        carlist.removeAll(carlist);
        File f = new File(filename);
        if (!f.exists()) {
            return false;
        } else {
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line = "";
                BrandList bl = new BrandList();
                String file1 = "src/brands.txt";
                bl.loadFromFile(file1);
                ArrayList<Brand> lb = bl.brandlist;
                while ((line = br.readLine()) != null) {
                    Car c = new Car();
                    String[] s = line.trim().split(", ");
                    c.setCarID(s[0]);
                    for (Brand b : lb) {
                        if (b.getBrandID().equals(s[1].trim())) {
                            c.setBrand(b);
                        }
                    }
                    c.setColor(s[2]);
                    c.setFrameID(s[3]);
                    c.setEngineID(s[4]);
                    carlist.add(c);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
                return false;
            } catch (IOException e) {
                System.out.println(e);
                return false;
            }
        }
        return true;
    }
    
    public boolean saveToFile(String filename){
        PrintWriter out;
        try {
            out = new PrintWriter(filename);
            String line = "";
            for (Car i : carlist) {
                line = i.getCarID() + ", " + i.getBrand().getBrandID() + ", "
                        + i.getColor() + ", " + i.getFrameID()
                        + ", " + i.getEngineID();
                out.write(line + "\n");
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public int searchID(String carID){
        for (int i = 0; i < carlist.size(); i++){
            if (carlist.get(i).getCarID().equals(carID)){
                return 1;
            }
        }
        return -1;
    }
    
    public int searchFrame(String fID){
        for (int i = 0; i < carlist.size(); i++){
            if (carlist.get(i).getFrameID().equals(fID))
                return 1;
        }
        return -1;
    }
    
    public int searchEngine(String eID){
        for (int i = 0; i < carlist.size(); i++){
            if (carlist.get(i).getEngineID().equals(eID))
                return 1;
        }
        return -1;
    }
    
    public int searchBrand(String brand){
        for (int i = 0; i < carlist.size(); i++){
            if (carlist.get(i).getBrand().equals(brand))
                return 1;
        }
        return -1;
    }
    
    public void addCar() throws IOException{
        Car newcar = new Car();
        String carID, color, frameID, engineID, brandID;
        
        while (true){
            System.out.println("Enter new carID: ");
            carID = sc.nextLine();
            if("".equals(carID)){
                System.out.println("Car ID cannot be blanked. reEnter new Car ID: ");
            }else{
                if(searchID(carID) > 0){
                    System.out.println("Car ID existed.");
                }else{
                    newcar.setCarID(carID);
                    break;
                }
            }
        }
        
        while (true){
            System.out.println("Enter new car color: ");
            color = sc.nextLine();
            if("".equals(color)){
                System.out.println("Car color cannot be blanked. reEnter new Car color: ");
            }else{
                newcar.setColor(color);
                break;
                
            }
        }
        
        while (true){
            System.out.println("Enter new frame ID: ");
            frameID = sc.nextLine();
            if("".equals(frameID)){
                System.out.println("frame ID cannot be blanked. reEnter new frame ID: ");
            }else{
                if(searchID(frameID) > 0){
                    System.out.println("frame ID existed.");
                }else{
                    newcar.setFrameID(frameID);
                    break;
                }
            }
        }
        
        while (true){
            System.out.println("Enter new engine ID: ");
            engineID = sc.nextLine();
            if("".equals(engineID)){
                System.out.println("Engine ID cannot be blanked. reEnter new engine ID: ");
            }else{
                if(searchID(engineID) > 0){
                    System.out.println("Engine ID existed.");
                }else{
                    newcar.setEngineID(engineID);
                    break;
                }
            }
        }
        
        while (true){
            BrandList brandlist = new BrandList();
            String file = "sc/brands.txt";
            brandlist.loadFromFile(file);
            ArrayList<Brand> arrlbr = brandlist.brandlist;
            
            System.out.println("Enter new brand ID: ");
            brandID = sc.nextLine();
            
            if("".equals(brandID)){
                System.out.println("brand ID cannot be blanked. reEnter new brand ID: ");
            }else{
                if(searchBrand(brandID) < 0){
                    System.out.println("Brand ID not found.");
                }else{
                    newcar.setBrand(arrlbr.get(searchBrand(brandID)));
                    break;
                }
            }
        }
    }
    
    public void printBasedBrandName(){
        int count = 0;
        System.out.println("Enter Brand name you desire to find: ");
        String brandpart = sc.nextLine();
        
        for (int i = 0; i < carlist.size(); i++){
            Car c = carlist.get(i);
            if (c.brand.brandName.contains(brandpart)){
                System.out.println(c.screenString());
                count++;
            }
        }
        if (count == 0)
            System.out.println("No car is detected.");
    }
    
    public boolean removeCar(){
        System.out.println("Enter ID of the car you want to remove: ");
        String carID = sc.nextLine();
        int pos = searchID(carID);
        if(pos < 0){
            System.out.println("No car detected");
            return false;
        }else{
            carlist.remove(pos);
        }
        return true;
    }
    
    public boolean updateCar() throws IOException{
        String carID, color, frameID, engineID, brandID;
        
        System.out.println("Enter ID of the car you want to update: ");
        carID = sc.nextLine();
        int pos = searchID(carID);
        Car newcar = carlist.get(pos);
        if (pos < 0){
            System.out.println("Car not detected.");
        }else{
            while (true){
            System.out.println("Enter new carID: ");
            carID = sc.nextLine();
            if("".equals(carID)){
                System.out.println("Car ID cannot be blanked. reEnter new Car ID: ");
            }else{
                if(searchID(carID) > 0){
                    System.out.println("Car ID existed.");
                }else{
                    newcar.setCarID(carID);
                    break;
                    }
                }
            }

            while (true){
                System.out.println("Enter new car color: ");
                color = sc.nextLine();
                if("".equals(color)){
                    System.out.println("Car color cannot be blanked. reEnter new Car color: ");
                }else{
                    newcar.setColor(color);
                    break;

                }
            }

            while (true){
                System.out.println("Enter new frame ID: ");
                frameID = sc.nextLine();
                if("".equals(frameID)){
                    System.out.println("frame ID cannot be blanked. reEnter new frame ID: ");
                }else{
                    if(searchID(frameID) > 0){
                        System.out.println("frame ID existed.");
                    }else{
                        newcar.setFrameID(frameID);
                        break;
                    }
                }
            }

            while (true){
                System.out.println("Enter new engine ID: ");
                engineID = sc.nextLine();
                if("".equals(engineID)){
                    System.out.println("Engine ID cannot be blanked. reEnter new engine ID: ");
                }else{
                    if(searchID(engineID) > 0){
                        System.out.println("Engine ID existed.");
                    }else{
                        newcar.setEngineID(engineID);
                        break;
                    }
                }
            }

            while (true){
                BrandList brandlist = new BrandList();
                String file = "sc/brands.txt";
                brandlist.loadFromFile(file);
                ArrayList<Brand> arrlbr = brandlist.brandlist;

                System.out.println("Enter new brand ID: ");
                brandID = sc.nextLine();

                if("".equals(brandID)){
                    System.out.println("brand ID cannot be blanked. reEnter new brand ID: ");
                }else{
                    if(searchBrand(brandID) < 0){
                        System.out.println("Brand ID not found.");
                    }else{
                        newcar.setBrand(arrlbr.get(searchBrand(brandID)));
                        break;
                    }
                }
            }
        }
        System.out.println("Updated successfully");
        return true;
    }
    
    public void listCarsByBrandID(){
        Collections.sort(carlist, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return(o1.getBrand().getBrandID().compareTo(o2.getBrand().getBrandID()));
            }
        });
        System.out.println(" ----------------------------------------------");
        System.out.println("| carID| brandID | color   | frameID | engineID|");
        System.out.println(" ------|---------|---------|---------|---------");
        for(Car i: carlist){
            System.out.println(i.screenString());
        }
        System.out.println(" ----------------------------------------------\n");
    }
        
} // end of class

    

