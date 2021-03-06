package com.quickbite.spaceslingshot.data

import com.badlogic.gdx.utils.Array
import com.quickbite.spaceslingshot.objects.gamescreenobjects.*
import com.quickbite.spaceslingshot.screens.GameScreen
import com.quickbite.spaceslingshot.screens.EndlessGame

/**
 * Created by Paha on 8/6/2016.
 */
class GameScreenData(val gameScreen: GameScreen, isEndlessGame: Boolean = false){
    var currPlanetScore = 0L //The number of planets we passed (in endless)
    var levelTimer = 0f //The time recorded of the level
    var currLevel = 0 //The current level index
    var pauseLimit = 100f //The amount of pause time we have

    lateinit var ship: PlayerShip
    val planetList: Array<Planet> = Array()
    val obstacleList: Array<Obstacle> = Array()
    val asteroidSpawnerList: Array<AsteroidSpawner> = Array()
    val asteroidList: Array<Asteroid> = Array()
    val stationList: Array<SpaceStation> = Array()
    val fuelContainerList: Array<FuelContainer> = Array()
    var achievementFlags = arrayOf(false, false, false)

    var endlessGame: EndlessGame? = null

    init {
    }

    fun reset(){
        planetList.forEach { it.dispose() }
        obstacleList.forEach { it.dispose() }
        asteroidSpawnerList.forEach { it.dispose() }
        asteroidList.forEach { it.dispose() }
        stationList.forEach { it.dispose() }
        fuelContainerList.forEach { it.dispose() }

        planetList.clear()
        obstacleList.clear()
        asteroidSpawnerList.clear()
        asteroidList.clear()
        stationList.clear()
        fuelContainerList.clear()
    }

    fun disposeAndClearLists(){
        planetList.forEach { it.dispose() }
        obstacleList.forEach { it.dispose() }
        asteroidSpawnerList.forEach { it.dispose() }
        asteroidList.forEach { it.dispose() }
        stationList.forEach { it.dispose() }
        fuelContainerList.forEach { it.dispose() }

        planetList.clear()
        obstacleList.clear()
        asteroidSpawnerList.clear()
        asteroidList.clear()
        stationList.clear()
        fuelContainerList.clear()
    }
}