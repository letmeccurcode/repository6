package cn.itheima4;

import java.util.ArrayList;

public interface OpenMode {

    /**
     * @param totalMoney 总金额
     * @param totalCount 分几份
     * @return
     */
    ArrayList<Integer> divide(int totalMoney,int totalCount);
}
