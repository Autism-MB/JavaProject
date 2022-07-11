package chapter17;

/**
 * @author Mr.Xiao
 * @date 2022/06/28 10:31
 * @Contain
 **/
public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑可用的CPU数量
        int cpuNums = runtime.availableProcessors();

        System.out.println("当前有CPU的个数：" + cpuNums);

    }
}
