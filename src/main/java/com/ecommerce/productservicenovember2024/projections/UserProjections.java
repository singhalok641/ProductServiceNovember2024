package com.ecommerce.productservicenovember2024.projections;

public interface UserProjections {
    interface BasicInfo {
        String getName();
        String getEmail();
    }

    interface DetailedInfo {
        String getName();
        String getEmail();
        String getAddress();
    }
}

// You can use nested interfaces with descriptive names for the projections


// 4th type:
/*
@Query("SELECT * from User u")
List<UserDTO> findUsers();
 */
