(ns status-im.ui.screens.mobile-network-settings.style
  (:require-macros [status-im.utils.styles :as styles])
  (:require [status-im.ui.components.colors :as colors]
            [status-im.ui.components.styles :as common-styles]))

(def container
  {:flex        1
   :align-items :center})

(def title
  {:height     21
   :margin-top 8})

(def title-text
  (merge
   common-styles/text-title-bold
   {:color colors/black}))

(def details
  {:height        66
   :width         311
   :margin-left   32
   :margin-right  32
   :margin-top    6
   :margin-bottom 10})

(def details-text
  (merge
   common-styles/text-main
   {:color       colors/gray
    :text-align  :center
    :line-height 22}))

(def option-item
  {:height         64
   :align-self     :stretch
   :flex-direction :row})

(def icon-container
  {:width           72
   :justify-content :center
   :align-items     :center})

(defn icon [color background-color size]
  {:width           size
   :height          size
   :color           color
   :container-style {:width            40
                     :height           40
                     :border-radius    20
                     :background-color background-color
                     :justify-content  :center
                     :align-items      :center}})

(def network-icon
  (icon colors/blue colors/blue-light 30))

(def cancel-icon
  (icon colors/red colors/red-light 25))

(def item
  {:flex           1
   :padding-top    8
   :padding-bottom 8})

(def item-text
  {:height          18
   :justify-content :center
   :margin-top      3
   :margin-bottom   3})

(defn item-title [color]
  (merge common-styles/text-main-medium
         {:color (case color
                   :blue colors/blue
                   :red colors/red)}))

(def item-details
  (merge common-styles/text-main
         {:color colors/gray}))

(def separator
  {:background-color colors/gray-lighter
   :margin-left      72
   :align-self       :stretch
   :height           1
   :margin-top       8})

(def checkbox-line-container
  {:margin-left    71
   :margin-top     13
   :height         29
   :flex-direction :row})

(def checkbox
  {:padding         0
   :justify-content :center
   :align-items     :center
   :width           18
   :height          18
   :border-radius   2
   :margin-top      6})

(def checkbox-icon
  {:tint-color colors/white})

(def checkbox-text-container
  {:height      22
   :flex        1
   :margin-left 13
   :margin-top  4})

(def checkbox-text
  (merge
   common-styles/text-main
   {:color       colors/black
    :line-height 22}))

(def settings-container
  {:margin-left 69
   :height      44
   :margin-top  6
   :align-items :flex-start})

(def settings-text
  (merge
   common-styles/text-main
   {:color       colors/gray
    :line-height 22}))

(def settings-link
  (merge
   common-styles/text-main
   {:color       colors/blue
    :line-height 22}))
