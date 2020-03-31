package w06_liides;

public interface PersonalCodeBehaviour {
    public String getBirthday(String personalCode);
    public int getDay(String personalCode);
    public String getMonth(String personalCode);
    public int getMonthNumber(String personalCode);
    public int getYear(String personalCode);
    public int getAge(String personalCode);
    public String untilNextBirthDay(String personalCode);
}
