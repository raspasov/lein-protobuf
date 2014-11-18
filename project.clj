(defproject lein-protobuf "0.4.2-LOCAL"
  :description "Leiningen plugin for compiling protocol buffers."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/flatland/protobuf"
  :dependencies [[fs "1.2.0"]
                 [conch "0.2.0"]
                 [leinjacker "0.4.2"]]
  :eval-in-leiningen true
  ;; Bug in the current 1.x branch of Leiningen causes
  ;; jar to implicitly clean no matter what, wiping stuff.
  ;; This prevents that.
  :disable-implicit-clean true
  :checksum-deps true)
