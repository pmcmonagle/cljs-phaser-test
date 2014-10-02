cljs-phaser-test
================

Decided to try writing a JS game powered by Phaser.IO using ClojureScript.

It uses the leiningen plugin 'cooper' to combine a couple of leiningen tasks into one.
The command `lein cooper` will run both of the following:
* `lein cljsbuild auto`
* `lein simpleton 8888`
