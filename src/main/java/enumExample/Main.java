package enumExample ;

public class Main
{
    public static void main(String[] args)
    {


        System.out.println(Colors.MIDNIGHT_BLUE.getRed());

        System.out.println(Planets.PLUTO);



























































        /*
        Enums are like classes. They have fields/properties and they can have methods.
        Enums are implicitly static and final.

        All properties of enums are implicitly public, static, and final.
        We write their names with capital letters.

        Properties must be declared before anything else. They are separated by commas.
        Only need semicolon if there is more to come.

        We use enums because they can be easier to read and it makes it easier for the compiler to catch errors.
        We use enums when we need to represent a fixed set of constants.

        Enums can have constructors for their fields. It must be private, which means you cannot call it from the outside.
        Instead, give the values to the constants as you make them.

        All enums have a static method called .values() and .toString(), but the toString typically gets overridden.
        .values() returns an array with the constants in it. Static so you don't make an instance of an enum.
         */

    }
}