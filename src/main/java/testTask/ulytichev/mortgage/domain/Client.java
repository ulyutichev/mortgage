package testTask.ulytichev.mortgage.domain;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String passportData;
//
//    @OneToOne(mappedBy = "credit_id")
//    private Credit credit;

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
        id = id;
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