package com.evyn.design.pattern.strategy.homework;

/**
 * @ClassName ExportText
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 10:15
 * @Version 1.0
 */
public class ExportText implements IExport {
    public void export(String content) {
        System.out.println("导出为文本Text内容：" + content);
    }
}
