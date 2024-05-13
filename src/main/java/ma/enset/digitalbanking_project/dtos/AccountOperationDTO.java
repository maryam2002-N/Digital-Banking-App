package ma.enset.digitalbanking_project.dtos;

import lombok.Data;
import ma.enset.digitalbanking_project.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

