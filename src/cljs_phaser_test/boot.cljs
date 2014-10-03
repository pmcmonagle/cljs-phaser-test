(ns cljs-phaser-test.boot)

(deftype ^:export boot [game]
  Object
  (preload [this]
    (.image this.load "preload" "assets/images/preload.gif"))
  (create  [this]
    (set! (.-scaleMode this.game.scale) js/Phaser.ScaleManager.SHOW_ALL)
    (set! (.-maxWidth  this.game.scale) 1200)
    (set! (.-maxHeight this.game.scale) 800)
    (set! (.-pageAlignHorizontally this.game.scale) true)
    (set! (.-pageAlignVertically   this.game.scale) true)
    (.setScreenSize this.game.scale true)
    (.start         this.game.state "preload")))
