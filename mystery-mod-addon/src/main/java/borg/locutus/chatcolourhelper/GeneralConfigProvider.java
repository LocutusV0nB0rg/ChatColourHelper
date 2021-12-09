package borg.locutus.chatcolourhelper;


import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.mysterymod.api.graphics.ResourceLocation;
import net.mysterymod.mod.addon.AddonSettingsProvider;
import net.mysterymod.mod.gui.settings.SettingsGui;
import net.mysterymod.mod.gui.settings.component.SettingsComponent;
import net.mysterymod.mod.gui.settings.component.SettingsComponentProvider;
import net.mysterymod.mod.gui.settings.component.input.BigTextFieldComponent;
import net.mysterymod.mod.gui.settings.component.slider.SlimSliderComponent;
import net.mysterymod.mod.gui.settings.component.text.TitleComponent;
import net.mysterymod.mod.gui.settings.component.toggle.ToggleComponent;

import java.util.List;

@RequiredArgsConstructor(onConstructor_ = @Inject)
public final class GeneralConfigProvider implements AddonSettingsProvider {
  private final GeneralConfig generalConfig;

  @Override
  public void addSettings(
    SettingsGui settingsGui,
    SettingsComponentProvider settingsComponentProvider,
    List<SettingsComponent> components) {

    components.add(
      new BigTextFieldComponent("Prefix",
        "",
        Integer.MAX_VALUE,
        generalConfig.getPrefix(),
        newString -> {
          generalConfig.setPrefix(newString);
          generalConfig.saveConfigAfterCooldown();
        }));
  }
}

