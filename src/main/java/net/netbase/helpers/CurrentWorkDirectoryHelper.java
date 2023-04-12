package net.netbase.helpers;
public class CurrentWorkDirectoryHelper {
    public static String currentWorkingDirectory(){
        return System.getProperty("user.dir");
    }
}
