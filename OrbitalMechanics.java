import java.util.Scanner;
public class OrbitalMechanics{

    static Scanner input = new Scanner(System.in);
    static double g = 6.67430e-11;
    public static void main(String[] args){

        OrbitalInput();
    }

    static void OrbitalInput(){
        double r = 0.00;
        double gf = 0.00;
        double escv = 0.00;
        double vorb = 0.00;
        double T = 0.00;
        //
        double mass = 0.00;
        double radius = 0.00;
        double mSatellite = 0.00;
        double oAltitude = 0.00;

        // ---------------------------------------------------------------------

        System.out.println("Please enter mass of planet (kg): ");
        mass = input.nextDouble();
        System.out.println();

        //

        System.out.println("Please enter radius of planet (m): ");
        radius = input.nextDouble();
        System.out.println();

        //

        System.out.println("Please enter mass of satellite (kg): ");
        mSatellite = input.nextDouble();
        System.out.println();

        //

        System.out.println("Please enter orbital altitude (m): ");
        oAltitude = input.nextDouble();
        System.out.println();

        // ----------------------------------------------------------------------

        r = DistancePlanetCenter(radius, oAltitude);
        gf = GravitationalForce(mass, mSatellite, r);
        escv = EscapeVelocity(mass, radius);
        vorb = OrbitalVelocity(mass, r);
        T = OrbitalPeriod(r, vorb);

        Output(gf, escv, vorb, T);

    }

    // --------------------------------------------------------------------------

    static double DistancePlanetCenter(double radius, double oAltitude){
        double r = 0.00;
        r = radius + oAltitude;
        return r;
    }

    static double GravitationalForce(double mass, double mSatellite, double r){
        double F = 0.00;
        F = (g * mass * mSatellite) / (r * r);
        return F;
    }

    static double EscapeVelocity(double mass, double R){
        double vesc = 0.00;
        vesc = Math.sqrt((2 * g * mass) / R);
        return vesc;
    }

    static double OrbitalVelocity(double mass, double r){
        double vorb = 0.00;
        vorb = Math.sqrt((g * mass) / r);
        return vorb;
    }

    static double OrbitalPeriod(double r, double vorb){
        double T = 0.00;
        double pi = 3.14159;
        T = (2 * pi * r) / vorb;
        return T;
    }

    // ----------------------------------------------------------------------

    static void Output(double gf, double escv, double vorb, double T){
        System.out.printf("Gravitational Force: %.3e N \n" ,gf);
        System.out.printf("Escape Velocity: %.6f m/s \n" ,escv);
        System.out.println("Orbital Velocity: " + vorb + " m/s");
        System.out.println("Orbital Period: " + T + " seconds");

    // ----------------------------------------------------------------------
    }
}

