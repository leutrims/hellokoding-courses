package com.hellokoding.springboot.restful;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO<T> {
    private String status;
    private String message;
    private T body;
}
