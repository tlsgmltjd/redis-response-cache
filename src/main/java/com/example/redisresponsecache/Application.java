package com.example.redisresponsecache;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Application implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String veryImportantField1;
    private String veryImportantField2;
    private String veryImportantField3;
    private String veryImportantField4;
    private String veryImportantField5;
    private String veryImportantField6;
    private String veryImportantField7;
    private String veryImportantField8;
    private String veryImportantField9;
    private String veryImportantField10;
    private String veryImportantField11;
    private String veryImportantField12;
    private String veryImportantField13;
    private String veryImportantField14;
    private String veryImportantField15;
    private String veryImportantField16;
    private String veryImportantField17;
    private String veryImportantField18;
    private String veryImportantField19;
    private String veryImportantField20;

    public void update(String field) {
        this.veryImportantField1 = field;
    }
}
