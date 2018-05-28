package io.flutter.plugins;

import cn.xy.com.flutterplugin3.FlutterPlugin3Plugin;
import io.flutter.plugin.common.PluginRegistry;

/**
 * Generated file. Do not edit.
 */
public final class ToastPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterPlugin3Plugin.registerWith(registry.registrarFor("cn.xy.com.flutterplugin3.ToastPluginPugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = ToastPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
