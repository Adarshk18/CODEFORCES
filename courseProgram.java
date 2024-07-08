package codeforces;

import java.util.Arrays;
import java.util.Scanner;

class Course {
    private String courseName;
    private int courseId;
    private int quiz;
    private String courseAdmin;
    private int handson;

    Course(int courseId, String courseName, int quiz, String courseAdmin, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.quiz = quiz;
        this.courseAdmin = courseAdmin;
        this.handson = handson;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getQuiz() {
        return quiz;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getHandson() {
        return handson;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}

public class courseProgram {

    public static int findAvgOfQuizByAdmin(Course[] course, String ad) {
        int sum = 0, cnt = 0;
        for (int i = 0; i < course.length; i++) {
            if (course[i].getCourseAdmin().equalsIgnoreCase(ad)) {
                sum += course[i].getQuiz();
                cnt++;
            }
        }
        if (cnt > 0) {
            return sum / cnt;
        } else {
            return 0;
        }
    }

    public static Course[] sortCourseByHandsOn(Course[] course, int h) {
        Course[] obj = new Course[0];
        for (int i = 0; i < course.length; i++) {
            if (course[i].getHandson() < h) {
                obj = Arrays.copyOf(obj, obj.length + 1);
                obj[obj.length - 1] = course[i];
            }
        }
        Arrays.sort(obj, (a, b) -> Integer.compare(a.getHandson(), b.getHandson()));
        return obj.length > 0 ? obj : null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine(); // Consume newline
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine(); // Consume newline
            int e = sc.nextInt();
            sc.nextLine(); // Consume newline
            course[i] = new Course(a, b, d, c, e);
        }
        sc.nextLine(); // Consume newline
        String admin = sc.nextLine();
        int hand = sc.nextInt();

        int ans1 = findAvgOfQuizByAdmin(course, admin);
        if (ans1 != 0) {
            System.out.println(ans1);
        } else {
            System.out.println("No course found");
        }

        Course[] ans2 = sortCourseByHandsOn(course, hand);
        if (ans2 != null) {
            for (Course c : ans2) {
                System.out.println(c.getCourseName());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }

        sc.close();
    }
}
