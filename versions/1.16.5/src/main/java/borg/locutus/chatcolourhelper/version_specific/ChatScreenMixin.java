package borg.locutus.chatcolourhelper.version_specific;

import borg.locutus.chatcolourhelper.ChatColourHelperAddon;
import com.google.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {
  @Shadow
  private String defaultInputFieldText;

  @Inject(method = "<init>*", at = @At("RETURN"))
  public void modifyOpenChatScreen(CallbackInfo ci) {
    this.defaultInputFieldText = ChatColourHelperAddon.getInstance().getGeneralConfig().getPrefix();
  }
}
