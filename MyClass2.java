package codeforces;


import java.util.Scanner;

class Flowers{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
public class MyClass2 {

    public static Flowers findMinPriceByType(Flowers[] fl, String p){
        Flowers minPricedFlower = null;
        for (Flowers flowers : fl) {
            if (flowers.getType().equalsIgnoreCase(p) && flowers.getRating() > 3) {
                if (minPricedFlower == null || flowers.getPrice() < minPricedFlower.getPrice()) {
                    minPricedFlower = flowers;
                }
            }
        }
        return minPricedFlower;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Flowers[] fl = new Flowers[4];
        for (int i = 0; i < fl.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt();
            in.nextLine();
            int d = in.nextInt();
            in.nextLine();
            String e = in.nextLine();

            fl[i] = new Flowers(a,b,c,d,e);
        }
        String t = in.nextLine();
        Flowers id = findMinPriceByType(fl,t);
        if(id!=null){
            System.out.println(id);
        }else{
            System.out.println("There is no flower with given type");
        }
    }
}
