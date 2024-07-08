package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Medicine {
    String MedicineName;
    String batch;
    String disease;
    int price;

    public Medicine(String MedicineName, String batch, String disease, int price) {
        this.MedicineName = MedicineName;
        this.disease = batch;
        this.batch = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Solution{

    public static int[] getPriceByDisease(Medicine[] m, String d){
    int[] p = new int[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i].getDisease().equalsIgnoreCase(d)){
                p = Arrays.copyOf(p,p.length+1);
                p[p.length-1] = m[i].getPrice();
                Arrays.sort(p);
            }
        }
        return p.length >0 ? p:null;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Medicine[] m = new Medicine[4];
        for (int i = 0; i < m.length; i++) {
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();
            in.nextLine();

            m[i] = new Medicine(a,b,c,d);
        }
        String d = in.nextLine();
        int[] ans = getPriceByDisease(m,d);
        if(ans!=null){
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans);
            }
        }else{
            System.out.println("No medicine found");
        }
    }
}
