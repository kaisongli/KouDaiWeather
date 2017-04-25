package yixingu.koudaiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by likaisong on 17-4-25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
