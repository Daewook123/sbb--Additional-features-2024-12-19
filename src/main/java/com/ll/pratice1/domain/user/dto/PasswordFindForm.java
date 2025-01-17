package com.ll.pratice1.domain.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordFindForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자ID는 필수 항목입니다.")
    private String username;

    @Email
    @NotEmpty(message = "Email은 필수 항목입니다.")
    private String email;
}