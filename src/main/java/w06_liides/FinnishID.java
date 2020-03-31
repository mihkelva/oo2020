package w06_liides;

import java.time.LocalDate;
import java.time.Period;

public class FinnishID implements PersonalCodeBehaviour {

    String personalCode = "230181-237";
    String[] months = new String[]{"jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"};
    LocalDate now = LocalDate.now();

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
        return Integer.parseInt(personalCode.substring(0, 2));
    }

    @Override
    public String getMonth(String personalCode) {
        int birthmonthNumber = Integer.parseInt(personalCode.substring(2, 4));
        String birthMonth = months[birthmonthNumber-1];
        return birthMonth;
    }

    @Override
    public int getMonthNumber(String personalCode) {
        return Integer.parseInt(personalCode.substring(2, 4));
    }

    @Override
    public int getYear(String personalCode) {
        int birthYear = Integer.parseInt(personalCode.substring(4, 6));
        return birthYear+1900;
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
