package com.quickbite.spaceslingshot.json

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.utils.Json
import com.quickbite.spaceslingshot.data.json.JsonLevelData

/**
 * Created by Paha on 8/31/2016.
 */

object JsonLevelLoader{
    val json:Json = Json()

    fun loadLevels(){
//        LevelManager.levels = json.fromJson(Array<JsonLevelData>::class.java, Gdx.files.internal("data/levels.json"))
//        LevelManager.levels = json.fromJson(Array<JsonLevelData>::class.java, JsonLevelData::class.java, Gdx.files.internal("data/levels.json"))
    }
}