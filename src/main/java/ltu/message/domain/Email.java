package ltu.message.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    private String receiver;
    private String body;

    @Override
    public String toString() {
        return String.format("Email{receiver=%s, body=%s}", getReceiver(), getBody());
    }

}
