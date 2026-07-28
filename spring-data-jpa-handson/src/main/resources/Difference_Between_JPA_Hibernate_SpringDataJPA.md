# Difference between JPA, Hibernate and Spring Data JPA

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| JPA is a specification for Object Relational Mapping (ORM). | Hibernate is an implementation of JPA. | Spring Data JPA is a Spring framework built on top of JPA. |
| It defines standards only. | It performs the actual ORM operations. | It reduces boilerplate code by providing `JpaRepository`. |
| It cannot work by itself. | It implements the JPA interfaces. | It internally uses JPA and Hibernate. |

## Relationship

Spring Data JPA
↓
JPA
↓
Hibernate
↓
Database

## Conclusion

- JPA is a specification.
- Hibernate is the implementation of JPA.
- Spring Data JPA simplifies database operations using JPA.