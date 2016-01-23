@ECHO OFF

ECHO MsgBox ("Hello World!") > msg.vbs
C:\WINDOWS\system32\cscript.exe msg.vbs > NUL
DEL msg.vbs
