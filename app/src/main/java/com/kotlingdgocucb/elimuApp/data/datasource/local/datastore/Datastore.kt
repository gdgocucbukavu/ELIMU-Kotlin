package com.kotlingdgocucb.elimuApp.data.datasource.local.datastore

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

val Context.dataStore by preferencesDataStore("Setting")