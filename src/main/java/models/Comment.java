package models;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String content;

    @Column
    private Instant createdOn;

    @Column
    private Instant updatedOn;

    @Column
    private String username;
}
