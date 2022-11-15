package fox.photon.tutorial;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;

public class TutorialMod implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {
    @Override
    public void onInitialize() {
        /* 共通初期化処理 */
    }

    @Override
    public void onInitializeClient() {
        /* クライアント用初期化処理 */
    }

    @Override
    public void onInitializeServer() {
        /* サーバー用初期化処理 */
    }
}