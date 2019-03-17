package com.evyn.design.pattern.strategy.homework;

/**
 * @ClassName ExportTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 10:20
 * @Version 1.0
 */
public class ExportTest {

    public static void main(String[] args) {
        IExport exportTypePdf = ExprortStrategy.getExportType("PDF");
        exportTypePdf.export("PDF测试");


        IExport exportTypeExcel = ExprortStrategy.getExportType("EXCEL");
        exportTypeExcel.export("Excel测试");
    }
}
