package senior.day15;

/**
 * Create by koala on 2021-01-07
 */
public class Order04<T> {

    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order04(){

        //编译不通过
        //T[] arr = new T[10];
        //编译通过
        T[] arr = (T[]) new Object[10];

    }

    public Order04(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order04{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    //静态方法中不能使用类的泛型
    /*public static void show(T orderT){
        System.out.println(orderT);
    }*/

    public void show(){
        //编译不通过：异常类不能声明为泛型类
        /*try{

        }catch(T t){

        }*/
    }

}
