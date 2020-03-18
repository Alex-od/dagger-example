package com.ukragro.dagger_habr

import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine) {
}