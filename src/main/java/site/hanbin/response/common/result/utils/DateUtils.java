package site.hanbin.response.common.result.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时间工具类
 * @author Administrator
 */
@Component
public class DateUtils {

    /**
     * 获得当前时间
     * @return string
     */
    public String getNowDateTime() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(nowDate);
    }

    /**
     * 获得当前时间
     * @return string
     */
    public static String getNowTime() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(nowDate);
    }

    /**
     * 获得当前日期
     * @return string
     */
    public static String getNowDay() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(nowDate);
    }

    /**
     * 获得当前年份
     * @return string
     */
    public static String getNowYear() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(nowDate);
    }

    /**
     * 获得当前小时
     * @return string
     */
    public static String getNowHour() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(nowDate);
    }


    /**
     * 获得当前分钟
     * @return string
     */
    public static String getNowMinute() {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("mm");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        return sdf.format(nowDate);
    }

    /**
     * 获得指定
     * @param year Integer
     * @param month Integer
     * @param day Integer
     * @param week Integer
     * @return String
     */
    public static String getDateTime(Integer year, Integer month, Integer day, Integer week) {
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(nowDate);
        if (year != 0) {
            calendar.add(Calendar.YEAR, year);
        }
        if (month != 0) {
            calendar.add(Calendar.MONTH, month);
        }
        if (week != 0) {
            calendar.add(Calendar.WEEK_OF_MONTH, week);
        }
        if (day != 0) {
            calendar.add(Calendar.DAY_OF_MONTH, day);
        }
        nowDate = calendar.getTime();
        return sdf.format(nowDate);
    }

    /**
     * 给一个日期获得其他的日期
     * @param date 传入的初始日期
     * @param num 想要得到的哪天（正数：代表后num天，负数：代表前num天）
     * @return 格式字符串的日期
     */
    public static String getAnotherDay(String date, Integer num) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 将字符串转化为时间格式
        Date nowDate = sdf.parse(date);
        // 得到日历
        Calendar calendar = Calendar.getInstance();
        // 把开始日期赋给日历
        calendar.setTime(nowDate);
        // 设置为num天
        calendar.add(Calendar.DAY_OF_MONTH, num);
        // 得到时间
        Date resultDate = calendar.getTime();
        return sdf.format(resultDate);
    }

    /**
     * 验证日期格式是否符合要求
     * @param date String
     * @return boolean
     */
    public static boolean validateStr(String date) {
        String datePattern = "\\d{4}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher match = pattern.matcher(date);
        return match.matches();
    }
}
