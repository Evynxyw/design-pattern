package com.evyn.design.pattern.strategy.homework;

/**
 * @ClassName ExportExcel
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 10:13
 * @Version 1.0
 */
public class ExportExcel implements IExport{
    public void export(String content) {
        System.out.println("导出为Excel内容：" + content);
    }
}
