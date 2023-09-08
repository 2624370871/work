package com.example.myapp;

import com.example.myapp.slice.ScenarioexampleSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Scenarioexample extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ScenarioexampleSlice.class.getName());
    }
}
