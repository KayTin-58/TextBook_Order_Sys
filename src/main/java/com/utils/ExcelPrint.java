package com.utils;

import com.po.Book;
import org.apache.poi.hssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 直到世界尽头 on 4/16 0016.
 */
public class ExcelPrint {





    /**
     * 生成com.po.Book对象的Excel
     * @param rolist
     */
    public static void PrintExcel_Book(List<com.po.Book>  booklist,String filename){

        // 第一步，创建一个webbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet("学生表一");
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        HSSFRow row = sheet.createRow((int) 0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式


        HSSFCell cell = row.createCell((short) 0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);

        cell = row.createCell((short) 1);
        cell.setCellValue("书名");
        cell.setCellStyle(style);

        cell = row.createCell((short) 2);
        cell.setCellValue("作者");
        cell.setCellStyle(style);

        cell = row.createCell((short) 3);
        cell.setCellValue("出版社");
        cell.setCellStyle(style);

        cell = row.createCell((short) 4);
        cell.setCellValue("ISBN");
        cell.setCellStyle(style);

        cell = row.createCell((short) 5);
        cell.setCellValue("版本");
        cell.setCellStyle(style);

        cell = row.createCell((short) 6);
        cell.setCellValue("数量");
        cell.setCellStyle(style);



        for(int i=0;i<booklist.size();i++){
            row = sheet.createRow((int) i + 1);//创建一个行
            Book book=booklist.get(i);
            // 第四步，创建单元格，并设置值
            row.createCell((short) 0).setCellValue(i+1);
            row.createCell((short) 1).setCellValue(book.getBookname());
            row.createCell((short) 2).setCellValue(book.getAuthor());
            row.createCell((short) 3).setCellValue(book.getAuthor());
            row.createCell((short) 4).setCellValue(book.getPress());
            row.createCell((short) 5).setCellValue(book.getIsbn());
            row.createCell((short) 6).setCellValue(book.getVersion());
            row.createCell((short) 7).setCellValue(book.getQuantity());

        }

        saveFile(wb,filename);

    }


    /**
     * 保存文件
     * @param wb
     * @param filename
     */
    public static void saveFile(HSSFWorkbook  wb,String filename){
        //保存文件位置
        try
        {
            Date date=new Date();
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str=format.format(date);
            File file=new File(filename+str);
            FileOutputStream out = new FileOutputStream(file);
            wb.write(out);
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
