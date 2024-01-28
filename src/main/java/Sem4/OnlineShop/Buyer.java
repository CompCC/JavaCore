package Sem4.OnlineShop;


import java.time.LocalDate;

public class Buyer {
    private String FIO;
    private Gender gender;
    private LocalDate dateOfBrith;
    private String phone;

    public Buyer(String FIO,Gender gender, LocalDate dateOfBrith, String phone) {
        this.FIO = FIO;
        this.gender = gender;
        this.dateOfBrith = dateOfBrith;
        this.phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public Buyer setFIO(String FIO) {
        this.FIO = FIO;
        return this;
    }

    public Buyer.Gender getGender() {
        return gender;
    }

    public Buyer setGender(Buyer.Gender gender) {
        this.gender = gender;
        return this;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public Buyer setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Buyer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "FIO='" + FIO + '\'' +
                ", dateOfBrith=" + dateOfBrith +
                ", phone='" + phone + '\'' +
                '}';
    }

    public enum Gender {
        woman,
        man
    }
}
