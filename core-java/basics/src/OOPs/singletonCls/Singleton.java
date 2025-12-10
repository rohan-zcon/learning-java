package OOPs.singletonCls;

// Class of which only one object can be created are Singleton class.
// So we shouldnot allow the user to call Constructor
public class Singleton {
    // Make constructor pvt
    // Pvt makes it inaccessible to anyone outside class
    private Singleton() {
    }

    // make pvt instance which will be passed back via getter()
    private static Singleton instance;

    static Singleton getInstance() {
        if (instance == null) {
            // create the instance
            instance = new Singleton();
        }
        return instance;
    }


}
