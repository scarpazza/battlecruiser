# emacs battlecruiser

The goal of this project is the repurposing of vintage IBM M 122-key (a.k.a. "battlecruiser") keyboards for modern usage.

Specifically, I am posting configuration files that program a Soarer's converter to serve the needs of a developer running predominantly emacs on a target system (linux based, in this example), possibly via Microsoft Remote Desktop and an X-Windows server. 

The key mappings I use are chosen precisely to (1) be easily re-bindable from emacs and (2) survive Microsoft's rdesktop.


## Physical restoration

Photos of the restoration process are at https://imgur.com/a/aTVRmuB

I have worked so far on two M 122 specimens: disassembling them, removing all the keycaps and key stems, washing the plastic shells, cleaning keycaps and keys in an ultrasonic cleaner, and cleaning the board assembly by hand separately.

I ordered:
* extra (original) keycaps from [https://www.clickykeyboards.com/](ClickyKeyboards), who also carries a variety of vintage repair parts for the Model M keyboards in general,
* custom keycaps from [https://www.pckeyboard.com/page/category/Buttons](Unicomp), who make modern Model-M keyboards.

## Original layout
![Original layout](https://github.com/scarpazza/battlecruiser/blob/main/M122-original-layout.png)

## Soarer's converter configuration

Find my Soarer's adapter configuration in [https://github.com/scarpazza/battlecruiser/blob/main/m122-emacs.sc](m122-emacs.sc).

I'm remapping function keys F13-F24 and *extra function keys* (i.e., the ten, pebble-colored keys to the left of the alphanumeric area, corresponding to `sctool`'s identifiers `EXTRA_F1`, `EXTRA_F2`, ... `EXTRA_F10`). I remap them mostly to sequences of two characters: the first a Control-Comma (`^,`), and the second either a digit or a letter.

I remap:
* the first extra function key to the Esc key (Esc would otherwise be where NumLock is normally located)
* the remaining 9 extra function keys to `^,`,`<digit>` for digit = {1, 2, 3, ..., 9}.
* function keys `F13`-`F24` (i.e., the 12 keys above the traditional F1-F12 keys) to `^,`,`<letter>` for letter = {A, B, ..., L}

## Remapped layout

![emacs layout with changes](https://github.com/scarpazza/battlecruiser/blob/main/M122-emacs-layout-changes.png)
  
Key:
* in white are keys that have identical function in the original keyboard
* in green are keys whose function is changed by the Soarer's converter automatic keyboard identification, without explicit configuration remaps: for example,  the `Reset`, `Enter`, and `Field Exit` keys are remapped to `LeftControl`, `Right Control` and `Enter` by the converter.
* in red are keys whose function I altered explicitly via a remap block or a macro in my configuration file.
  
## Emacs configuration
To follow.
