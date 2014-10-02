(defproject cljs-phaser-test "0.1.0-SNAPSHOT"
  :description "Test project that combines JavaScripts Phaser.IO game framework with cross-compiled ClojureScript!"
  :url "//github.com/pmcmonagle/cljs-phaser-test"

  :dependencies [[org.clojure/clojure       "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]
            [lein-simpleton "1.3.0"]
            [lein-cooper    "0.0.1"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "cljs-phaser-test"
              :source-paths ["src"]
              :compiler {
                :output-to "cljs_phaser_test.js"
                :output-dir "out"
                :optimizations :none
                :externs ["externs/Phaser.js"
                          "externs/Pixi.js"]
                :source-map true}}]})
