package Sem4.OnlineShop;


import java.time.LocalDate;

public class Consumer {
    private String FIO;
    private LocalDate dateOfBrith;
    private String phone;

    public Consumer(String FIO, LocalDate dateOfBrith, String phone) {
        this.FIO = FIO;
        this.dateOfBrith = dateOfBrith;
        this.phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public Consumer setFIO(String FIO) {
        this.FIO = FIO;
        return this;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public Consumer setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Consumer setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
