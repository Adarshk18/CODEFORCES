package codeforces;


import java.util.Arrays;
import java.util.Scanner;

class Engine{
    private int engineId;
    private String engineName;
    private String engineType;
    private int enginePrice;

    public Engine(int engineId, String engineName, String engineType, int enginePrice) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEnginePrice() {
        return enginePrice;
    }

    public void setEnginePrice(int enginePrice) {
        this.enginePrice = enginePrice;
    }
}
public class MyClass3 {

    public static int findAvgEnginePriceByType(Engine[] e, String p){
        int sum =0,cnt=0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getEngineType().equalsIgnoreCase(p)){
                sum += e[i].getEnginePrice();
                cnt++;
            }
        }
        if(cnt>0){
            int avg = sum/cnt;
            return avg;
        }else{
            return 0;
        }
    }

    public static Engine[] searchEngineByName(Engine[] e, String n){
        Engine[] arr = new Engine[0];
        for (int i = 0; i < e.length; i++) {
            if (e[i].getEngineName().equalsIgnoreCase(n)){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = e[i];
            }
        }
        Engine data;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].getEngineId()>arr[j].getEngineId()){
                    data = arr[i];
                    arr[i] = arr[j];
                    arr[j] = data;
                }
            }
        }
        if (arr.length>0){
            return arr;
        }else{
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Engine[] en = new Engine[2];
        for (int i = 0; i < en.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();
            in.nextLine();

            en[i] = new Engine(a,b,c,d);
        }
        String p = in.nextLine();
        String n = in.nextLine();

        int ans1 = findAvgEnginePriceByType(en,p);
        if(ans1!=0){
            System.out.println(ans1);
        }else{
            System.out.println("There are no engine with given type");
        }

        Engine[] ans2 = searchEngineByName(en,n);
        if(ans2!=null){
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i].getEngineId());
            }
        }
    }
}
