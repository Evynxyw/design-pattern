package com.evyn.design.pattern.adapter;

/**
 * @ClassName PowerAdapter
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 21:13
 * @Version 1.0
 */
public class PowerAdapter implements DC5{

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outoupDC5V(){
        int adapterInput = ac220.outputAC22OV();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" +
                adapterInput + "V, 输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
