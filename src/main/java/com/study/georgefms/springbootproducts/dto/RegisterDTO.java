package com.study.georgefms.springbootproducts.dto;

import com.study.georgefms.springbootproducts.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
