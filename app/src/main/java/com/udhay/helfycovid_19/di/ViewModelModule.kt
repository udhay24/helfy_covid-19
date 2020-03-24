package com.udhay.helfycovid_19.di

import com.udhay.helfycovid_19.detail_country.DetailCountryViewModel
import com.udhay.helfycovid_19.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(
            repository = get()
        )
    }

    viewModel {
        DetailCountryViewModel(
            repository = get()
        )
    }
}