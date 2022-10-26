package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public abstract class Base {
    private int id;
    private int genetarion=0;
    public Base() {
        this.id = genetarion++;
    }
}
