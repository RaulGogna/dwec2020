package com.arturober.ionic.capacitor;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;

import java.util.ArrayList;

import com.servicesight.capacitor.startnavigation.StartNavigationPlugin;
import com.codetrixstudio.capacitor.GoogleAuth.GoogleAuth;
import com.getcapacitor.community.facebooklogin.FacebookLogin;
import com.getcapacitor.community.database.sqlite.CapacitorSQLite;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Initializes the Bridge
    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      // Ex: add( TotallyAwesomePlugin.class);
      add(StartNavigationPlugin.class);
      add(GoogleAuth.class);
      add(FacebookLogin.class);
      add(CapacitorSQLite.class);
    }});
  }
}
