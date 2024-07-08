package codeforces;


import java.util.Scanner;

class Player{
    int playerId;
    String skill;
    int point;
    String level;

    Player(int playerId,String skill,String level,int point){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.point = point;
    }

    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getSkill(){
        return skill;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }

    public String getLevel(){
        return level;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public int getPoint(){
        return point;
    }

    public void setPoint(int point){
        this.point = point;
    }
}


public class Solution3 {

    public static int findPointsForGivenSkill(Player[] p , String s){
        int sum =0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].getSkill().equalsIgnoreCase(s)){
                sum += p[i].getPoint();
            }
        }
        if (sum>0){
            return sum;
        }else {
            return 0;
        }
    }

    public static int getPlayerBasedOnLevel(Player[] p , String l, String s){
        for (int i = 0; i < p.length; i++) {
            if (p[i].getSkill().equalsIgnoreCase(s) && p[i].getLevel().equalsIgnoreCase(l) && p[i].getPoint()>=20){
                return p[i].getPlayerId();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player[] p = new Player[4];
        for (int i = 0; i < p.length; i++) {
            int a = in.nextInt();
            in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();
            in.nextLine();

            p[i] = new Player(a, b, c, d);
        }
        String s = in.nextLine();
        String l = in.nextLine();

        int ans1 = findPointsForGivenSkill(p,s);
        if (ans1!=0){
            System.out.println(ans1);
        }else{
            System.out.println("The given Skill is not available");
        }

        int ans2 = getPlayerBasedOnLevel(p,s,l);
        if (ans2!=0){
            System.out.println(ans2);
        }else{
            System.out.println("The given Skill is not availableNo player is available with specified level, skill and eligibility points");
        }
    }
}
