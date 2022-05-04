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
public class ImageDto implements Serializable {

    Long id;

    String link;

    ConfRoomDto confRoomId;

    Integer orderNum;

    Boolean isActive;
}
