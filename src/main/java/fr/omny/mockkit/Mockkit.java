package fr.omny.mockkit;

import org.bukkit.Bukkit;

public final class Mockkit {

  private static MockServer instance;

  public static MockServer server() { return instance; }

  public static void init() {
    MockServer mockServer = new MockServer();
    instance = mockServer;
    Bukkit.setServer(mockServer);
  }

  public static void stop() {}
}
