package ltu.message.domain;

import lombok.*;

import java.util.List;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseSchedule {
    List<String> columnheaders;
    List<ResponseInfo> info;
    List<CalendarEventTE> reservations;
}