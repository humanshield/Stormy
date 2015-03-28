package tim.com.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by tim on 3/28/15.
 */
public class CurrentWeather {
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
        // clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
        int iconId;
        switch (mIcon) {
            case "clear-day":
                iconId = R.drawable.clear_day;
                break;
            case "clear-night":
                iconId = R.drawable.clear_night;
                break;
            case "rain":
                iconId = R.drawable.rain;
                break;
            case "snow":
                iconId = R.drawable.snow;
                break;
            case "sleet":
                iconId = R.drawable.sleet;
                break;
            case "wind":
                iconId = R.drawable.wind;
                break;
            case "fog":
                iconId = R.drawable.fog;
                break;
            case "cloudy":
                iconId = R.drawable.cloudy;
                break;
            case "partly-cloudy-day":
                iconId = R.drawable.partly_cloudy;
                break;
            case "partly-cloudy-night":
                iconId = R.drawable.cloudy_night;
                break;
            default:
                iconId = R.drawable.clear_day;
                break;
        }

        return iconId;
    }
}
