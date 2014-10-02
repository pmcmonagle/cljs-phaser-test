(ns cljs-phaser-test.states)
(deftype ^:export boot [game]
  Object
  (create [this] (.log js/console this)))
