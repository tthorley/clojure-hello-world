; so I don't have to use javax.swing.JFoo everywhere
(import '(javax.swing JFrame JLabel))
; create a JFrame
(def frame (JFrame. "Hello"))
; create a JLabel
(def label (JLabel. "Hello, World!"))
; add the label to the frame
(.. frame (getContentPane) (add label))
; show it
(.setVisible frame true)