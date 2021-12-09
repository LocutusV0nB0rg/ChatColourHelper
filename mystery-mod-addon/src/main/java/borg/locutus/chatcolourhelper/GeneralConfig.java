package borg.locutus.chatcolourhelper;

import com.google.inject.Singleton;
import lombok.Getter;
import lombok.Setter;
import net.mysterymod.mod.MysteryMod;
import net.mysterymod.mod.config.GsonConfig;

import java.io.File;


@Singleton
@Getter
@Setter
public final class GeneralConfig extends GsonConfig {
  private String prefix = "";

  public GeneralConfig() {
    super(new File("MysteryMod/configs/" + MysteryMod.getInstance().getMinecraftVersion().getVersionName() + "/chatcolourhelper.json"));
    this.initialize();
  }
}
