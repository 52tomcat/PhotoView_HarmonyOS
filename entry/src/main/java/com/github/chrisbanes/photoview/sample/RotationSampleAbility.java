package com.github.chrisbanes.photoview.sample;

import com.github.chrisbanes.photoview.sample.slice.RotationSampleAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class RotationSampleAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RotationSampleAbilitySlice.class.getName());
    }
}
