package w06_liides;

import java.time.LocalDate;
import java.time.Period;

public class EstonianID implements PersonalCodeBehaviour {

    String personalCode = "38701234321";
    String[] months = new String[]{"jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"};
    LocalDate now = LocalDate.now();

    String gender(String personalCode){
        int firstNumber = Integer.parseInt(personalCode.substring(0,1));
        String gender;

        if (firstNumber %2 == 0){
            gender = "naine";
        } else {
            gender = "mees";
        }
        return gender;
    }

    @Override
    public String getBirthday(String personalCode) {
        int day = getDay(personalCode);
        String month = getMonth(personalCode);
        int year = getYear(personalCode);
        String birthday = day + ". " + month + " " + year;
        return birthday;
    }

    @Override
    public int getDay(String personalCode) {
        return Integer.parseInt(personalCode.substring(5, 7));
    }

    @Override
    public String getMonth(String personalCode) {
        int birthmonthNumber = Integer.parseInt(personalCode.substring(3, 5));
        String birthMonth = months[birthmonthNumber-1];
        return birthMonth;
    }

    @Override
    public int getMonthNumber(String personalCode) {
        return Integer.parseInt(personalCode.substring(3, 5));
    }

    @Override
    public int getYear(String personalCode) {
        int shortBirthyear = Integer.parseInt(personalCode.substring(1, 3));
        int birthyear;

        if(personalCode.substring(0,1).equals("3") || personalCode.substring(0,1).equals("4")){
            birthyear = shortBirthyear+1900;
        } else {
            birthyear = shortBirthyear+2000;
        }
        return birthyear;
    }

    @Override
    public int getAge(String personalCode) {
        LocalDate birthDate = LocalDate.of(getYear(personalCode), getMonthNumber(personalCode), getDay(personalCode));
        return Period.between(birthDate, now).getYears();
    }

    @Override
    public String untilNextBirthDay(String personalCode) {
        LocalDate birthDate = LocalDate.of(getYear(personalCode), getMonthNumber(personalCode), getDay(personalCode));
        int months = 11 - Period.between(birthDate, now).getMonths();
        int days = 29 - Period.between(birthDate, now).getDays();
        if(months > 0){
            return "Sünnipäevani jäänud " + months + " kuu(d) ja " + days + " päeva.";
        } else {
            return "Sünnipäevani jäänud " + days + " päeva.";
        }
    }
}
