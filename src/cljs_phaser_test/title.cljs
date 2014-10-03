(ns cljs-phaser-test.title)

(deftype title [game]
  Object
  (create [this]
    (.log js/console "Creating Title")
    (let [logo (. this (add.sprite 400 300 "logo"))]
      (. logo (anchor.setTo 0.5 0.5)))))
