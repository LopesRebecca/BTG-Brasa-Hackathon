package entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
public class Request<T> {
    public ArrayList<T> data;
    public Links links;
    public Meta meta;

}
