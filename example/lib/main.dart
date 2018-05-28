import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_plugin3/flutter_plugin3.dart';
import 'package:flutter_plugin3/toast_plugin.dart';
void main() => runApp(new MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => new _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _platformVersion = 'Unknown';

  @override
  initState() {
    super.initState();
    initPlatformState();
  }

  click()async{
    try {
      await  ToastPlugin.showToast("hello world");
    } on PlatformException {
     print( 'Failed to get platform version.');
    }
  }

  // Platform messages are asynchronous, so we initialize in an async method.
  initPlatformState() async  {
    String platformVersion;
    // Platform messages may fail, so we use a try/catch PlatformException.
    try {
      print("123");
        await FlutterPlugin3.platformVersion();
    } on PlatformException {
      platformVersion = 'Failed to get platform version.';
    }

    // If the widget was removed from the tree while the asynchronous platform
    // message was in flight, we want to discard the reply rather than calling
    // setState to update our non-existent appearance.
    if (!mounted)
      return;

    setState(() {
      _platformVersion = platformVersion;
    });
  }

  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      home: new Scaffold(
        appBar: new AppBar(
          title: new Text('Plugin example app'),
        ),
        body: new Center(
          child: RaisedButton(
            child: new Text('Running on: $_platformVersion\n'),
            onPressed:click ,
          ),
        ),
      ),
    );
  }
}
