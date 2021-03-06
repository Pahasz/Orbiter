package com.quickbite.spaceslingshot.objects.gamescreenobjects

import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Disposable
import com.quickbite.spaceslingshot.data.GameScreenData
import com.quickbite.spaceslingshot.interfaces.IUpdateable

/**
 * Created by Paha on 9/11/2016.
 */
class AsteroidSpawner(val position: Vector2, val spawnDirection:Vector2, val spawnFrequency:Pair<Float, Float>, val speedRange:Pair<Float, Float>, val data:GameScreenData, immediate:Boolean = false) : IUpdateable, Disposable {
    override var dead: Boolean = false

    var counter = 0f
    var chosenTime:Float = if(immediate) 0f else MathUtils.random(spawnFrequency.first, spawnFrequency.second)

    override fun update(delta: Float) {
        counter += delta
        if(counter >= chosenTime){
            val randSpeed = MathUtils.random(speedRange.first, speedRange.second)
            val asteroid = Asteroid(Vector2(position.x, position.y), 10f, Vector2(spawnDirection.x * randSpeed, spawnDirection.y * randSpeed), 10f)
            data.asteroidList.add(asteroid)
            counter = 0f
            chosenTime = MathUtils.random(spawnFrequency.first, spawnFrequency.second)
        }
    }

    override fun fixedUpdate(delta: Float) {

    }

    override fun dispose() {

    }
}