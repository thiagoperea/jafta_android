package com.thiagoperea.jafta.presentation.features.home.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.patrykandpatrick.vico.compose.chart.Chart
import com.patrykandpatrick.vico.compose.chart.line.lineChart
import com.patrykandpatrick.vico.compose.component.shape.shader.fromBrush
import com.patrykandpatrick.vico.core.chart.layout.HorizontalLayout
import com.patrykandpatrick.vico.core.chart.line.LineChart
import com.patrykandpatrick.vico.core.component.shape.shader.DynamicShaders
import com.patrykandpatrick.vico.core.entry.entryModelOf
import com.thiagoperea.jafta.internal.ui.theme.Violet100
import com.thiagoperea.jafta.internal.ui.theme.purpleGraphStartColor

@Composable
fun HomeChart(
    modifier: Modifier = Modifier
) {
    val mockData = entryModelOf(4f, 5f, 2f, 7f, 5f, 12f, 5f)

    val chartLineSpec = remember { arrayListOf<LineChart.LineSpec>() }
    chartLineSpec.add(
        LineChart.LineSpec(
            lineColor = Violet100.toArgb(),
            lineThicknessDp = 6f,
            lineBackgroundShader = DynamicShaders.fromBrush(
                brush = Brush.verticalGradient(
                    listOf(purpleGraphStartColor, Color.Transparent)
                )
            )
        )
    )

    Chart(
        modifier = modifier,
        chart = lineChart(
            lines = chartLineSpec,
        ),
        model = mockData,
        horizontalLayout = HorizontalLayout.FullWidth(),
    )
}