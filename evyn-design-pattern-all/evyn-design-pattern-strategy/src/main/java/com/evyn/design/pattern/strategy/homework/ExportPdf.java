package com.evyn.design.pattern.strategy.homework;

/**
 * @ClassName ExportPdf
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 10:14
 * @Version 1.0
 */
public class ExportPdf implements IExport {
    public void export(String content) {
        System.out.println("导出为PDF内容：" + content);
    }
}
