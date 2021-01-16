package basicgrammar.day27;

/**
 * Create by koala on 2020-12-26
 *
 * 如何自定义异常类？
 * 1. 继承于现有的异常结构：RuntimeException 、Exception
 * 2. 提供全局常量：serialVersionUID
 * 3. 提供重载的构造器
 *
 */
public class MyException08 extends RuntimeException {

    static final long serialVersionUID = -7034897193246939L;

    public MyException08(){

    }

    public MyException08(String msg){
        super(msg);
    }

}
