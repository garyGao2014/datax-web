package com.wugui.datax.admin.tool.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor(access=AccessLevel.PRIVATE)
public enum Alias implements Serializable {
    TABLE_SCHEMA("TABLE_SCHEM"),
    TABLE_TYPE("TABLE_TYPE"),
    TABLE_NAME("TABLE_NAME")
    ;
    private String code;

    public String code() {
        return this.code;
    }
}
