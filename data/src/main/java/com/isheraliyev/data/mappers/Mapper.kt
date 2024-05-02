package com.isheraliyev.data.mappers

typealias Mapper<T, R> = (T) -> R

fun Int?.or0() = this ?: 0
fun Long?.or0() = this ?: 0
fun Double?.or0() = this ?: 0.0
fun Boolean?.orFalse() = this ?: false