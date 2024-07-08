package codeforces;


import java.util.Arrays;
import java.util.Scanner;

class Antenna{
    private int antennaID;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaID, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaID = antennaID;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaID() {
        return antennaID;
    }

    public void setAntennaID(int antennaID) {
        this.antennaID = antennaID;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}

public class MyClass {

    public static int searchAntennaByName(Antenna[] A, String v){
        for (Antenna antenna : A) {
            if (antenna.getAntennaName().equalsIgnoreCase(v)) {
                return antenna.getAntennaID();
            }
        }
        return 0;
    }

    public static Antenna[] sortAntennaByVSWR(Antenna[] a, double num){
        Antenna[] an = new Antenna[0];
        for(int i=0; i<an.length; i++)
        {
            if(an[i].getAntennaVSWR()<num)
            {
                a = Arrays.copyOf(a, a.length+1);
                a[a.length-1]=an[i];
            }
        }
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[i].getAntennaVSWR()>a[i+1].getAntennaVSWR())
                {
                    Antenna temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        if(a.length>0)
        {
            return a;
        }
        else
        {
            return null;
        }
     }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Antenna[] n = new Antenna[4];
        for (int i = 0; i < n.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            double d = in.nextDouble();
            in.nextLine();

            n[i] = new Antenna(a,b,c,d);
        }
    }
}
