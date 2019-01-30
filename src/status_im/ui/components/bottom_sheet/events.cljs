(ns status-im.ui.components.bottom-sheet.events
  (:require
   [status-im.utils.fx :as fx]))

(fx/defn show-bottom-sheet
  [{:keys [db]} {:keys [view]}]
  {:db (update db assoc
               :bottom-sheet/show? true
               :bottom-sheet/view view)})

(fx/defn hide-bottom-sheet
  [{:keys [db]}]
  {:db (update db assoc
               :bottom-sheet/show? false
               :bottom-sheet/view nil)})
