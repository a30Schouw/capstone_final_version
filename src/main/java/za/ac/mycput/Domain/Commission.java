/*
Klaus Traubner
218009496
Commission.java Previously Order.java
20 October 2022
 */

package za.ac.mycput.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "commission")
public class Commission implements Serializable
{
    @Id
    @Column(name = "commission_id")
    private String commissionID;
    @NotNull
    private String commissionAddress,commissionDate;

    protected Commission(){}

    private Commission(Builder builder)
    {
        this.commissionID = builder.commissionID;
        this.commissionDate = builder.commissionDate;
        this.commissionAddress = builder.commissionAddress;
    }

    public String getCommissionID() {
        return commissionID;
    }

    public String getCommissionDate() {
        return commissionDate;
    }

    public String getCommissionAddress() {
        return commissionAddress;
    }

    @Override
    public String toString() {
        return "Commission{" +
                "commissionID='" + commissionID + '\'' +
                ", commissionAddress='" + commissionAddress + '\'' +
                ", commissionDate='" + commissionDate + '\'' +
                '}';
    }


    public static class Builder
    {
        private String commissionID;
        private String commissionAddress,commissionDate;

        public Builder commissionID(String commissionID)
        {
            this.commissionID = commissionID;
            return this;
        }

        public Builder commissionAddress(String commissionAddress)
        {
            this.commissionAddress = commissionAddress;
            return this;
        }

        public Builder commissionDate(String commissionDate)
        {
            this.commissionDate = commissionDate;
            return this;
        }

        public Builder copy(Commission commission)
        {
            this.commissionID = commission.commissionID;
            this.commissionDate= commission.commissionDate;
            this.commissionAddress = commission.commissionAddress;
            return this;
        }
        public Commission build(){return new Commission(this);}
    }
}
