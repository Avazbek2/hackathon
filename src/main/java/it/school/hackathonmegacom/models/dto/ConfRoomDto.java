package it.school.hackathonmegacom.models.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoomDto implements Serializable {

    Long id;

    String name;

    Integer capacity;

    Boolean isActive;

    String description;

    Boolean project;

    Boolean airconditioner;

    Boolean desk;
}
