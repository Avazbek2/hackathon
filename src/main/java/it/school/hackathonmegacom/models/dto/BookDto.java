package it.school.hackathonmegacom.models.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDto implements Serializable {

    Long id;

    ConfRoomDto confRoom;

    LocalTime start_time;

    LocalTime end_time;

    Date date;

    String fullName;

    DepartmentDto department;

    Boolean isActive;
}
