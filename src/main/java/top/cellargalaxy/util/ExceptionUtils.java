package top.cellargalaxy.util;

/**
 * Created by cellargalaxy on 18-5-2.
 */
public class ExceptionUtils {
    public static final String exception2String(Exception exception) {
        StringBuilder stringBuilder = new StringBuilder("Exception in thread \"" + Thread.currentThread().getName() + "\" " + exception.toString());
        for (StackTraceElement stackTraceElement : exception.getStackTrace()) {
            stringBuilder.append("\n\tat " + stackTraceElement);
        }
        return stringBuilder.toString();
    }
}
