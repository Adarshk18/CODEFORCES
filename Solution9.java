package codeforces;


import java.util.Arrays;
import java.util.Scanner;

class NavalVessel{
    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned;
    int noOfVoyagesCompleted;
    String purpose;

    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}

public class Solution9 {

    public static int findAvgVoyagesByPct(NavalVessel[] nv, int percentage){
        int sum =0, cnt=0;
        for (int i = 0; i < nv.length; i++) {
            if (nv[i].getNoOfVoyagesCompleted()*100/nv[i].getNoOfVoyagesPlanned()>=percentage){
                sum += nv[i].getNoOfVoyagesCompleted();
            }

        }
        if(cnt>0){
            int avg = sum/cnt;
            return avg;
        }else{
            return  0;
        }
    }

    public static NavalVessel[] findVesselByGrade(NavalVessel[] nv, String purpose){
        NavalVessel[] arr = new NavalVessel[0];
        for (int i = 0; i < nv.length; i++) {
            if(nv[i].getPurpose().equalsIgnoreCase(purpose)){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = nv[i];
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
        NavalVessel[] n = new NavalVessel[4];
        for (int i = 0; i < n.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            int c = in.nextInt();
            in.nextLine();
            int d = in.nextInt();
            in.nextLine();
            String e = in.nextLine();

            n[i] = new NavalVessel(a,b,c,d,e);
        }
        int p = in.nextInt(); in.nextLine();
        String pur = in.nextLine();

        int ans1 = findAvgVoyagesByPct(n,p);
        if(ans1!=0){
            System.out.println(ans1);
        }

        NavalVessel[] ans2 = findVesselByGrade(n,pur);
        if (ans2!=null){
            for (int i = 0; i < ans2.length; i++) {
                int per = ans2[i].getNoOfVoyagesCompleted()*100/ans2[i].getNoOfVoyagesPlanned();
                if(per == 100)
                {
                    System.out.println(ans2[i].getVesselName()+"%Star");
                }
                else if(per>=80 && per<=99)
                {
                    System.out.println(ans2[i].getVesselName()+"%Leader");
                }
                else if(per<=79 && per>=55)
                {
                    System.out.println(ans2[i].getVesselName()+"%Inspirer");
                }
                else
                {
                    System.out.println(ans2[i].getVesselName()+"%Striver");
                }
            }
        }
        else
        {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
            }
        }

