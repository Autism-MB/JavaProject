package chapter7;

/**
 * @author Mr.Xiao
 * @date 2022/05/02 10:20
 * @Contain 老鼠走迷宫
 **/
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("====地图情况====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        T t1 = new T();
        t1.findWay(map, 1, 1);
        System.out.println("====老鼠找到路径地图情况====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    //利用递归回溯思想
    //1.findWay方法来专门找出迷宫路径
    //2.找到True,否则False
    //3.map：二维数组,表示迷宫 i,j老鼠位置,初始为(1,1)
    //0表示可以走,1表示障碍物,2表示可以走,3表示走过，但是走不通是死路
    //老鼠找路策略: 下->右->上->左
    public boolean findWay(int[][] map, int i, int j){
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){
                map[i][j] =2;
                if(findWay(map, i + 1, j)){ //下
                    return true;
                }else if(findWay(map, i, j + 1)){
                    return true;
                }else if(findWay(map, i - 1, j)){
                    return true;
                }else if(findWay(map, i, j -1)){
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
