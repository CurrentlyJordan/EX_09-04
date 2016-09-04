package nyc.c4q.jordansmith;

public class Main {

    public static void main(String[] args) {

        Student jordan = new Student("Jordan","Smith",3316,"Seafood");
        Student Phil = new Student("Phil","Chin", 3188, "crab");

        System.out.println(Student.checksameFavoriteFood(jordan,Phil));
    }
}
