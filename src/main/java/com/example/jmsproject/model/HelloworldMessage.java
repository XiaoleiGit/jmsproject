package com.example.jmsproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloworldMessage implements Serializable {

    private static long serialVersionUID = 4325116192792002339L;

    private UUID id;
    private String message;
}
