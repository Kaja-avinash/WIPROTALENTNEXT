import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> tree = new TreeSet<String>();

    public TreeSet<String> saveCountryNames(String countryName) {

        tree.add(countryName);

        return tree;

    }

    public String getCountry(String countryName) {

        Iterator<String> iterator = tree.iterator();

        while (iterator.hasNext()) {

            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {

                return country;

            }

        }

        return null;

    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("Japan"));
        System.out.println(obj.getCountry("Canada"));

    }

}