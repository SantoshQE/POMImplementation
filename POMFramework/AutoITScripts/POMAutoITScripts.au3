ControlFocus("Open","","Edit1")
sleep(1000)
ControlSetText("Open","","Edit1","C:\Users\Santosh\Downloads\CasteCertifcate.jpg")
sleep(1000)
ControlFocus("Open","&Open","Button1")
; Wait 10 seconds for the Notepad window to appear.
Local $hWnd = WinWait("[CLASS:Button]", "", 10)
; Send a mouse click to the edit control of Notepad using the handle returned by WinWait.
ControlFocus("Open","&Open","Button1")
ControlClick($hWnd, "&Open", "Button1")
Send("{ENTER}")
