package dev.manoj.productcatalog.InheritanceExample.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "JOINED_MENTOR")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private Integer noOfSessions;
    private Integer noOfMentees;
}
