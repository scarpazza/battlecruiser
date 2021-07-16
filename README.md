# emacs battlecruiser

## Goal
Goal of this project is the repurposing of vintage IBM M 122-key (a.k.a. "battlecruiser") keyboards for modern usage.

Specifically, I configure the keyboard for use with emacs on a remote system. I configure the extra keys to generate sequences 
* that are easy bindable to emacs functions without conflicting with existing default key bindings, and
* survive across Microsoft Remote Desktop and an X-Windows connections (tested).

While my specific choices aim at satisfying developers running predominantly emacs, either on a local or a remote system (connected via rdesktop, an X windows session, or both), you might be able to adapt this project easily to slightly different needs.

## Deliverables

The M-122 keyboard (Part No. 1395660) uses an RJ45 connector and needs an adapter (Soarer's converter) to be used in contemporary PCs.
Soarer's converters are inexpensive and easily available on eBay and.

I am posting: 
* a Soarer's converter configuration file that remaps the keyboard to convenient keystroke sequences 
  ([m122-emacs.sc](https://github.com/scarpazza/battlecruiser/blob/main/m122-emacs.sc)) and
* emacs startup file that illustrates how to binds those sequences as desired. 

The key mappings I chose are chosen precisely to (1) be easily re-bindable from emacs and (2) survive Microsoft's rdesktop.
Specifically, recent versions of Microsoft Remote Desktop no longer relay function keys F13-F24 to the remote system.


## Physical restoration

New-old-stock M122 keyboards seem no longer available and if they were, their price would probably be prohibitive.
Used M122 keyboards are available at affordable prices, especially if untested or needing restoration otherwise.

I have worked so far on two M122 specimens: disassembling them, removing all the keycaps and key stems, washing the plastic shells, cleaning keycaps and keys in an ultrasonic cleaner, and cleaning the board assembly by hand separately.

Photos of the restoration process are at https://imgur.com/a/aTVRmuB

You may want to order keycaps and parts:
* extra (original) keycaps from [ClickyKeyboards](https://www.clickykeyboards.com/), who also carries a variety of vintage repair parts for the Model M keyboards in general,
* custom keycaps from [Unicomp](https://www.pckeyboard.com/page/category/Buttons), who make modern Model-M keyboards.

## Original layout
The original key layout reflects the keyboard's original purpose as an IBM terminal keyboard.
Notice the position of the `Enter`, `Field Exit`, `Field +` keys.
![Original layout](https://github.com/scarpazza/battlecruiser/blob/main/M122-original-layout.png)

## Soarer's converter configuration

Find my Soarer's adapter configuration in [m122-emacs.sc](https://github.com/scarpazza/battlecruiser/blob/main/m122-emacs.sc).

I'm remapping function keys F13-F24 and the *extra function keys* (i.e., the ten, pebble-colored keys to the left of the alphanumeric area, corresponding to `sctool`'s identifiers `EXTRA_F1`, `EXTRA_F2`, ... `EXTRA_F10`). I remap them mostly to sequences of two characters: the first a Control-Comma (`^,`), and the second either a digit or a letter.

I remap:
* the first extra function key to the `Esc` key (without explicit remapping, Esc would be where NumLock is normally located in PC keyboards)
* the last extra function key to the `Hyper` or `Windows` key 
* the remaining 8 extra function keys to `^,`,`<digit>` for digit = {1, 2, 3, ..., 8}.
* function keys `F13`-`F24` (i.e., the 12 keys above the traditional F1-F12 keys) to `^,`,`<letter>` for letter = {A, B, ..., L}
* the key on the inside of the L-shaped Enter key to a backslash, for consistency with traditional PC layouts;
* the key right on the right of the short, left Shift key to generate the `^Z` sequence. 
  That will be my Undo key. I'll bind `^Z` to `undo` in emacs as well.

The 5 ms delays you see between certain steps in my configuration file are needed for proper operation through rdesktop.
You may be able to remove them and preserve function if you intend to operate only on a local system.


## Remapped layout

![emacs layout with changes](https://github.com/scarpazza/battlecruiser/blob/main/M122-emacs-layout-changes.png)
  
Key:
* in white are keys that have identical function in the original keyboard
* in green are keys whose function is changed by the Soarer's converter automatic keyboard identification, without explicit configuration remaps: 
  for example,  the `Reset`, `Enter`, and `Field Exit` keys are remapped to `LeftControl`, `Right Control` and `Enter` by the converter.
* in red are keys whose function I altered explicitly via configuration file entries.
  

  
## Emacs configuration

Please find a sample configuration file illustrating how to map my Control-comma sequences as desired [in my dot-emacs repository](https://github.com/scarpazza/dot-emacs/blob/main/.emacs.d/scarpaz-battlecruiser.el).

In a nutshell, you can associate any extra function key via an elistp expression like9:

    (global-set-key (kbd "C-, 8") 'comment-region)
    
This line binds emacs command `comment-region` to key EXTRA_F9 that we remapped to sequence `^,`,`8`.

You can also bind Shift-modified keys to distinct emacs commands.
For example, after mapping Control+EXTRA_F9 to `comment-region`, it may make sense to map Control+EXTRA_F9 to its reverse, `uncomment-region`.

Contrary to intuition, this is not possible via
 
    ;; DO NOT USE - this expression is a counterexample and will not work!
    (global-set-key (kbd "C-S-, 8") 'uncomment-region) 
    
Rather, consider that our Soarer's macros won't clear the Shift modifier till after the first keystroke in the sequence.
The Shift modifier remains active while the first key (`,`) is depressed, and the Shift-modified character corresponding to the `,` key is the `<` character.
Consequently, the keyboard sends a `^<`,`8` ("Control+less than" followed by the digit 8) sequence when you press Control+Shift+EXTRA_F9.
You can bind that sequence to `uncomment-region` via:

    (global-set-key (kbd "C-< 8") 'uncomment-region)  
    
    

## Other resources
* [EasyHIDListen](https://github.com/adamhb123/EasyHIDListen)
* [sctools](https://github.com/thentenaar/sctools)
* [sctools prebuilt binaries](https://geekhack.org/index.php?topic=17458.0)
 

