package za.ac.mycput.Entity;

 /*
        Author : Devon Sherwyn May
        Student number : 219168296
        Date : 10 April 2022
        Admin.Java
    */
public class Admin
{
    private String adminFirstName;
    private String adminLastName;
    private String adminPhoneNumber;
    private String adminID;

    public Admin(Builder builder)
    {
        this.adminFirstName = builder.adminFirstName;
        this.adminLastName = builder.adminLastName;
        this.adminPhoneNumber = builder.adminPhoneNumber;
        this.adminID = builder.adminID;

    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminPhoneNumber() {
        return adminPhoneNumber;
    }

    public void setAdminPhoneNumber(String adminPhoneNumber) {
        this.adminPhoneNumber = adminPhoneNumber;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminPhoneNumber='" + adminPhoneNumber + '\'' +
                ", adminID='" + adminID + '\'' +
                '}';
    }

    public static class Builder {
        private String adminFirstName;
        private String adminLastName;
        private String adminPhoneNumber;
        private String adminID;


        public Builder setAdminFirstName(String adminFirstName) {
            this.adminFirstName = adminFirstName;
            return this;
        }

        public Builder setAdminLastName(String adminLastName) {
            this.adminLastName = adminLastName;
            return this;
        }

        public Builder setAdminPhoneNumber(String adminPhoneNumber) {
            this.adminPhoneNumber = adminPhoneNumber;
            return this;
        }

        public Builder setAdminID(String adminID) {
            this.adminID = adminID;
            return this;
        }

        public Builder copy(za.ac.mycput.Entity.Admin admin) {
            this.adminFirstName = admin.adminFirstName;
            this.adminLastName = admin.adminLastName;
            this.adminPhoneNumber = admin.adminPhoneNumber;
            this.adminID = admin.adminID;
            return this;
        }

        public za.ac.mycput.Entity.Admin build()
        {
            return new za.ac.mycput.Entity.Admin(this);
        }
    }
}


