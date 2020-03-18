package com.ukragro.dagger_habr.component

import com.ukragro.dagger_habr.Car
import com.ukragro.dagger_habr.Engine
import com.ukragro.dagger_habr.Fuel
import dagger.Component

//после создания компонента надо билд сделать
@Component
interface MyComponent  {
    fun getCar():Car
    fun getEngine():Engine
    fun getFuel():Fuel
}