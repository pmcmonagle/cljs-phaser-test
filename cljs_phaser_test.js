goog.addDependency("base.js", ['goog'], []);
goog.addDependency("../cljs/core.js", ['cljs.core'], ['goog.string', 'goog.object', 'goog.string.StringBuffer', 'goog.array']);
goog.addDependency("../cljs_phaser_test/title.js", ['cljs_phaser_test.title'], ['cljs.core']);
goog.addDependency("../cljs_phaser_test/preload.js", ['cljs_phaser_test.preload'], ['cljs.core']);
goog.addDependency("../cljs_phaser_test/boot.js", ['cljs_phaser_test.boot'], ['cljs.core']);
goog.addDependency("../cljs_phaser_test/core.js", ['cljs_phaser_test.core'], ['cljs.core', 'cljs_phaser_test.boot', 'cljs_phaser_test.preload', 'cljs_phaser_test.title']);