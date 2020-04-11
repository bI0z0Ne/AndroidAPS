package info.nightscout.androidaps.dependencyInjection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.service.RileyLinkBluetoothStateReceiver
import info.nightscout.androidaps.receivers.*

@Module
@Suppress("unused")
abstract class ReceiversModule {

    @ContributesAndroidInjector abstract fun contributesBTReceiver(): BTReceiver
    @ContributesAndroidInjector abstract fun contributesChargingStateReceiver(): ChargingStateReceiver
    @ContributesAndroidInjector abstract fun contributesDataReceiver(): DataReceiver
    @ContributesAndroidInjector abstract fun contributesKeepAliveReceiver(): KeepAliveReceiver
    @ContributesAndroidInjector abstract fun contributesNetworkChangeReceiver(): NetworkChangeReceiver
    @ContributesAndroidInjector abstract fun contributesRileyLinkBluetoothStateReceiver(): RileyLinkBluetoothStateReceiver
    @ContributesAndroidInjector abstract fun contributesTimeDateOrTZChangeReceiver(): TimeDateOrTZChangeReceiver
}