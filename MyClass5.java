package codeforces;


/*Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int

Create class codeforces.BitManipulation.Solution and implement static method "associatesForGivenTechnology" in the codeforces.BitManipulation.Solution class.
This method will take array of Associate objects and a searchTechnology String as parameters.
And will return another array of Associate objects where the searchTechnology String matches with the original array of
Associate object's technology attribute (case-insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring
the attributes in above sequence along with a String searchTechnology.
Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.

Input
-----------------
101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java

Output
------------------
101
104*/

import java.util.Arrays;
import java.util.Scanner;

class Associate{
    int id;
    String name;
    String technology;
    int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
public class MyClass5 {

    public static Associate[] associatesForGivenTechnology(Associate[] as, String searchTechnology){
        Associate[] arr = new Associate[0];
        for (int i = 0; i < as.length; i++) {
            if (as[i].getTechnology().equalsIgnoreCase(searchTechnology) && as[i].getExperienceInYears()%5==0){
                arr = Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1] = as[i];
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
        Associate[] ak = new Associate[4];
        for (int i = 0; i < ak.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();
            in.nextLine();

            ak[i] = new Associate(a,b,c,d);
        }

        String p = in.nextLine();
        Associate[] ans = associatesForGivenTechnology(ak,p);
        if (ans!=null){
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i].getId());
            }
        }
    }
}
