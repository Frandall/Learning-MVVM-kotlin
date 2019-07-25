package com.learning.forecastmvvm.data.repository

import androidx.lifecycle.LiveData
import com.learning.forecastmvvm.data.db.entity.WeatherLocation
import com.learning.forecastmvvm.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.learning.forecastmvvm.data.db.unitlocalized.future.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getFutureWeatherList(startDate:LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}