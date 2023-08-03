package com.example.cryptoapp.data.Workers

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

interface ChildWorkerFactory {

    fun create(
        context: Context,
        workerParameters: WorkerParameters
    ): ListenableWorker
}