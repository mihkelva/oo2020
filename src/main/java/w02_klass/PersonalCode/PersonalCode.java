import java.time.LocalDate;
import java.util.*;

public class PersonalCode{

    private String code ="38705290260";


    public static void main(String[] args){
        PersonalCode myCode = new PersonalCode();
        myCode.code = "45112123112";
        System.out.println(myCode.gender());
        System.out.println(myCode.age());
    }

    @Override
    public String toString(){
        return "PersonalCode objekt";
    }

    String getCode(){
        return this.code;
    }

    void setCode(String code){
        this.code = code;
    }

    String gender(){
        int firstNumber = Integer.parseInt(code.substring(0,1));
        String gender;

        if (firstNumber %2 == 0){
            gender = "female";
        } else {
            gender = "male";
        }
        return gender;
    }

    public int age(){
        int birthyear = Integer.parseInt(code.substring(1, 3));
        int birthmonth = Integer.parseInt(code.substring(3, 5));
        int birthday = Integer.parseInt(code.substring(5, 7));

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        LocalDate age;
        LocalDate birthDate;


        if(code.substring(0,1).equals("3") || code.substring(0,1).equals("4")){
            birthDate = LocalDate.of(birthyear+1900, birthmonth, birthday);
            age = LocalDate.now();
        } else {
            birthDate = LocalDate.of(birthyear+2000, birthmonth, birthday);

            age = LocalDate.now();
        }
        System.out.println(birthDate);
        System.out.println(age);
        

        return birthday;
    }


}

