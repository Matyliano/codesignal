package theJourneyBegins;

public class CenturyFromYear {
    int centuryFromYear(int year) {
        int century = (int) ((year-1)/100) +1;
        return century;
    }

}
