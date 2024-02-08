//public class Client {}

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String name;
    private String address;
    private String phone;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    @OneToOne(mappedBy = "Client")
    private Portfolio portfolio;

}
