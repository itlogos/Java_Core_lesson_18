package ua.lviv.lgs.part2;

public class Main {

    public static void main(String[] args) {
        myMap<String, Integer> namesNumber  = new myMap<>();

        namesNumber.add ( "Igor", 13 );
        namesNumber.add ( "Semen", 32 );
        namesNumber.add ( "Petro", 54 );
        namesNumber.add ( "Ylia", 17 );
        namesNumber.add ( "Boris", 24 );
        namesNumber.add ( "Nataly", 28 );
        namesNumber.viewMap ();

        namesNumber.removeKey ( "Boris" );
        namesNumber.removeValue ( 17 );
        namesNumber.setOfKeys ();
        namesNumber.listOfValues ();
        namesNumber.viewMap ();

    }

}
