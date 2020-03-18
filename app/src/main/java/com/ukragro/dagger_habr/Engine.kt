package com.ukragro.dagger_habr

import javax.inject.Inject

class Engine @Inject constructor(private var fuel: Fuel) {
}