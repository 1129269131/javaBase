package basicgrammar.day06;

/**
 * Create by koala on 2020-11-19
 *
 * 例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
 *
 * 说明：如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。
 *
 */
public class SwitchCaseTest02 {

    public static void main(String[] args) {

        int score = 78;
        switch(score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;

        }

        //更优的解决方案：
        switch(score / 60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }

    }

}
