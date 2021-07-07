# battlecruiser
Restoration and modern usage of vintage IBM M 122-key a.k.a. "battlecruiser" keyboards 

The goal of this project is to repurpose an old battlecruiser keyboard and reprogram it to serve the needs of developer running predominantly emacs on linux systems, exposed via Microsoft Remote Desktop.

Photos of the restoration are available at https://imgur.com/a/aTVRmuB

Original layout: 
http://www.keyboard-layout-editor.com/#/gists/ad2d570092f5c731c3af9b3f5977aaec

## Soarer's converter configuration

In file m122-emacs.sc, find my Soarer's configuration.

The goal of this configuration is for the keyboard to generate easily re-bindable emacs sequences that survive across Microsoft Remote Desktop and X-Windows servers.

I chose to generate sequences of two characters, where the first one is always Control-comma (^,), and the second is either a digit or a letter:

* I'm remapping the "extra function keys" (10 grey keys to the left of the alphanumeric area) to "^, <digit>" for with digit = {1, 2, 3, ..., 9, 0}.
  Note that the last key, EXTRA_F10, generates sequence "^, 0".
* I'm remapping function keys F13-F24 (i.e., the 12 keys above the traditional F1-F12 keys) to "^, <letter>" for letter = {A, B, ..., L}

