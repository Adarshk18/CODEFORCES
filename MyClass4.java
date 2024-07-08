package codeforces;


import java.util.Scanner;

class Fruits{
    int fruitId;
    String fruitName;
    int price;
    int rating;

    public Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }


    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
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
}
public class MyClass4 {

    public static int findMaximumPriceByRating(Fruits[] f, int p){
        int max =0;
        for (int i = 0; i < f.length; i++) {
            if (f[i].getRating()>p){
                if (f[i].getPrice()>max){
                    max = f[i].getPrice();
                }
            }
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i].getPrice()==max){
                return f[i].getFruitId();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fruits[] fr = new Fruits[4];
        for (int i = 0; i < fr.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt();
            in.nextLine();
            int d = in.nextInt();
            in.nextLine();

            fr[i] = new Fruits(a,b,c,d);
        }
        int rate = in.nextInt();
        in.nextLine();

        int ans = findMaximumPriceByRating(fr,rate);
        if (ans!=0){
            System.out.println(ans);
        }else{
            System.out.println("No such Fruit");
        }
    }
}
