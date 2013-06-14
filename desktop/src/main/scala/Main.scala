package saml.libgdxpractice

import com.badlogic.gdx.backends.lwjgl._

object Main extends App {
    val cfg = new LwjglApplicationConfiguration()
    cfg.title = "PracticeGame"
    cfg.height = 480
    cfg.width = 320
    cfg.useGL20 = true
    cfg.forceExit = false
    new LwjglApplication(new GameMain(), cfg)
}
