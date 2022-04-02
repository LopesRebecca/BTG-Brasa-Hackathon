package entity;

import java.util.ArrayList;
import java.util.Date;

public class Request<T> {
    public ArrayList<T> data;
    public Links links;
    public Meta meta;
    
    public class Links{
        public String self;
    }

    public class Meta{
        public int totalRecords;
        public int totalPages;
        public Date requestDateTime;
    }
}
