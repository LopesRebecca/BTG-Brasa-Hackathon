package entity.financings;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class OverParcel {
    public ArrayList<Fee> fees;
    public ArrayList<Charge> charges;
}
