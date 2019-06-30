package com.aachartmodel.aainfographics.ChartsDemo.AdditionalContent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction1
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction2
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction3
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customAreaChartTooltipStyleWithFormatterFunction4
import com.aachartmodel.aainfographics.ChartsDemo.ChartComposer.CustomTooltipComposer.Companion.customBoxplotTooltipContent
import com.aachartmodel.aainfographics.R
import com.aachartmodel.aainfographics.aainfographicsLib.aachartConfiger.AAChartView
import java.util.HashMap

class CustomTooltipWithJSFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction)
        val intent = intent
        val chartType = intent.getStringExtra("chartType")

        val aaOptions = configureTheChartOptions(chartType)

        val aaChartView:AAChartView = findViewById(R.id.AAChartView)
        aaChartView.aa_drawChartWithChartOptions(aaOptions)

    }

    private fun configureTheChartOptions(chartType: String): HashMap<*, *> {
        when (chartType) {
            "formatterFunction1" -> return customAreaChartTooltipStyleWithFormatterFunction1()
            "formatterFunction2" -> return customAreaChartTooltipStyleWithFormatterFunction2()
            "formatterFunction3" -> return customAreaChartTooltipStyleWithFormatterFunction3()
            "formatterFunction4" -> return customAreaChartTooltipStyleWithFormatterFunction4()
            "formatterFunction5" -> return customBoxplotTooltipContent()
        }
        return customAreaChartTooltipStyleWithFormatterFunction1()
    }
}
