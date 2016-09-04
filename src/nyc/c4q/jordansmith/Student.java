package nyc.c4q.jordansmith;

/**
 * Created by jordansmith on 9/4/16.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String favoriteFood;

    public Student(String firstName,String lastName, int idNumber, String favoriteFood){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favoriteFood = favoriteFood;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;

    }

    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    public static boolean checksameFavoriteFood(Student student1, Student student2){
        String student1FF = student1.getFavoriteFood();
        String student2FF = student2.getFavoriteFood();
        if( student1FF.equals(student2FF)){
            return true;
        }
        else{
            return false;
        }
    }

}
