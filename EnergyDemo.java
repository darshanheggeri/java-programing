abstract class EnergySource {
    int sourceID;
    String sourceName;
    double energyGenerated;

    EnergySource(int sourceID, String sourceName, double energyGenerated) {
        this.sourceID = sourceID;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID : " + sourceID);
        System.out.println("Source Name : " + sourceName);
        System.out.println("Energy Generated : " + energyGenerated + " kWh");
        System.out.println("Efficiency : " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {

    SolarEnergy(int sourceID, String sourceName, double energyGenerated) {
        super(sourceID, sourceName, energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {

    WindEnergy(int sourceID, String sourceName, double energyGenerated) {
        super(sourceID, sourceName, energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class EnergyDemo {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        EnergySource source;

        source = new SolarEnergy(101, "Solar Panel", 4000);
        System.out.println("----- Solar Energy -----");
        source.displayDetails();

        System.out.println();

        source = new WindEnergy(102, "Wind Turbine", 6400);
        System.out.println("----- Wind Energy -----");
        source.displayDetails();
    }
}