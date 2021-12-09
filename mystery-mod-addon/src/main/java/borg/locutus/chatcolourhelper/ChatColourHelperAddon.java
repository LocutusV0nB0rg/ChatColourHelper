package borg.locutus.chatcolourhelper;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.mysterymod.mod.MysteryMod;
import net.mysterymod.mod.addon.Addon;

import java.util.logging.Logger;

@Singleton
@RequiredArgsConstructor(onConstructor_ = @Inject)
public class ChatColourHelperAddon extends Addon {
  @Getter
  private static ChatColourHelperAddon instance;

  @Getter
  private final GeneralConfig generalConfig;

  @Override
  public void onEnable() {
    instance = this;

    setSettingsProvider(MysteryMod.getInjector().getInstance(GeneralConfigProvider.class));
  }
}
