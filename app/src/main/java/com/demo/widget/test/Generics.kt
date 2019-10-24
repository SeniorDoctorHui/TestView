package com.demo.widget.test

import android.content.Intent

interface Production<out T>{
    fun produce(): T
}

interface Cosumer<in T>{
    fun cosume(item: T)
}

open class food
open class FastFood: food()
open class Ice_cream: FastFood()

class FoodStore: Production<food>{
    override fun produce(): food {
        return food()
    }
}

class FastFoodStore: Production<FastFood>{
    override fun produce(): FastFood {
        return FastFood()
    }
}

class Ice_CreamStore: Production<Ice_cream>{
    override fun produce(): Ice_cream {
        return Ice_cream()
    }
}
//协变
val store: Production<food> = FoodStore()
val store1: Production<food> = FastFoodStore()

class Animal: Cosumer<food>{
    override fun cosume(item: food) {

    }
}

class Human: Cosumer<FastFood>{
    override fun cosume(item: FastFood) {

    }
}
//逆变  持有子类泛型类型的引用可以指向持有父类泛型类型的对象
val cosumer: Cosumer<FastFood> = Animal()
val cosumer1: Cosumer<food>  = Animal()

data class TempGroupInfo(var name: String,  var memberNum: Long, var groupOwner: String,var avatar: String = "")

val temp = TempGroupInfo("",1,"")



