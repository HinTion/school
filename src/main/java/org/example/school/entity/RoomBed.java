package org.example.school.entity;

import jakarta.validation.constraints.*;
import lombok.*;

import javax.persistence.*;
import java.time.*;

@Getter
@Setter
@Entity
@Table(name = "room_bed", schema = "school")
public class RoomBed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bed_id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "bed_name")
    private String bedName;

    @Size(max = 255)
    @Column(name = "is_storage_space")
    private String isStorageSpace;

    @Size(max = 255)
    @Column(name = "is_customized")
    private String isCustomized;

    @Size(max = 255)
    @Column(name = "bed_color")
    private String bedColor;

    @Column(name = "bed_size")
    private Double bedSize;

    @Size(max = 255)
    @Column(name = "bed_position")
    private String bedPosition;

    @Column(name = "create_time")
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

}