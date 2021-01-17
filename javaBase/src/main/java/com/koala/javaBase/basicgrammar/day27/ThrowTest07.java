package com.koala.javaBase.basicgrammar.day27;

/**
 * Create by koala on 2020-12-26
 */
public class ThrowTest07 {

    public static void main(String[] args) {

        try {
            Student s = new Student();
            s.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}


class Student{

    private int id;

    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else{
            //手动抛出异常对象
			//throw new RuntimeException("您输入的数据非法！");//该异常对象为运行时异常对象，可不选择throws
			throw new Exception("您输入的数据非法！");//该异常包含编译时异常故必须throws
        }

    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }

}
