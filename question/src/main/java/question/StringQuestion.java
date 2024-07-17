package question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author cheng chen
 * @date 20240717
 * @summary 
 * ***/
public class StringQuestion {
    
	 /**
	  * 
	  * @summary 有一个不定长度的String，其中前面是字母，后边是数字,例如："abcd123.456", 
	  *          要求写一个方法得到其中的数字以String的形式返回,数字保留小数点后两位， 
	  *          不四舍五入，截去多余小数,例如："abcd123.456"，
	  *          得到"123.45" 如果数字没有小数点,要得到两位为0的小数，例如："abcd123"，得到"123.00".
	  *          没有则返回null.
	  * @author cheng chen 
	  * @Date cheng chen
	  * @param inputStr input string
	  * @return string of number or null 
	  * **/
	 public static String extractAndFormatNumber(String inputStr) {
	        // 定义正则表达式匹配数字部分
	        Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]*");
	        Matcher matcher = pattern.matcher(inputStr);
	        String formattedNumber=null;
	        if (matcher.find()) {
	            String numberStr = matcher.group(); // 获取匹配到的数字字符串
	            // 格式化数字，保留两位小数，不四舍五入
	            if(numberStr != null) {
	            	double number = Double.parseDouble(numberStr);
	            	formattedNumber = String.format("%.2f", number);
	            }
	        }
	        return formattedNumber;
	    }
}
