package yegor.cheprasov.xtravel.features.main

import kotlinx.serialization.Serializable
import yegor.cheprasov.xtravel.entities.CountryRemoteResponseShortEntity

@Serializable
data class MainResponseRemote(
    val trendingCountries: List<CountryRemoteResponseShortEntity>
)

