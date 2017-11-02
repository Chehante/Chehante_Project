package HomeWork;

public enum Planets {
    Mercury(1000, 5, 500),
    Venus(2000, 2, 600),
    Earth(3000, 5, 500),
    Mars(6000, 8, 600),
    Jupiter(4000, 7.5, 500),
    Saturn(500, 7, 100),
    Uranus(200, 54, 10),
    Neptune(11, 4, 60000);

    double weight;
    double radius;
    double radiusOrb;

    //constructor
    Planets(double weight, double radius, double radiusOrb){
        this.weight = weight;
        this.radius = radius;
        this.radiusOrb = radiusOrb;
    }

    public static void main(String[] args){
        System.out.println("Weight of " + Planets.Jupiter.name() + " is " + Planets.Jupiter.weight);
        System.out.println("Radius of " + Planets.Earth.name() + " is " + Planets.Earth.radius);
        System.out.println("Orbit radius of " + Planets.Venus.name() + " is " + Planets.Venus.radiusOrb);

    }

}
