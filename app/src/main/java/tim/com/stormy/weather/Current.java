package tim.com.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by tim on 3/28/15.
 */
public class Current {
    private String mIcon;
    private long mTime;
    private double mTemp;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }
    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
    public String getSummary() {
        return mSummary;
    }
    public void setSummary(String summary) {
        mSummary = summary;
    }
    public void setIcon(String icon) {
        mIcon = icon;
    }
    public long getTime() {
        return mTime;
    }
    public void setTime(long time) {
        mTime = time;
    }
    public int getTemp() {
        return (int)Math.round(mTemp);
    }
    public void setTemp(double temp) {
        mTemp = temp;
    }
    public double getHumidity() {
        return mHumidity;
    }
    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }
    public int getPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int)Math.round(precipPercentage);
    }
    public void setPercipChance(double percipChance) {
        mPrecipChance = percipChance;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);

        return formatter.format(dateTime);
    }

    public int getIconId() {
        return Forecast.getIconId(mIcon);
    }
}
