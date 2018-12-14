(ns status-im.ui.screens.wallet.components.styles
  (:require-macros [status-im.utils.styles :refer [defnstyle defstyle]])
  (:require [status-im.ui.components.colors :as colors]
            [status-im.ui.components.styles :as styles]))

;; Components

(def cartouche-container
  {:flex              1
   :margin-top        16
   :margin-horizontal 16})

(def cartouche-header
  {:color colors/white})

(defn cartouche-content-wrapper [disabled?]
  (merge
   {:flex-direction :row
    :margin-top     8
    :border-radius  styles/border-radius
    :padding-left   14
    :padding-right  8}
   (if disabled?
     {:border-width 1
      :border-color colors/white-light-transparent}
     {:background-color colors/white-light-transparent})))

(def cartouche-icon-wrapper
  {:flex            1
   :flex-direction  :row
   :justify-content :space-between
   :align-items     :center})

(def text-content
  {:color colors/white})

(def text-secondary-content
  {:color colors/white-transparent})

(def text-list-primary-content
  {:margin-right 10
   :color        colors/black})

(def text-input
  (merge text-content
         {:font-size      15
          :flex           1
          :padding-bottom 0
          :padding-top    0
          :height         52
          :letter-spacing -0.2}))

(def network
  {:color          :white
   :font-size      13
   :letter-spacing -0.2})

(def network-container
  {:padding-horizontal 10
   :height             27
   :border-radius      100
   :border-width       1
   :border-color       colors/white-light-transparent
   :align-items        :center
   :justify-content    :center})

(def asset-content-container
  {:flex-direction  :row
   :align-items     :center
   :margin-vertical 11})

(def asset-icon
  {:background-color colors/gray-lighter
   :border-radius    50})

(def asset-text-content
  {:flex            1
   :flex-direction  :row
   :justify-content :space-between
   :align-items     :center
   :flex-wrap       :wrap
   :margin-left     10})

(def asset-label-content
  {:flex-direction :row
   :margin-right   10})

(def asset-label
  {:margin-right 10})

(defn participant [address?]
  {:color          (if address? :white colors/white-transparent)
   :flex-shrink    1
   :font-size      15
   :letter-spacing -0.2})

(def recipient-container
  {:flex-direction :row})

(def recipient-icon
  {:margin-top 11})

(def recipient-name
  {:flex              1
   :flex-direction    :column
   :margin-horizontal 12
   :margin-vertical   16})

(def recipient-address
  {:margin-vertical 17
   :color           colors/white})

(def recipient-no-address
  {:color colors/white-transparent})
