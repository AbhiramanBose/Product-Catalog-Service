package com.pm.productcatalogservice.TableInheritanceExamples.MappedSuperclass;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    Long id;
    String email;
}
