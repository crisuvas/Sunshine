package com.ruiz.cris.sunshine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForecastActivity : AppCompatActivity() {

    var weather_tv : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)
        weather_tv = findViewById(R.id.tv_weather_data)

        val dummyWeatherData = arrayOf("Today, May 17 - Clear - 17°C / 15°C", "Tomorrow - Cloudy - 19°C / 15°C", "Thursday - Rainy- 30°C / 11°C", "Friday - Thunderstorms - 21°C / 9°C", "Saturday - Thunderstorms - 16°C / 7°C", "Sunday - Rainy - 16°C / 8°C", "Monday - Partly Cloudy - 15°C / 10°C", "Tue, May 24 - Meatballs - 16°C / 18°C", "Wed, May 25 - Cloudy - 19°C / 15°C", "Thu, May 26 - Stormy - 30°C / 11°C", "Fri, May 27 - Hurricane - 21°C / 9°C", "Sat, May 28 - Meteors - 16°C / 7°C", "Sun, May 29 - Apocalypse - 16°C / 8°C", "Mon, May 30 - Post Apocalypse - 15°C / 10°C")
        for(dummyWeatherDay: String in dummyWeatherData){
            weather_tv?.append(dummyWeatherDay)
        }
    }
}
