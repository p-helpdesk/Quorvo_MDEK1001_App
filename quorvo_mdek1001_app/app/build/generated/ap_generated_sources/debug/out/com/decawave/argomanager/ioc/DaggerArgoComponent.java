package com.decawave.argomanager.ioc;

import com.decawave.argo.api.DiscoveryApi;
import com.decawave.argomanager.ArgoApp;
import com.decawave.argomanager.ArgoApp_MembersInjector;
import com.decawave.argomanager.argoapi.ble.BleConnectionApi;
import com.decawave.argomanager.argoapi.ble.DiscoveryApiBleImpl;
import com.decawave.argomanager.argoapi.ble.DiscoveryApiBleImpl_Factory;
import com.decawave.argomanager.argoapi.ble.PeriodicBleScanner;
import com.decawave.argomanager.argoapi.ble.PeriodicBleScannerImpl;
import com.decawave.argomanager.argoapi.ble.PeriodicBleScannerImpl_Factory;
import com.decawave.argomanager.argoapi.ble.connection.BleConnectionApiImpl;
import com.decawave.argomanager.argoapi.ble.connection.BleConnectionApiImpl_Factory;
import com.decawave.argomanager.ble.BleAdapter;
import com.decawave.argomanager.ble.signal.SignalStrengthInterpreter;
import com.decawave.argomanager.ble.signal.SignalStrengthInterpreterImpl_Factory;
import com.decawave.argomanager.components.AutoPositioningManager;
import com.decawave.argomanager.components.DecodeContextManager;
import com.decawave.argomanager.components.DiscoveryManager;
import com.decawave.argomanager.components.ErrorManager;
import com.decawave.argomanager.components.LocationDataLogger;
import com.decawave.argomanager.components.NetworkModelManager;
import com.decawave.argomanager.components.NetworkNodeManager;
import com.decawave.argomanager.components.NetworksNodesStorage;
import com.decawave.argomanager.components.impl.AutoPositioningManagerImpl;
import com.decawave.argomanager.components.impl.AutoPositioningManagerImpl_Factory;
import com.decawave.argomanager.components.impl.BlePresenceApiImpl;
import com.decawave.argomanager.components.impl.BlePresenceApiImpl_Factory;
import com.decawave.argomanager.components.impl.DecodeContextManagerImpl_Factory;
import com.decawave.argomanager.components.impl.DiscoveryManagerImpl;
import com.decawave.argomanager.components.impl.DiscoveryManagerImpl_Factory;
import com.decawave.argomanager.components.impl.ErrorManagerImpl;
import com.decawave.argomanager.components.impl.ErrorManagerImpl_Factory;
import com.decawave.argomanager.components.impl.LocationDataLoggerImpl_Factory;
import com.decawave.argomanager.components.impl.LocationDataObserverImpl;
import com.decawave.argomanager.components.impl.LocationDataObserverImpl_Factory;
import com.decawave.argomanager.components.impl.NetworkModelManagerImpl_Factory;
import com.decawave.argomanager.components.impl.NetworkNodeManagerImpl;
import com.decawave.argomanager.components.impl.NetworkNodeManagerImpl_Factory;
import com.decawave.argomanager.components.impl.NetworksNodesStorageImpl_Factory;
import com.decawave.argomanager.components.impl.UniqueReorderingStack;
import com.decawave.argomanager.components.impl.UniqueReorderingStack_Factory;
import com.decawave.argomanager.debuglog.ApplicationComponentLog;
import com.decawave.argomanager.debuglog.ApplicationComponentLog_MembersInjector;
import com.decawave.argomanager.debuglog.LogBlockStatus;
import com.decawave.argomanager.debuglog.LogBlockStatusImpl_Factory;
import com.decawave.argomanager.debuglog.LogEntryCollector;
import com.decawave.argomanager.debuglog.LogEntryCollectorImpl;
import com.decawave.argomanager.debuglog.LogEntryCollectorImpl_Factory;
import com.decawave.argomanager.error.ui.MainActivity;
import com.decawave.argomanager.error.ui.MainActivity_MembersInjector;
import com.decawave.argomanager.error.ui.dialog.NetworkPickerDialogFragment;
import com.decawave.argomanager.error.ui.dialog.NetworkPickerDialogFragment_MembersInjector;
import com.decawave.argomanager.error.ui.dialog.RenameNetworkDialogFragment;
import com.decawave.argomanager.error.ui.dialog.RenameNetworkDialogFragment_MembersInjector;
import com.decawave.argomanager.error.ui.dialog.TurnOnLocationServiceDialogFragment;
import com.decawave.argomanager.error.ui.dialog.TurnOnLocationServiceDialogFragment_MembersInjector;
import com.decawave.argomanager.error.ui.dialog.ZaxisValueDialogFragment;
import com.decawave.argomanager.error.ui.fragment.AbstractArgoFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.ApPreviewFragment;
import com.decawave.argomanager.error.ui.fragment.ApPreviewFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment;
import com.decawave.argomanager.error.ui.fragment.AutoPositioningFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.DebugLogBufferFragment;
import com.decawave.argomanager.error.ui.fragment.DeviceDebugConsoleFragment;
import com.decawave.argomanager.error.ui.fragment.DeviceDebugConsoleFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.DeviceErrorFragment;
import com.decawave.argomanager.error.ui.fragment.DeviceErrorFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.DiscoveryFragment;
import com.decawave.argomanager.error.ui.fragment.DiscoveryFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.DiscoveryProgressAwareFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.FirmwareUpdateFragment;
import com.decawave.argomanager.error.ui.fragment.FirmwareUpdateFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.GridFragment;
import com.decawave.argomanager.error.ui.fragment.InstructionsFragment;
import com.decawave.argomanager.error.ui.fragment.InstructionsFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.LogBufferFragment;
import com.decawave.argomanager.error.ui.fragment.LogBufferFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.MainScreenFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.NodeDetailFragment;
import com.decawave.argomanager.error.ui.fragment.NodeDetailFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.OverviewFragment;
import com.decawave.argomanager.error.ui.fragment.OverviewFragment_MembersInjector;
import com.decawave.argomanager.error.ui.fragment.SettingsFragment;
import com.decawave.argomanager.error.ui.fragment.SettingsFragment_MembersInjector;
import com.decawave.argomanager.prefs.AppPreferenceAccessorImpl;
import com.decawave.argomanager.prefs.AppPreferenceAccessorImpl_Factory;
import com.decawave.argomanager.util.AndroidPermissionHelper;
import com.decawave.argomanager.util.AndroidPermissionHelperImpl;
import com.decawave.argomanager.util.AndroidPermissionHelperImpl_Factory;
import com.decawave.argomanager.util.NetworkNodePropertyDecorator;
import com.decawave.argomanager.util.NetworkNodePropertyDecoratorImpl;
import com.decawave.argomanager.util.NetworkNodePropertyDecoratorImpl_Factory;
import com.decawave.argomanager.util.gatt.GattDecoderCache;
import com.decawave.argomanager.util.gatt.GattDecoderCache_Factory;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerArgoComponent {
  private DaggerArgoComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ArgoComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private ArgoDependencyProvider argoDependencyProvider;

    private Builder() {
    }

    public Builder argoDependencyProvider(ArgoDependencyProvider argoDependencyProvider) {
      this.argoDependencyProvider = Preconditions.checkNotNull(argoDependencyProvider);
      return this;
    }

    public ArgoComponent build() {
      if (argoDependencyProvider == null) {
        this.argoDependencyProvider = new ArgoDependencyProvider();
      }
      return new ArgoComponentImpl(argoDependencyProvider);
    }
  }

  private static final class ArgoComponentImpl implements ArgoComponent {
    private final ArgoComponentImpl argoComponentImpl = this;

    private Provider<BleAdapter> provideAdapterProvider;

    private Provider<PeriodicBleScannerImpl> periodicBleScannerImplProvider;

    private Provider<PeriodicBleScanner> providedBleScannerProvider;

    private Provider<NetworkModelManager> provideNetworkModelRepositoryProvider;

    private Provider<AppPreferenceAccessorImpl> appPreferenceAccessorImplProvider;

    private Provider<LocationDataLogger> provideLocationDataLoggerProvider;

    private Provider<NetworksNodesStorage> provideNetworkModelStorageProvider;

    private Provider<NetworkNodeManagerImpl> networkNodeManagerImplProvider;

    private Provider<NetworkNodeManager> provideNetworkModelManagerProvider;

    private Provider<LogBlockStatus> provideLogEntryCollectorBlockStatusProvider;

    private Provider<DecodeContextManager> providedDecodeContextManagerProvider;

    private Provider<GattDecoderCache> gattDecoderCacheProvider;

    private Provider<BleConnectionApiImpl> bleConnectionApiImplProvider;

    private Provider<BleConnectionApi> provideBleConnectionApiProvider;

    private Provider<DiscoveryApiBleImpl> discoveryApiBleImplProvider;

    private Provider<DiscoveryApi> provideDiscoveryApiProvider;

    private Provider<BlePresenceApiImpl> blePresenceApiImplProvider;

    private Provider<ErrorManagerImpl> errorManagerImplProvider;

    private Provider<ErrorManager> provideErrorManagerProvider;

    private Provider<LogEntryCollectorImpl> logEntryCollectorImplProvider;

    private Provider<LogEntryCollector> provideLogEntryCollectorProvider;

    private Provider<DiscoveryManagerImpl> discoveryManagerImplProvider;

    private Provider<DiscoveryManager> provideDiscoveryManagerProvider;

    private Provider<AndroidPermissionHelperImpl> androidPermissionHelperImplProvider;

    private Provider<AndroidPermissionHelper> provideAndroidPermissionHelperProvider;

    private Provider<SignalStrengthInterpreter> provideSignalStrengthInterpreterProvider;

    private Provider<NetworkNodePropertyDecoratorImpl> networkNodePropertyDecoratorImplProvider;

    private Provider<NetworkNodePropertyDecorator> providePropertyDecoratorProvider;

    private Provider<AutoPositioningManagerImpl> autoPositioningManagerImplProvider;

    private Provider<AutoPositioningManager> provideAutoPositioningManagerProvider;

    private Provider<LocationDataObserverImpl> locationDataObserverImplProvider;

    private ArgoComponentImpl(ArgoDependencyProvider argoDependencyProviderParam) {

      initialize(argoDependencyProviderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ArgoDependencyProvider argoDependencyProviderParam) {
      this.provideAdapterProvider = DoubleCheck.provider(ArgoDependencyProvider_ProvideAdapterFactory.create(argoDependencyProviderParam));
      this.periodicBleScannerImplProvider = PeriodicBleScannerImpl_Factory.create(provideAdapterProvider);
      this.providedBleScannerProvider = DoubleCheck.provider((Provider) periodicBleScannerImplProvider);
      this.provideNetworkModelRepositoryProvider = DoubleCheck.provider((Provider) NetworkModelManagerImpl_Factory.create());
      this.appPreferenceAccessorImplProvider = DoubleCheck.provider(AppPreferenceAccessorImpl_Factory.create());
      this.provideLocationDataLoggerProvider = DoubleCheck.provider((Provider) LocationDataLoggerImpl_Factory.create());
      this.provideNetworkModelStorageProvider = DoubleCheck.provider((Provider) NetworksNodesStorageImpl_Factory.create());
      this.networkNodeManagerImplProvider = NetworkNodeManagerImpl_Factory.create(provideNetworkModelRepositoryProvider, ((Provider) appPreferenceAccessorImplProvider), provideLocationDataLoggerProvider, provideNetworkModelStorageProvider, UniqueReorderingStack_Factory.<Short>create());
      this.provideNetworkModelManagerProvider = DoubleCheck.provider((Provider) networkNodeManagerImplProvider);
      this.provideLogEntryCollectorBlockStatusProvider = DoubleCheck.provider((Provider) LogBlockStatusImpl_Factory.create());
      this.providedDecodeContextManagerProvider = DoubleCheck.provider((Provider) DecodeContextManagerImpl_Factory.create());
      this.gattDecoderCacheProvider = GattDecoderCache_Factory.create(providedDecodeContextManagerProvider);
      this.bleConnectionApiImplProvider = BleConnectionApiImpl_Factory.create(provideAdapterProvider, provideNetworkModelManagerProvider, provideLogEntryCollectorBlockStatusProvider, provideLocationDataLoggerProvider, gattDecoderCacheProvider);
      this.provideBleConnectionApiProvider = DoubleCheck.provider((Provider) bleConnectionApiImplProvider);
      this.discoveryApiBleImplProvider = DiscoveryApiBleImpl_Factory.create(providedBleScannerProvider, provideBleConnectionApiProvider, gattDecoderCacheProvider);
      this.provideDiscoveryApiProvider = DoubleCheck.provider((Provider) discoveryApiBleImplProvider);
      this.blePresenceApiImplProvider = DoubleCheck.provider(BlePresenceApiImpl_Factory.create(provideDiscoveryApiProvider, provideNetworkModelManagerProvider, provideBleConnectionApiProvider));
      this.errorManagerImplProvider = ErrorManagerImpl_Factory.create(provideBleConnectionApiProvider, ((Provider) appPreferenceAccessorImplProvider));
      this.provideErrorManagerProvider = DoubleCheck.provider((Provider) errorManagerImplProvider);
      this.logEntryCollectorImplProvider = LogEntryCollectorImpl_Factory.create(provideErrorManagerProvider, provideLogEntryCollectorBlockStatusProvider);
      this.provideLogEntryCollectorProvider = DoubleCheck.provider((Provider) logEntryCollectorImplProvider);
      this.discoveryManagerImplProvider = DiscoveryManagerImpl_Factory.create(provideDiscoveryApiProvider, provideNetworkModelManagerProvider, ((Provider) blePresenceApiImplProvider));
      this.provideDiscoveryManagerProvider = DoubleCheck.provider((Provider) discoveryManagerImplProvider);
      this.androidPermissionHelperImplProvider = AndroidPermissionHelperImpl_Factory.create(provideAdapterProvider);
      this.provideAndroidPermissionHelperProvider = DoubleCheck.provider((Provider) androidPermissionHelperImplProvider);
      this.provideSignalStrengthInterpreterProvider = DoubleCheck.provider((Provider) SignalStrengthInterpreterImpl_Factory.create());
      this.networkNodePropertyDecoratorImplProvider = NetworkNodePropertyDecoratorImpl_Factory.create(((Provider) appPreferenceAccessorImplProvider));
      this.providePropertyDecoratorProvider = DoubleCheck.provider((Provider) networkNodePropertyDecoratorImplProvider);
      this.autoPositioningManagerImplProvider = AutoPositioningManagerImpl_Factory.create(provideBleConnectionApiProvider, provideNetworkModelManagerProvider);
      this.provideAutoPositioningManagerProvider = DoubleCheck.provider((Provider) autoPositioningManagerImplProvider);
      this.locationDataObserverImplProvider = DoubleCheck.provider(LocationDataObserverImpl_Factory.create(provideBleConnectionApiProvider, provideDiscoveryManagerProvider, provideNetworkModelManagerProvider, ((Provider) blePresenceApiImplProvider), ((Provider) appPreferenceAccessorImplProvider)));
    }

    @Override
    public void inject(ArgoApp argoApp) {
      injectArgoApp(argoApp);
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    @Override
    public void inject(DiscoveryFragment fragment) {
      injectDiscoveryFragment(fragment);
    }

    @Override
    public void inject(NodeDetailFragment fragment) {
      injectNodeDetailFragment(fragment);
    }

    @Override
    public void inject(DebugLogBufferFragment fragment) {
      injectDebugLogBufferFragment(fragment);
    }

    @Override
    public void inject(GridFragment fragment) {
      injectGridFragment(fragment);
    }

    @Override
    public void inject(OverviewFragment fragment) {
      injectOverviewFragment(fragment);
    }

    @Override
    public void inject(NetworkPickerDialogFragment networkPickerDialogFragment) {
      injectNetworkPickerDialogFragment(networkPickerDialogFragment);
    }

    @Override
    public void inject(RenameNetworkDialogFragment renameNetworkDialogFragment) {
      injectRenameNetworkDialogFragment(renameNetworkDialogFragment);
    }

    @Override
    public void inject(DeviceErrorFragment deviceErrorFragment) {
      injectDeviceErrorFragment(deviceErrorFragment);
    }

    @Override
    public void inject(TurnOnLocationServiceDialogFragment fragment) {
      injectTurnOnLocationServiceDialogFragment(fragment);
    }

    @Override
    public void inject(LogBufferFragment logBufferFragment) {
      injectLogBufferFragment(logBufferFragment);
    }

    @Override
    public void inject(DeviceDebugConsoleFragment deviceDebugConsoleFragment) {
      injectDeviceDebugConsoleFragment(deviceDebugConsoleFragment);
    }

    @Override
    public void inject(ApplicationComponentLog applicationComponentLog) {
      injectApplicationComponentLog(applicationComponentLog);
    }

    @Override
    public void inject(FirmwareUpdateFragment firmwareUpdateFragment) {
      injectFirmwareUpdateFragment(firmwareUpdateFragment);
    }

    @Override
    public void inject(AutoPositioningFragment autoPositioningFragment) {
      injectAutoPositioningFragment(autoPositioningFragment);
    }

    @Override
    public void inject(SettingsFragment settingsFragment) {
      injectSettingsFragment(settingsFragment);
    }

    @Override
    public void inject(ZaxisValueDialogFragment zaxisValueDialogFragment) {
    }

    @Override
    public void inject(ApPreviewFragment apPreviewFragment) {
      injectApPreviewFragment(apPreviewFragment);
    }

    @Override
    public void inject(InstructionsFragment instructionsFragment) {
      injectInstructionsFragment(instructionsFragment);
    }

    @Override
    public UniqueReorderingStack<Short> getActiveNetworkIdStack() {
      return new UniqueReorderingStack<Short>();
    }

    @Override
    public BleConnectionApi getBleConnectionApi() {
      return provideBleConnectionApiProvider.get();
    }

    @Override
    public DiscoveryManager getDiscoveryManager() {
      return provideDiscoveryManagerProvider.get();
    }

    @Override
    public AndroidPermissionHelper getPermissionHelper() {
      return provideAndroidPermissionHelperProvider.get();
    }

    @Override
    public AutoPositioningManager getAutoPositioningManager() {
      return provideAutoPositioningManagerProvider.get();
    }

    @Override
    public NetworkNodeManager getNetworkNodeManager() {
      return provideNetworkModelManagerProvider.get();
    }

    @Override
    public GattDecoderCache getGattDecoderCache() {
      return new GattDecoderCache(providedDecodeContextManagerProvider.get());
    }

    @CanIgnoreReturnValue
    private ArgoApp injectArgoApp(ArgoApp instance) {
      ArgoApp_MembersInjector.injectBlePresenceApi(instance, blePresenceApiImplProvider.get());
      ArgoApp_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      ArgoApp_MembersInjector.injectLogEntryCollector(instance, provideLogEntryCollectorProvider.get());
      ArgoApp_MembersInjector.injectActiveNetworkStack(instance, new UniqueReorderingStack<Short>());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      MainActivity_MembersInjector.injectDiscoveryManager(instance, provideDiscoveryManagerProvider.get());
      MainActivity_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      MainActivity_MembersInjector.injectPermissionHelper(instance, provideAndroidPermissionHelperProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private DiscoveryFragment injectDiscoveryFragment(DiscoveryFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, provideDiscoveryApiProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryFragment_MembersInjector.injectDiscoveryManager(instance, provideDiscoveryManagerProvider.get());
      DiscoveryFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      DiscoveryFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryFragment_MembersInjector.injectPermissionHelper(instance, provideAndroidPermissionHelperProvider.get());
      DiscoveryFragment_MembersInjector.injectBleConnectionApi(instance, provideBleConnectionApiProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private NodeDetailFragment injectNodeDetailFragment(NodeDetailFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      NodeDetailFragment_MembersInjector.injectDiscoveryManager(instance, provideDiscoveryManagerProvider.get());
      NodeDetailFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      NodeDetailFragment_MembersInjector.injectBleConnectionApi(instance, provideBleConnectionApiProvider.get());
      NodeDetailFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private DebugLogBufferFragment injectDebugLogBufferFragment(DebugLogBufferFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      LogBufferFragment_MembersInjector.injectLogEntryCollector(instance, provideLogEntryCollectorProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private GridFragment injectGridFragment(GridFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, provideDiscoveryApiProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      MainScreenFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OverviewFragment injectOverviewFragment(OverviewFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, provideDiscoveryApiProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      MainScreenFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      OverviewFragment_MembersInjector.injectDiscoveryManager(instance, provideDiscoveryManagerProvider.get());
      OverviewFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      OverviewFragment_MembersInjector.injectSignalStrengthInterpreter(instance, provideSignalStrengthInterpreterProvider.get());
      OverviewFragment_MembersInjector.injectPropertyDecorator(instance, providePropertyDecoratorProvider.get());
      OverviewFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      OverviewFragment_MembersInjector.injectPermissionHelper(instance, provideAndroidPermissionHelperProvider.get());
      OverviewFragment_MembersInjector.injectPresenceApi(instance, blePresenceApiImplProvider.get());
      OverviewFragment_MembersInjector.injectBleConnectionApi(instance, provideBleConnectionApiProvider.get());
      OverviewFragment_MembersInjector.injectAutoPositioningManager(instance, provideAutoPositioningManagerProvider.get());
      OverviewFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      OverviewFragment_MembersInjector.injectLocationDataObserver(instance, locationDataObserverImplProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private NetworkPickerDialogFragment injectNetworkPickerDialogFragment(
        NetworkPickerDialogFragment instance) {
      NetworkPickerDialogFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RenameNetworkDialogFragment injectRenameNetworkDialogFragment(
        RenameNetworkDialogFragment instance) {
      RenameNetworkDialogFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private DeviceErrorFragment injectDeviceErrorFragment(DeviceErrorFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DeviceErrorFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      DeviceErrorFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      DeviceErrorFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private TurnOnLocationServiceDialogFragment injectTurnOnLocationServiceDialogFragment(
        TurnOnLocationServiceDialogFragment instance) {
      TurnOnLocationServiceDialogFragment_MembersInjector.injectPermissionHelper(instance, provideAndroidPermissionHelperProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LogBufferFragment injectLogBufferFragment(LogBufferFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      LogBufferFragment_MembersInjector.injectLogEntryCollector(instance, provideLogEntryCollectorProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private DeviceDebugConsoleFragment injectDeviceDebugConsoleFragment(
        DeviceDebugConsoleFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      LogBufferFragment_MembersInjector.injectLogEntryCollector(instance, provideLogEntryCollectorProvider.get());
      DeviceDebugConsoleFragment_MembersInjector.injectBleConnectionApi(instance, provideBleConnectionApiProvider.get());
      DeviceDebugConsoleFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      DeviceDebugConsoleFragment_MembersInjector.injectDiscoveryManager(instance, provideDiscoveryManagerProvider.get());
      DeviceDebugConsoleFragment_MembersInjector.injectLocationDataLogger(instance, provideLocationDataLoggerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ApplicationComponentLog injectApplicationComponentLog(
        ApplicationComponentLog instance) {
      ApplicationComponentLog_MembersInjector.injectLogCollector(instance, provideLogEntryCollectorProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private FirmwareUpdateFragment injectFirmwareUpdateFragment(FirmwareUpdateFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, provideDiscoveryApiProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      FirmwareUpdateFragment_MembersInjector.injectDiscoveryManager(instance, provideDiscoveryManagerProvider.get());
      FirmwareUpdateFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      FirmwareUpdateFragment_MembersInjector.injectPermissionHelper(instance, provideAndroidPermissionHelperProvider.get());
      FirmwareUpdateFragment_MembersInjector.injectPresenceApi(instance, blePresenceApiImplProvider.get());
      FirmwareUpdateFragment_MembersInjector.injectPropertyDecorator(instance, providePropertyDecoratorProvider.get());
      FirmwareUpdateFragment_MembersInjector.injectBleConnectionApi(instance, provideBleConnectionApiProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AutoPositioningFragment injectAutoPositioningFragment(
        AutoPositioningFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectDiscoveryApi(instance, provideDiscoveryApiProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectErrorManager(instance, provideErrorManagerProvider.get());
      DiscoveryProgressAwareFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      AutoPositioningFragment_MembersInjector.injectAutoPositioningManager(instance, provideAutoPositioningManagerProvider.get());
      AutoPositioningFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      AutoPositioningFragment_MembersInjector.injectPermissionHelper(instance, provideAndroidPermissionHelperProvider.get());
      AutoPositioningFragment_MembersInjector.injectBleConnectionApi(instance, provideBleConnectionApiProvider.get());
      AutoPositioningFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SettingsFragment injectSettingsFragment(SettingsFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      SettingsFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ApPreviewFragment injectApPreviewFragment(ApPreviewFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      ApPreviewFragment_MembersInjector.injectNetworkNodeManager(instance, provideNetworkModelManagerProvider.get());
      ApPreviewFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      ApPreviewFragment_MembersInjector.injectAutoPositioningManager(instance, provideAutoPositioningManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private InstructionsFragment injectInstructionsFragment(InstructionsFragment instance) {
      AbstractArgoFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      InstructionsFragment_MembersInjector.injectAppPreferenceAccessor(instance, appPreferenceAccessorImplProvider.get());
      return instance;
    }
  }
}
