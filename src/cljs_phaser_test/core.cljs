(ns cljs-phaser-test.core
  (:require [cljs-phaser-test.boot    :as boot]
            [cljs-phaser-test.preload :as preload]
            [cljs-phaser-test.title   :as title]))

(enable-console-print!)

(let [game (js/Phaser.Game. 800 600 js/Phaser.AUTO "")]
  (. game (state.add   "boot"    (boot/boot.)))
  (. game (state.add   "preload" (preload/preload.)))
  (. game (state.add   "title"   (title/title.)))
  (. game (state.start "boot")))
