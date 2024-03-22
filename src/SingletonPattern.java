import static java.util.Objects.isNull;

/**
 * @author romeo.jerenyama
 * @created 05/12/2023 - 15:06
 */
public class SingletonPattern {


    public static void main(String[] args) {

        MySingleton mySingleton = MySingleton.newInstance();
        MySingleton mySingleton1 = MySingleton.newInstance();
        System.out.println(mySingleton.equals(mySingleton1));

    }
}

class MySingleton{
    private static MySingleton mySingletonInstance;
    private String firstVal;
    private String secondVal;

    private MySingleton() {
    }

    public static MySingleton newInstance(){
        if (isNull(mySingletonInstance)){
            mySingletonInstance = new MySingleton();
        }
        return mySingletonInstance;
    }

    public String getFirstVal() {
        return firstVal;
    }

    public void setFirstVal(String firstVal) {
        this.firstVal = firstVal;
    }

    public String getSecondVal() {
        return secondVal;
    }

    public void setSecondVal(String secondVal) {
        this.secondVal = secondVal;
    }
}