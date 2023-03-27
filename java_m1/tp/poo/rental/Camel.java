package tp.poo.rental;

import java.util.Objects;

public class Camel extends Transport {


    public Camel(int date) {
        super(date);
        setDateVente(5);
    }

    @Override
    public String toString() {
        return "camel "+ this.getDate();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Camel camel = (Camel) obj;
        return getDate() == camel.getDate();
    }
}
