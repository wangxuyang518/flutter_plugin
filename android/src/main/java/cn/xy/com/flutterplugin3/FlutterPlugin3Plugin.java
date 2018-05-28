package cn.xy.com.flutterplugin3;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * FlutterPlugin3Plugin
 */
public class FlutterPlugin3Plugin implements MethodCallHandler {
  private static Context context;
  /**
   * Plugin registration.
   */
  public static void registerWith(Registrar registrar) {
    context=registrar.activeContext();
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "flutter_plugin3");
    channel.setMethodCallHandler(new FlutterPlugin3Plugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
      Log.d("4577155","onMethodCall");
    if (call.method.equals("getPlatformVersion")) {
        Log.d("4577155","method");
      Toast.makeText(context, "hello world", Toast.LENGTH_SHORT).show();
      //result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else {
      //result.notImplemented();
    }
  }
}
