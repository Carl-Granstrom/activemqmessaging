package ltu.message.domain;

import lombok.*;

import java.util.List;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalendarEventTE {
    Long id;
    String startdate;
    String starttime;
    String enddate;
    String endtime;
    List<String> columns;
}
