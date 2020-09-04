package ideals.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsManager {

    public static OSType getOsType() {
        log.info("Getting OS type...");
        OSType osType;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.startsWith("mac")) {
            osType = OSType.MAC;
        } else if (osName.startsWith("win")) {
            osType = OSType.WINDOWS;
        } else if (osName.startsWith("linux")) {
            osType = OSType.LINUX;
        } else {
            throw new RuntimeException("Unsupported OS");
        }
        return osType;
    }

    public enum OSType {
        MAC,
        WINDOWS,
        LINUX
    }
}
