package testTask.ulytichev.mortgage.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    @Size(min = 10, max = 10, message = "Неправильные паспортные данные")
    @Column(unique = true)
    private String passportData;

    public Client() {
    }

    public Client(String name, String passportData) {
        this.name = name;
        this.passportData = passportData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }
}
