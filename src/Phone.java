import java.time.LocalDate;
import java.util.Objects;

public class Phone {

    private String phoneMark;
    private String phoneName;
    private LocalDate phoneDepartureDate;

    public Phone(String phoneMark, String phoneName, LocalDate phoneDepartureDate) {
        this.phoneMark = phoneMark;
        this.phoneName = phoneName;
        this.phoneDepartureDate = phoneDepartureDate;
    }

    public Phone() {
    }

    public String getPhoneMark() {
        return phoneMark;
    }

    public void setPhoneMark(String phoneMark) {
        this.phoneMark = phoneMark;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public LocalDate getPhoneDepartureDate() {
        return phoneDepartureDate;
    }

    public void setPhoneDepartureDate(LocalDate phoneDepartureDate) {
        this.phoneDepartureDate = phoneDepartureDate;
    }



    @Override
    public int hashCode() {
        return Objects.hash(phoneMark, phoneName, phoneDepartureDate);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneMark='" + phoneMark + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", phoneDepartureDate=" + phoneDepartureDate +
                '}';
    }

    public Phone clone()
    {
        return new Phone(phoneMark, phoneName, phoneDepartureDate);
    }
}
