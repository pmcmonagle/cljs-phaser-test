(ns cljs-phaser-test.core
  (:require [cljs-phaser-test.states :as states]))

(enable-console-print!)

(let [game (js/Phaser.Game. 800 600 js/Phaser.AUTO "")]
  (.state.add   game "boot" (states/boot.))
  (.state.start game "boot"))
