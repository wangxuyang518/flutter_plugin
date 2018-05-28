import 'dart:async';

import 'package:flutter/services.dart';

class ToastPlugin {

  static const MethodChannel channel = const MethodChannel('toastPlugin');

  static  showToast(String s) {
    channel.invokeMethod('showToast');
  }
}
