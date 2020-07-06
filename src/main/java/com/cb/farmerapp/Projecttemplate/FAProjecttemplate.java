package com.cb.farmerapp.Projecttemplate;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class FAProjecttemplate {
    private String ProjectObjective;
    private Date ProjectDatestarted;
    private int ProjectBudgetedResources;
    private String ProjectCustomer;
}
