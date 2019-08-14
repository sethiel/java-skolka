package cz.oxy.skolka.dto;

import java.util.Collection;

public interface PricedCollection {
    Collection<? extends Priced> getRows();
}
