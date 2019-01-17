(ns status-im.ui.screens.profile.user.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.ui.components.colors :as colors]
            [status-im.ui.screens.profile.components.styles :as profile.components.styles]
            [status-im.ui.components.styles :as components.styles]))

(def profile-entry-container
  {:flex-direction :row
   :flex 1
   :align-items :center
   :justify-content :space-between
   :padding-vertical 12})

(def profile-entry-icon
  {:width 40
   :height 40
   :border-radius 40
   :margin-left 16
   ;:margin-top 12
   :justify-content :center
   :align-items :center
   :background-color (colors/alpha colors/blue 0.1)})

(def profile-entry-arrow
  {;:width 24
   ;:height 24
   :margin-right 16})

(def profile-entry-text
  {:line-height 20
   :font-size 17
   :color colors/black
   :text-align-vertical :center})

(def profile-entry-subtext
  {:line-height 22
   :font-size 15
   :text-align-vertical :center
   :color colors/gray})

(def share-contact-code-container
  {:flex-direction  :row
   :justify-content :center
   :align-items     :center})

(def share-contact-code-button
  {:height 42})

(def qr-toolbar
  {:border-bottom-color colors/gray-light
   :border-bottom-width 1})

(def qr-code
  {:background-color colors/white})

(def qr-code-viewer
  {:flex-grow      1
   :flex-direction :column})

(def share-link-button
  {:margin-top    12
   :margin-bottom 16})

(defstyle my-profile-info-container
  {:background-color colors/white})

(defstyle my-profile-settings-logout-wrapper
  {:flex-direction  :row
   :justify-content :space-between
   :align-items     :center})

(defstyle my-profile-settings-logout
  {:min-width       "50%"})

(defstyle my-profile-settings-send-logs-wrapper
  {:flex-direction  :row
   :justify-content :space-between
   :align-items     :center})

(defstyle my-profile-settings-send-logs
  {:min-width       "50%"})

(def advanced-button
  {:margin-top    16
   :margin-bottom 12})

(def advanced-button-container
  {:align-items     :center
   :justify-content :center})

(def advanced-button-container-background
  {:padding-left     16
   :padding-right    12
   :padding-vertical 6
   :border-radius    18
   :background-color (colors/alpha colors/blue 0.1)})

(def advanced-button-row
  {:flex-direction :row
   :align-items    :center})

(def advanced-button-label
  {:font-size      15
   :letter-spacing -0.2
   :color          colors/blue})

(def pair-button
  {:margin-left 32})
