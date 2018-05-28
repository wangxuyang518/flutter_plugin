import 'dart:async';

import 'package:flutter/services.dart';

class FlutterPlugin3 {
  static const MethodChannel _channel =
      const MethodChannel('flutter_plugin3');

  static   platformVersion()  {
    _channel.invokeMethod('getPlatformVersion');

  }
}
