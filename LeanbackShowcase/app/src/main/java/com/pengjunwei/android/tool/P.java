package com.pengjunwei.android.tool;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class P {
    public static final Map<String, Boolean> sEnableFlagMap = new HashMap<>(1);
    protected static    boolean              isEnable       = false;

    //2019-10-08 09:47:14.879 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: =========================================================
    //2019-10-08 09:47:14.879 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  0      fileName:VMStack.java      className:dalvik.system.VMStack      methodName:getThreadStackTrace      lineNumber:-2
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  1      fileName:Thread.java      className:java.lang.Thread      methodName:getStackTrace      lineNumber:1558
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  2      fileName:P.java      className:com.pengjunwei.android.tool.P      methodName:e      lineNumber:9
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  3      fileName:ViewPortHandler.java      className:com.github.mikephil.charting.utils.ViewPortHandler      methodName:restrainViewPort      lineNumber:117
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  4      fileName:BarLineChartBase.java      className:com.github.mikephil.charting.charts.BarLineChartBase      methodName:calculateOffsets      lineNumber:554
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  5      fileName:BarLineChartBase.java      className:com.github.mikephil.charting.charts.BarLineChartBase      methodName:notifyDataSetChanged      lineNumber:389
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  6      fileName:Chart.java      className:com.github.mikephil.charting.charts.Chart      methodName:setData      lineNumber:300
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  7      fileName:LinePjwChartActivity.java      className:com.xxmassdeveloper.mpchartexample.pjw.LinePjwChartActivity      methodName:setData      lineNumber:261
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  8      fileName:LinePjwChartActivity.java      className:com.xxmassdeveloper.mpchartexample.pjw.LinePjwChartActivity      methodName:onProgressChanged      lineNumber:431
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  9      fileName:SeekBar.java      className:android.widget.SeekBar      methodName:onProgressRefresh      lineNumber:97
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  10      fileName:ProgressBar.java      className:android.widget.ProgressBar      methodName:doRefreshProgress      lineNumber:1368
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  11      fileName:ProgressBar.java      className:android.widget.ProgressBar      methodName:refreshProgress      lineNumber:1428
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  12      fileName:ProgressBar.java      className:android.widget.ProgressBar      methodName:setProgressInternal      lineNumber:1499
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  13      fileName:ProgressBar.java      className:android.widget.ProgressBar      methodName:setProgress      lineNumber:1464
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  14      fileName:LinePjwChartActivity.java      className:com.xxmassdeveloper.mpchartexample.pjw.LinePjwChartActivity      methodName:onCreate      lineNumber:159
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  15      fileName:Activity.java      className:android.app.Activity      methodName:performCreate      lineNumber:7458
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  16      fileName:Activity.java      className:android.app.Activity      methodName:performCreate      lineNumber:7448
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  17      fileName:Instrumentation.java      className:android.app.Instrumentation      methodName:callActivityOnCreate      lineNumber:1286
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  18      fileName:ActivityThread.java      className:android.app.ActivityThread      methodName:performLaunchActivity      lineNumber:3409
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  19      fileName:ActivityThread.java      className:android.app.ActivityThread      methodName:handleLaunchActivity      lineNumber:3614
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  20      fileName:LaunchActivityItem.java      className:android.app.servertransaction.LaunchActivityItem      methodName:execute      lineNumber:86
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  21      fileName:TransactionExecutor.java      className:android.app.servertransaction.TransactionExecutor      methodName:executeCallbacks      lineNumber:108
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  22      fileName:TransactionExecutor.java      className:android.app.servertransaction.TransactionExecutor      methodName:execute      lineNumber:68
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  23      fileName:ActivityThread.java      className:android.app.ActivityThread$H      methodName:handleMessage      lineNumber:2199
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  24      fileName:Handler.java      className:android.os.Handler      methodName:dispatchMessage      lineNumber:112
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  25      fileName:Looper.java      className:android.os.Looper      methodName:loop      lineNumber:216
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  26      fileName:ActivityThread.java      className:android.app.ActivityThread      methodName:main      lineNumber:7625
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  27      fileName:Method.java      className:java.lang.reflect.Method      methodName:invoke      lineNumber:-2
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  28      fileName:RuntimeInit.java      className:com.android.internal.os.RuntimeInit$MethodAndArgsCaller      methodName:run      lineNumber:524
    //2019-10-08 09:47:14.880 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: stackTraceElement  29      fileName:ZygoteInit.java      className:com.android.internal.os.ZygoteInit      methodName:main      lineNumber:987
    //2019-10-08 09:47:14.884 17717-17717/com.xxmassdeveloper.mpchartexample E/pjw: =========================================================
    public static void setEnable(boolean tIsEnable) {
        isEnable = tIsEnable;
    }

    public static void e(Object... messages) {
        if (!isEnable) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            //            int count = 0;
            //            for (StackTraceElement stackTraceElement : stackTrace) {
            //                Log.e("pjw", "stackTraceElement  " + count
            //                        + "      fileName:" + stackTraceElement.getFileName()
            //                        + "      className:" + stackTraceElement.getClassName()
            //                        + "      methodName:" + stackTraceElement.getMethodName()
            //                        + "      lineNumber:" + stackTraceElement.getLineNumber()
            //                );
            //
            //                count++;
            //            }

            StringBuilder stringBuilder = new StringBuilder();
            for (Object message : messages) {
                stringBuilder.append(message);
            }

            Log.e("pjw", String.format("%1$-30s %2$-20s:%3$-5s %4$s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), stringBuilder));
        }
    }

    public static void ee(Object... messages) {
        if (!isEnable) {
            return;
        }

        StringBuilder       logBuilder = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object message : messages) {
                stringBuilder.append(message);
            }

            logBuilder.append(String.format("%1$-30s %2$-20s:%3$-5s %4$-95s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), stringBuilder));
        }

        if (stackTrace.length > 4) {
            logBuilder.append(String.format("%1$30s %2$-20s:%3$-5s", stackTrace[4].getFileName(), stackTrace[4].getMethodName(), stackTrace[4].getLineNumber()));
        }

        Log.e("pjw", logBuilder.toString());
    }

    public static void eea(Object... messages) {
        if (!isEnable) {
            return;
        }

        StringBuilder       logBuilder = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object message : messages) {
                stringBuilder.append(message);
            }

            logBuilder.append(String.format("%1$-30s %2$-20s:%3$-5s %4$-95s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), stringBuilder));
        }

        if (stackTrace.length > 4) {
            for (int i = 4; i < stackTrace.length; i++) {
                logBuilder.append(String.format("\n%1$30s %2$-20s:%3$-5s", stackTrace[i].getFileName(), stackTrace[i].getMethodName(), stackTrace[i].getLineNumber()));
            }
        }

        Log.e("pjw", logBuilder.toString());
    }

    //    /**
    //     * 解决中文字符串长度问题
    //     * @param messages
    //     */
    //    public static void eee(Object... messages) {
    //        StringBuilder logBuilder = new StringBuilder();
    //        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    //        if (stackTrace.length > 3) {
    //            StringBuilder stringBuilder = new StringBuilder();
    //            for (Object message : messages) {
    //                stringBuilder.append(message);
    //            }
    //
    //            String tempString = stringBuilder.toString();
    //            String messageString = String.format("%-95s", new String(tempString.getBytes(), StandardCharsets.ISO_8859_1));
    //            messageString = new String(messageString.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    //
    //            logBuilder.append(String.format("%1$-30s %2$-20s:%3$-5s %4$s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), messageString));
    //        }
    //
    //        if (stackTrace.length > 4) {
    //            logBuilder.append(String.format("%1$30s %2$-20s:%3$-5s", stackTrace[4].getFileName(), stackTrace[4].getMethodName(), stackTrace[4].getLineNumber()));
    //        }
    //
    //        Log.e("pjw", logBuilder.toString());
    //    }

    public static void el(Object... messages) {
        if (!isEnable) {
            return;
        }

        StringBuilder       logBuilder = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object message : messages) {
                stringBuilder.append(message);
            }

            logBuilder.append(String.format("%1$-30s %2$-20s:%3$-5s %4$-520s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), stringBuilder));
        }

        if (stackTrace.length > 4) {
            logBuilder.append(String.format("%1$30s %2$-20s:%3$-5s", stackTrace[4].getFileName(), stackTrace[4].getMethodName(), stackTrace[4].getLineNumber()));
        }

        Log.e("pjw", logBuilder.toString());
    }


    /**
     * 打印当前线程
     */
    public static void pt() {
        if (!isEnable) {
            return;
        }

        StringBuilder       logBuilder = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("thread id==>").append(Thread.currentThread().getId()).append("\t").append(Thread.currentThread().getName());

            logBuilder.append(String.format("%1$-30s %2$-20s:%3$-5s %4$-30s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), stringBuilder));
        }

        if (stackTrace.length > 4) {
            logBuilder.append(String.format("%1$30s %2$-20s:%3$-5s", stackTrace[4].getFileName(), stackTrace[4].getMethodName(), stackTrace[4].getLineNumber()));
        }

        Log.e("pjw", logBuilder.toString());
    }

    public static void eeDate(Date startDate, Date endDate) {
        if (!isEnable) {
            return;
        }

        //        StringBuilder logBuilder = new StringBuilder();
        //        StringBuilder stringBuilder = new StringBuilder();
        //        for (Object message : messages) {
        //            stringBuilder.append(message);
        //        }
        //
        //        logBuilder.append(stringBuilder);
        //
        //        Log.e("pjw", logBuilder.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        eel("startDate==>", startDate == null ? "null" : simpleDateFormat.format(startDate)
                , "\tendDate==>", startDate == null ? "null" : simpleDateFormat.format(endDate)
        );
    }

    public static void eel(Object... messages) {
        if (!isEnable) {
            return;
        }

        StringBuilder logBuilder    = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        for (Object message : messages) {
            stringBuilder.append(message);
        }

        logBuilder.append(stringBuilder);

        Log.e("pjw", logBuilder.toString());
    }

    public static StringBuilder list2String(List objectList) {
        StringBuilder tempStringBuilder = new StringBuilder("null");
        if (objectList != null && objectList.size() > 0) {
            int size = objectList.size();
            tempStringBuilder.delete(0, tempStringBuilder.length());
            size = Math.min(size, 3);
            tempStringBuilder.append("[");
            for (int i = 0; i < size; i++) {
                tempStringBuilder.append(objectList.get(i));
                tempStringBuilder.append(",");
            }
            tempStringBuilder.append("]");
        }

        return tempStringBuilder;
    }

    public static void line() {
        if (!isEnable) {
            return;
        }

        Log.e("pjw", String.format("%168s", "---line---"));
    }

    public static void line(String tag) {
        if (!isEnable) {
            return;
        }

        Log.e("pjw", tag + String.format("%168s", ""));
    }

    public static String array2String(String[][] result) {
        String[] tempStringArray = {};
        if (result != null) {
            int length = result.length;
            tempStringArray = new String[length];
            for (int i = 0; i < length; i++) {
                tempStringArray[i] = Arrays.toString(result[i]);
            }
        }
        return Arrays.toString(tempStringArray);
    }

    /**
     * 打印触摸事件
     *
     * @param ev
     */
    public static void eeTouch(MotionEvent ev, Object... messages) {
        if (!isEnable) {
            return;
        }

        StringBuilder       logBuilder = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 3) {
            StringBuilder stringBuilder = new StringBuilder();

            //----提前添加触摸信息
            stringBuilder.append("MotionEvent==>");
            if (ev == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(MotionEvent.actionToString(ev.getAction()));
                stringBuilder.append("\tgetX==>").append(ev.getX());
                stringBuilder.append("\tgetY==>").append(ev.getY());
            }
            //----提前添加触摸信息

            for (Object message : messages) {
                stringBuilder.append(message);
            }

            logBuilder.append(String.format("%1$-30s %2$-20s:%3$-5s %4$-95s", stackTrace[3].getFileName(), stackTrace[3].getMethodName(), stackTrace[3].getLineNumber(), stringBuilder));
        }

        if (stackTrace.length > 4) {
            logBuilder.append(String.format("%1$30s %2$-20s:%3$-5s", stackTrace[4].getFileName(), stackTrace[4].getMethodName(), stackTrace[4].getLineNumber()));
        }

        Log.e("pjw", logBuilder.toString());
    }

    public static void setEnablePrintFlag(Object objectTraceKey) {
        if (objectTraceKey == null) {
            return;
        }

        sEnableFlagMap.put(objectTraceKey.getClass().getSimpleName(), true);
    }

    public static void disablePrintFlag(Object objectTraceKey) {
        if (objectTraceKey == null) {
            return;
        }

        sEnableFlagMap.remove(objectTraceKey.getClass().getSimpleName());
    }


    public static void checkPrintEnable(String objectTraceKey) {
        if (objectTraceKey == null) {
            return;
        }

        if (sEnableFlagMap.containsKey(objectTraceKey)) {
            Boolean isEnable = sEnableFlagMap.get(objectTraceKey);
            if (isEnable != null && isEnable) {
                P.setEnable(true);
            }
        }
    }

    public static boolean checkDebugEnable(String objectTraceKey) {
        if (objectTraceKey == null) {
            return false;
        }

        if (sEnableFlagMap.containsKey(objectTraceKey)) {
            Boolean isEnable = sEnableFlagMap.get(objectTraceKey);
            if (isEnable != null && isEnable) {
                P.setEnable(true);
                return true;
            }
        }

        return false;
    }

    public static String getFocusDirectionText(int direction) {
        String result = "";
        switch (direction) {
            case View.FOCUS_LEFT:
                result = "FOCUS_LEFT";
                break;
            case View.FOCUS_UP:
                result = "FOCUS_UP";
                break;
            case View.FOCUS_RIGHT:
                result = "FOCUS_RIGHT";
                break;
            case View.FOCUS_DOWN:
                result = "FOCUS_DOWN";
                break;
        }

        return result;
    }
}
