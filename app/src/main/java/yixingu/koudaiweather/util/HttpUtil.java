package yixingu.koudaiweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by likaisong on 17-4-25.
 */

public class HttpUtil {
    public static void sendOkHttpRequests(String adress, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
