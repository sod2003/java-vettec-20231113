package Week08.Lambdas;

import java.util.Comparator;

public class CityPopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        if(o1 == null) {
            if(o2 == null) {
                return 0;
            }
            return 1;
        }

        if(o1.getPopulation() < o2.getPopulation()) {
            return -1;
        } else if(o1.getPopulation() == o2.getPopulation()) {
            return 0;
        }
        return 1;
    }
    
}
