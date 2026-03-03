package com.pm.productcatalogservice.TableInheritanceExamples.SingleTable;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.INTEGER)
@Entity(name = "st_user")
public class User {
    @Id
    Long id;
    String email;
}
