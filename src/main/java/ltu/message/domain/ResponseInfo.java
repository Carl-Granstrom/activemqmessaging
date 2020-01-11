package ltu.message.domain;

import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseInfo {

    int reservationlimit;
    int reservationcount;
}
