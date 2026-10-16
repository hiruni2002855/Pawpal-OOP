
package com.pawpal.model;

// PetOwner inherits common user details and methods from User
public class PetOwner extends User {

    // Constructor to initialize pet owner's details
    public PetOwner(int userId, String fullName, String email,
                    String password, String city) {

         // Calls the User constructor to initialize common user details
        super(userId, fullName, email, password, city);
    }

    // Returns the role of this user as OWNER
    @Override
    public String getRole() {
        return "OWNER";
    }

    // Returns the title displayed on the pet owner's dashboard
    @Override
    public String getDashboardTitle() {
        return "Pet Owner Dashboard";
    }

     // Returns an SQL condition to filter appointments
    // and show only appointments belonging to this pet owner
    @Override
    public String getAppointmentScopeSql() {
        return "WHERE p.owner_id = " + getUserId();
    }

    // Indicates that pet owners are allowed to book appointments
    @Override
    public boolean canBookAppointments() {
        return true;
    }
}
