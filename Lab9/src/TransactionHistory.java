import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class TransactionHistory {
    private long id;
    private LocalDate dayTrading;
    private String description;
    private String beneficiaryAccount;
    private long money;

    public TransactionHistory(String description, String beneficiaryAccount,long money){
        this.id = IdGenerate.getNewID();
        this.dayTrading = LocalDate.now();
        this.description = description;
        this.beneficiaryAccount= beneficiaryAccount;
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public void setDayTrading(LocalDate dayTrading) {
        this.dayTrading = dayTrading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "id=" + id +
                ", dayTrading=" + dayTrading +
                ", description='" + description + '\'' +
                ", beneficiaryAccount='" + beneficiaryAccount + '\'' +
                ", money=" + money +
                '}';
    }
}
