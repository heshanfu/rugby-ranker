package com.ricknout.rugbyranker.common.util

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

object DateUtils {

    fun getCurrentDate(format: String) = getDate(format, System.currentTimeMillis())

    fun getDate(format: String, millis: Long): String {
        val simpleDateFormat = SimpleDateFormat(format, Locale.getDefault())
        val time = Calendar.getInstance().apply { timeInMillis = millis }.time
        return simpleDateFormat.format(time)
    }

    const val DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd"
    const val DATE_FORMAT_D_MMM_YYYY = "d MMM, yyyy"
}
