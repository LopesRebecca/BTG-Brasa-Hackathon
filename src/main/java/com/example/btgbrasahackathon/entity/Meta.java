package com.example.btgbrasahackathon.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Meta {
    public int totalRecords;
    public int totalPages;
    public Date requestDateTime;
}
