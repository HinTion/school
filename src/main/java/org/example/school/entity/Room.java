package org.example.school.entity;

import jakarta.validation.constraints.*;
import lombok.*;

import javax.persistence.*;
import java.time.*;

@Getter
@Setter
@Entity
@Table(name = "room", schema = "school")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "room_name")
    private String roomName;

    @Column(name = "room_size")
    private Double roomSize;

    @Size(max = 255)
    @Column(name = "room_position")
    private String roomPosition;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

}