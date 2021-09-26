package me.develeo;

import java.util.Objects;

public class SecurityManager {
  public static void main(String[] args) {
    java.lang.SecurityManager sm = System.getSecurityManager();
    System.out.println(Objects.isNull(sm) ? "Security manager não encontrado" : sm);
  }
}
