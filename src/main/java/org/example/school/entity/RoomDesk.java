package org.example.school.entity;

import jakarta.validation.constraints.*;
import lombok.*;

import javax.persistence.*;
import java.time.*;

@Getter
@Setter
@Entity
@Data
@Table(name = "room_desk", schema = "school")
public class RoomDesk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "desk_id", nullable = false)
    private Long id;

    @Size (max = 255)
    @Column(name = "desk_name")
    private String deskName;

    @Column(name = "desk_size")
    private Double deskSize;

    @Size(max = 255)
    @Column(name = "desk_color")
    private String deskColor;

    @Size(max = 255)
    @Column(name = "desk_style")
    private String deskStyle;

    @Size(max = 255)
    @Column(name = "desk_position")
    private String deskPosition;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

}