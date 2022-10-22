package org.company.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AverageVotes")
public class AverageVote {

    @Id
    private int id;

    @Column(name = "vote_average")
    private float averageVote;

    @CreationTimestamp
    @Column(name = "timestamp")
    private Timestamp timestamp;

}
