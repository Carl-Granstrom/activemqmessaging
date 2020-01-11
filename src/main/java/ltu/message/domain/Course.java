package ltu.message.domain;

import lombok.*;

import java.net.URL;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Course {
    String courseName;
    String urlString;
    URL url;

    @Override
    public String toString(){
        return this.courseName;
    }
}
