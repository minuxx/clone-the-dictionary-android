package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.License

data class LicenseDto(
    val name: String,
    val url: String
) {
    fun toLicenseName(): String {
        return name
    }
}