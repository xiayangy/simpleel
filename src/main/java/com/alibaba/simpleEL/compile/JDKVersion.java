package com.alibaba.simpleEL.compile;

/**
 * 类JDKVersion.java的实现描述：TODO 类实现描述 
 * @author xiayangyang 2014年8月8日 下午3:00:39
 */
public abstract class JDKVersion {

    public static String[]      JAVA_VERSIONS      = new String[] { "1.5.", "1.6.", "1.7.", "1.8." };

    private static final String javaVersion;
    // init jdk version is 1.6
    private static String       currentJavaVersion = "1.6";

    static {
        javaVersion = System.getProperty("java.version");
        for (String version : JAVA_VERSIONS) {
            if (javaVersion.contains(version)) {
                currentJavaVersion = version.substring(0, version.length() - 1);
                break;
            }
        }
    }

    /**
     * Get current system JDK version
     * 
     * @return
     */
    public static String getJavaVersion() {
        return javaVersion;
    }

    public static String getCurrentJavaVersion() {
        return currentJavaVersion;
    }

}
