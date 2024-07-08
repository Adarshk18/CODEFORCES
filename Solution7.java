package codeforces;

import java.util.Arrays;
import java.util.Scanner;

class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public Movie(String movieName, String company, String genre, int budget)
    {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

class Solution7{

    public static String[] getMovieByGenre(Movie[] movie , String g){
        String[] arr = new String[0];
        for (int i = 0; i < movie.length; i++) {
            if(movie[i].getGenre().equalsIgnoreCase(g)){
                if (movie[i].getBudget()>80000000){
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = "High rated movie";
                }else{
                    arr = Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1] = "Low budget movie";
                }
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Movie[] m = new Movie[2];
        for (int i = 0; i < m.length; i++) {
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            int d = in.nextInt();
            in.nextLine();

            m[i] = new Movie(a,b,c,d);
        }
        String search = in.nextLine();
        String[] ans1 = getMovieByGenre(m,search);
        for (int i = 0; i < ans1.length; i++) {
            System.out.println(ans1[i]);
        }
    }
}