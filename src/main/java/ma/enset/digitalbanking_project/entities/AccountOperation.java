package ma.enset.digitalbanking_project.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.digitalbanking_project.enums.OperationType;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne( cascade = CascadeType.ALL)
    private ma.enset.digitalbanking_project.entities.BankAccount bankAccount;
    private String description;

}
