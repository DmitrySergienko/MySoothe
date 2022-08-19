package com.codelab.basiclayouts.data

import com.codelab.basiclayouts.R

class MockProjectsRepoImpl {

    val urbanPhoto = listOf(
        R.drawable.ic_012 to R.string.ab1_inversions,
        R.drawable.ic_001 to R.string.ab2_quick_yoga,
        R.drawable.ic_001 to R.string.ab3_stretching,
        R.drawable.ic_004 to R.string.ab4_tabata,
        R.drawable.ic_005 to R.string.ab5_hiit,
        R.drawable.ic_006 to R.string.ab6_pre_natal_yoga
    ).map { DrawableStringPair(it.first, it.second) }

    val favoriteCollectionsData = listOf(
        R.drawable.ic_007 to R.string.fc1_short_mantras,
        R.drawable.ic_009 to R.string.fc2_nature_meditations,
        R.drawable.ic_003 to R.string.fc3_stress_and_anxiety,
        R.drawable.ic_001 to R.string.fc4_self_massage,
        R.drawable.ic_003 to R.string.fc5_overwhelmed,
        R.drawable.ic_009 to R.string.fc6_nightly_wind_down,
        R.drawable.ic_001 to R.string.fc6_nightly_wind_down,
        R.drawable.ic_004 to R.string.fc6_nightly_wind_down,
        R.drawable.ic_004 to R.string.fc6_nightly_wind_down,
        R.drawable.ic_001 to R.string.fc6_nightly_wind_down,

        ).map { DrawableStringPair(it.first, it.second) }

    val urbanCollection = listOf(

        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,
        R.drawable.ic_011,

        )

}