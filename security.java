import android.content.Context;
import android.os.PowerManager;

public class RestartManager {
    public static void restartDevice(Context context) {
        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        pm.reboot(null);
    }
}
