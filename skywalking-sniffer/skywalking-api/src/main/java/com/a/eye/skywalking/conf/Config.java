package com.a.eye.skywalking.conf;

public class Config {

    public static class SkyWalking {
        public static String USERNAME = "";

        public static String APPLICATION_CODE = "";

        public static boolean IS_PREMAIN_MODE = false;

        public static String AGENT_BASE_PATH = "";

        public static String SERVERS = "";

    }

    public static class Disruptor{
        public static int BUFFER_SIZE = 1024 * 4;
    }

    public static class BuriedPoint {
        // 是否打印埋点信息
        public static boolean PRINTF = false;

        public static int MAX_EXCEPTION_STACK_LENGTH = 4000;

        // Business Key 最大长度
        public static int BUSINESSKEY_MAX_LENGTH = 300;

        // 使用逗号分离
        public static String EXCLUSIVE_EXCEPTIONS = "";
    }


    public static class Logging {
        // log文件名
        public static String LOG_FILE_NAME              = "skywalking-api.log";
        // log文件文件夹名字
        public static String LOG_DIR_NAME               = "logs";
        // 最大文件大小
        public static int    MAX_LOG_FILE_LENGTH        = 300 * 1024 * 1024;
        // skywalking 系统错误文件日志
        public static String SYSTEM_ERROR_LOG_FILE_NAME = "skywalking-api-error.log";
    }
}
