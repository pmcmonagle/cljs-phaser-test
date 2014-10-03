(ns cljs-phaser-test.preload)

(deftype ^:export preload [game]
  Object
  (preload [this]
    (let [graphic (. this (add.sprite 400 300 "preload"))]
      (. graphic (anchor.setTo 0.5 0.5))
      (. this (load.setPreloadSprite graphic))
      (. this (load.onLoadComplete.addOnce (fn []
                                             (. this (game.state.start "title")))))
      (. this (load.image "logo" "assets/images/logo.png")))))
