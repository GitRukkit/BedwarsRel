package io.github.bedwarsrel.BedwarsRel;

import lombok.Getter;

public enum MinecraftVersion {
  UNKNOWN("UNKNOWN", -1), v1_8_R1("v1_8_R1", 10801), v1_8_R2("v1_8_R2", 10802), v1_8_R3("v1_8_R3",
      10803), v1_9_R1("v1_9_R1", 10901), v1_9_R2("v1_9_R2",
          10902), v1_10_R1("v1_10_R1", 11001), v1_11_R1("v1_11_R1", 11101);

  @Getter
  private String name;

  @Getter
  private Integer version;

  private MinecraftVersion(String name, Integer version) {
    this.name = name;
    this.version = version;
  }

  public boolean olderThan(MinecraftVersion version) {
    return Main.getInstance().getCurrentVersion().version < version.version;
  }

  public boolean newerThan(MinecraftVersion version) {
    return Main.getInstance().getCurrentVersion().version >= version.version;
  }

  public boolean inRange(MinecraftVersion oldVersion, MinecraftVersion newVersion) {
    return newerThan(oldVersion) && olderThan(newVersion);
  }
}
