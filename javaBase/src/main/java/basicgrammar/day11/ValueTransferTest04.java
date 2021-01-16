package basicgrammar.day11;

/**
 * Create by koala on 2020-12-09
 */
public class ValueTransferTest04 {

    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + ",n =" + data.n);

        ValueTransferTest04 test = new ValueTransferTest04();
        test.swap(data);
        System.out.println("m = " + data.m + ",n =" + data.n);
    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data{

    int m;
    int n;

}
