package br.senai.sp.jandira.bmicalculator.calcs

import androidx.compose.ui.text.font.FontWeight
import kotlin.math.pow

fun bmiCalculate(weight: Double, heigth: Double): Double {
    return weight / (heigth / 100).pow(2)
}