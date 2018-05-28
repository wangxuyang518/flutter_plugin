package cn.xy.com.flutterplugin3;

import android.content.Context;
import android.widget.Toast;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.FlutterView;

public class ToastPluginPugin implements MethodChannel.MethodCallHandler {

    private static Context context;

    public  static  void registerWith(PluginRegistry.Registrar registrar, FlutterView flutterView) {

        context=  registrar.activeContext();
        MethodChannel channel = new MethodChannel(registrar.messenger(), "toastPlugin");
        channel.setMethodCallHandler(new ToastPluginPugin());
    }

    @Override
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("showToast")){
            Toast.makeText(context, "111", Toast.LENGTH_SHORT).show();
        }
    }
}
