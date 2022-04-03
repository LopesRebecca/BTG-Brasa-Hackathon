package com.example.btgbrasahackathon.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Request {
    public ArrayList<DataObject> data;
    public Links links;
    public Meta meta;

}
