package basicgrammar.day27;

/**
 * Create by koala on 2020-12-26
 */
public class MyExceptionTest08 {

    public static void main(String[] args) {
        try {
            Teacher t = new Teacher();
            t.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Teacher{

    private int id;

    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else{
            //手动抛出异常对象
            throw new MyException08("自定义异常类测试，您输入的数据非法！");
        }

    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }

}