import javakarol.*;

class Aufgabe
{
    // Attribute
    Welt welt;
    Roboter robo;
    
    // Konstruktor
    Aufgabe()
    {
        welt = new Welt(10,10,8);
        robo = new Roboter(welt);
    }
    
    // Methoden
    void los()
    {
        robo.Schritt();
        robo.Schritt();
        robo.Schritt();
    }
    
}