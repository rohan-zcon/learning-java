package accessControl;

public class DemoControl {
    private int id;
    public String name;
    protected int age;
    int[] arr; //default

//    private: only in this class, not even in its subclass. use getter setter
//    public: anywhere in outside world
//    protected: accessible in same class, same package, different package via subclass
//    default: same package

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
