# battlecruiser
Restoration and modern usage of vintage IBM M 122-key a.k.a. "battlecruiser" keyboards 

The goal of this project is to repurpose an old battlecruiser keyboard and reprogram it to serve the needs of developer running predominantly emacs on linux systems, exposed via Microsoft Remote Desktop.

Photos of the restoration are available at https://imgur.com/a/aTVRmuB



## Soarer's converter configuration

In file m122-emacs.sc, find my Soarer's configuration.

The goal of this configuration is for the keyboard to generate easily re-bindable emacs sequences that survive across Microsoft Remote Desktop and X-Windows servers. (For clarity, we call "extra function keys" the 10 pebble-stemmed keys to the left of the alphanumeric area. Soarer calls them EXTRA_F1 ... EXTRA_F10.)

I chose to generate sequences of two characters, where the first one is always Control-comma (^,), and the second is either a digit or a letter:

* I'm remapping the first extra function key to the Esc key
* I'm remapping the remaining 9 extra function keys 
  to "^, <digit>" for digit = {1, 2, 3, ..., 9}.
* I'm remapping function keys F13-F24 (i.e., the 12 keys above the traditional F1-F12 keys) 
  to "^, <letter>" for letter = {A, B, ..., L}

## Layouts

### Original layout
![Original layout](https://github.com/scarpazza/battlecruiser/blob/main/M122-original-layout.png)

### Emacs-friendly layout
![emacs layout with changes](https://github.com/scarpazza/battlecruiser/blob/main/M122-emacs-layout-changes.png)
  
  
## Emacs configuration
  
To follow.
