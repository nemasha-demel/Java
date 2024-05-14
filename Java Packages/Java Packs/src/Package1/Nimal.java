package Package1;

import Package2.*;

public class Nimal {
    Kamal obj1 = new Kamal(); // In both public and default access modifiers, we can access classes within the
                              // package.
    Saman obj2 = new Saman(); // If the access modifier is public, the class can be accessed by another
                              // classes which are in another packages.
    // If the access modifier is defaulft, the classes can't be accessed by another
    // classed which are in anothe packages.

}
