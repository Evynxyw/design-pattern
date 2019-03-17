package com.evyn.design.pattern.strategy.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ExprortStrategy
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 10:16
 * @Version 1.0
 */
public class ExprortStrategy {
    public static Map<String, IExport> exportStrategy = new HashMap<String, IExport>();
    static {
        exportStrategy.put("EXCEL", new ExportExcel());
        exportStrategy.put("PDF", new ExportPdf());
        exportStrategy.put("TEXT", new ExportText());
    }

    public static IExport getExportType(String key){
        IExport export = new ExportText();
        if(exportStrategy.containsKey(key)){
            export = exportStrategy.get(key);
        }
        return export;
    }
}
