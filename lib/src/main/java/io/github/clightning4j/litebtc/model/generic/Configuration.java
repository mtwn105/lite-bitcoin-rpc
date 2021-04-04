package io.github.clightning4j.litebtc.model.generic;

public class Configuration {

  private String user;
  private String pass;
  private String url;
  private String pathBitcoin;
  private String cookiePath;

  public Configuration(String user, String pass, String url) {
    this.user = user;
    this.pass = pass;
    this.url = url;
  }

  public Configuration(String cookiePath) {
    this.cookiePath = cookiePath;
    this.parseCookie();
  }

  private void parseCookie() {}

  // Getter and setter

  public String getUser() {
    return user;
  }

  public String getPass() {
    return pass;
  }

  public String getPathBitcoin() {
    return pathBitcoin;
  }

  public String getCookiePath() {
    return cookiePath;
  }

  public String getUrl() {
    return url;
  }
}