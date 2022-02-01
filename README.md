# Modern-day battleship and battlecruiser use

## Goal

The goal of this project is repurposing vintage IBM M 122
(a.k.a. "battlecruisers" and "battleships") keyboards for modern usage.

Specifically, I configure the extra keys to generate sequences: 
* that are easy bindable to emacs functions without conflicting with existing default key bindings, and
* survive across Microsoft Remote Desktop and an X-Windows connections (tested).

While my choices are subjective and aim at primarily at satisfying a
developer running predominantly emacs either on a local or a remote
system (possibly connected via rdesktop, X windows sessions, or both),
you might be able to adapt this project easily to slightly different
needs.


## Deliverables

The M122 keyboards come in multiple variants, a few discussed in the next section, 
which typically employ connectors and protocols not supported by modern PCs. 
The most popular manner to use these keyboards on contemporary PCs is by making or buying 
a USB adapter commonly known as *Soarer's converter*.  

If you desire a ready-made solution, Soarer's converters are inexpensive and easily available on eBay.

I am posting: 

* a Soarer's converter configuration file that remaps the keyboard to convenient keystroke sequences 
  ([m122-emacs.sc](https://github.com/scarpazza/battlecruiser/blob/main/m122-emacs.sc)) and

* [sample emacs startup configuration files](https://github.com/scarpazza/dot-emacs/blob/main/.emacs.d/scarpaz-battlecruiser.el) 
  that illustrate how to bind those sequences as desired. 
  
The key mappings I chose are chosen precisely to :
1. be easily re-bindable from emacs and 
2. survive Microsoft's rdesktop; 
   specifically, recent versions of Microsoft Remote Desktop no longer relay function keys F13-F24 to the remote system.

Even if it has "emacs" in the name (and indeed I am a heavy emacs user), that configuration can be used more generally.



## Keyboard Variants
I have direct experience with three variants of the IBM Model M 122-key keyboard:

- the [Type II](https://sharktastica.co.uk/topics/m122_diffs#Type2), Part No. 1390572, 
  - was originally shipped with the IBM 3196 terminals 
  - is commonly referred to as "battleship", together with the earlier Type I,
  - uses a 240-degree DIN plug,
  - a Soarer's converter for it [can be found on eBay here](https://www.ebay.com/itm/282575692501);

- the [Type III](https://sharktastica.co.uk/topics/m122_diffs#Type3), Part No. 1395660, 
  - was originally shipped with the IBM InfoWindow terminal;  
  - is commonly referred to as "battlecruiser" because it's lighter and smaller than its predecessor;
  - uses an RJ45 connector and 
  - a Soarer's converter for it [can be found on eBay here](https://www.ebay.com/itm/282933562080);

- a "Type 4.5" original made by IBM and upgraded to USB by Unicomp.
  This keyboard can connect to a contemporary PC and does not support programming. 
  It is not covered in this page.

The converter configuration I post works equally well on the Type II and Type III variant.

To learn more on this topic, see Sharktastica's [page dedicated to M122 variants](https://sharktastica.co.uk/topics/m122_diffs).
That website is always the definitive reference for all Model M information.


## Physical restoration

New-old-stock, genuine IBM M122 keyboards seem no longer available on the market. 
If they were, their price would probably be prohibitive. 
New M122-style keyboards also available from Unicomp.  
Vintage, used IBM M122 keyboards are available at affordable prices, especially if untested or needing
restoration otherwise.

I have worked so far on four M122 specimens: disassembling them, removing all the keycaps and key
stems, washing the plastic shells, cleaning keycaps and keys in an ultrasonic cleaner, cleaning the
board assembly by hand separately, replacing the rivets with fasteners and nuts (a.k.a., *bolt
mod*).

Some photos of the restoration process are at https://imgur.com/a/aTVRmuB

To order keycaps and parts, you might use the following vendors:
* [ClickyKeyboards](https://www.clickykeyboards.com/) carries original, vintage keycaps and
  a variety of vintage repair parts for the Model M keyboards in general,
* [Unicomp](https://www.pckeyboard.com/page/category/Buttons) sells new custom keycaps,
  and new Model-M keyboards.

## Original layout

The original key layout reflects the keyboard's original purpose as an IBM terminal keyboard.
![Original layout](https://github.com/scarpazza/battlecruiser/blob/main/M122-original-layout.png)
Notice the position of the `Enter`, `Field Exit`, `Field +` keys.
Notice the numeric keypad layout, and the lack of  `Print Screen`, `Num Lock`, `Scroll Lock` keys.


## Key remapping discussion

My Soarer's adapter configuration is in [m122-emacs.sc](https://github.com/scarpazza/battlecruiser/blob/main/m122-emacs.sc).

It remaps the function keys `F13`-`F24` and the *extra function keys* (i.e., the ten, pebble-colored
keys to the left of the alphanumeric area, corresponding to `sctool`'s identifiers `EXTRA_F1`,
`EXTRA_F2`, ... `EXTRA_F10`).

I remap those keys mostly to sequences of two characters: the first being a Control-Comma (`^,`),
and the second either a digit or a letter.

I remap:
* the first extra function key to the `Esc` key (without explicit remapping, Esc would be where
  NumLock is normally located in PC keyboards)
* the last extra function key to the `Hyper` or `Windows` key
* the remaining 8 extra function keys to `^,`,`<digit>` for digit = {1, 2, 3, ..., 8}.
* function keys `F13`-`F24` (i.e., the 12 keys above the traditional F1-F12 keys) to `^,`,`<letter>`
  for letter = {A, B, ..., L}
* the key on the inside of the L-shaped Enter key to a backslash, for consistency with traditional
  PC layouts;
* the key right on the right of the short, left Shift key to generate the `^, Z` sequence.
  
The 5 ms delays you see between steps in my configuration file are needed for proper
operation through rdesktop, especially through slowish connections. You may be able to remove them
and preserve function if you intend to operate only on a local system.

Additional considerations:

* *Caps Lock*: there's an almost universal consensus that it is time to get rid of the Caps Lock key. 
  It was created to solve a problem nobody has anymore. Now the key is just taking up precious space. 
  People who are into keyboard construction frequently leave it out entirely and use its space for something else.
  For us doing vintage restoration, the question opens what to remap Caps Lock to.
  Many swap it with the `Ctrl` key. That doesn't work for me, because my left pinky is too used to finding Ctrl exactly where it is. 
  In fact, the empty space between `Ctrl` and `Alt` on the Model M keyboard is particularly ergonomic hand-alignment reference point.
  Others swap it with `Esc`. But `Esc` is already so close in my remap. 
  I choose to remap it to `Pause`, which I configure both in Windows and Linux to serve as a `Compose` key.
  Relevant links:
  - [WinCompose](https://github.com/samhocevar/wincompose)
  - [How to define a Compose Key in Linux terminal](https://unix.stackexchange.com/questions/44453/how-to-define-a-compose-key-in-terminal-no-desktop-environment)
  - [Remapping a key to Compose in Linux](https://unix.stackexchange.com/questions/195065/remapping-caps-lock-to-compose)
  

* *Numeric keypad*: I reprogrammed the keys in the general numerical keypad to reflect the layout in
  standard PCs, i.e., with the top row containing keys: `NumLock`, `/`, `*`, `-`.
  I reconfigured the tall 2x1 key to act as `Enter`. 
  Two key remains unmentioned: the keys on the rightmost column, second and third row.
  On traditional PCs, their place is taken by one tall 2x1 `+` key.
  I choose to map the lower of those two keys to `+`, and the upper to a "Control-Comma 9" sequence.

* I couldn't find any good reasons to preserve the `Scroll Lock` key, so I removed it.
  
* The same applies to the `Pause` key.

* A painful discussion applies to the `NumLock` key. In a keyboard that possesses both arrow keys
  and a numeric keypad, I see no reason to ever be able to configure the numeric keypad to function
  as a duplicate set of arrow keys. In my opinion, `NumLock` should be permanently enabled and no
  `NumLock` key should exist.  However, removing the `NumLock` key from the layout leaves the user
  in trouble in some circumstances in which they are the weakest, namely at login screens. Many
  Microsoft Windows versions boot by default with `NumLock` disabled, and require users to type
  passwords or PIN numbers to log in. I type PINs via the keypad. The lack of an option to turn on
  the numeric keypad at that time would be annoying.
  

## Remapped layout

![emacs layout with changes](https://github.com/scarpazza/battlecruiser/blob/main/M122-emacs-layout-changes.png)
  
Key:
* in white are keys that have identical function in the original keyboard
* in green are keys whose function is changed by the Soarer's converter automatic keyboard identification, without explicit configuration remaps: 
  for example,  the `Reset`, `Enter`, and `Field Exit` keys are remapped to `LeftControl`, `Right Control` and `Enter` by the converter.
* in red are keys whose function I altered explicitly via configuration file entries.
  

  
## Emacs bindings

My [personal emacs binding configuration](https://github.com/scarpazza/dot-emacs/blob/main/.emacs.d/scarpaz-battlecruiser.el) illustrates practically how you can bind the Control-comma sequences just described to emacs commands as you desire.

This is work in progress and I only post it for illustrative purposes.

My bindings are also pictured as follows:
![emacs bindings](https://github.com/scarpazza/battlecruiser/blob/main/M122-emacs-bindings.png)

Keys shaded in blue are those I remapped.
Keys in bright white are keys for which I haven't found a binding yet.

In a nutshell, you can associate any extra function key via an elisp expression like:

    (global-set-key (kbd "C-, 8") 'comment-region)
    
This line binds emacs command `comment-region` to key EXTRA_F9 that we remapped to sequence `^,`,`8`.

You can also bind Shift-modified keys to distinct emacs commands.
For example, after mapping Control+EXTRA_F9 to `comment-region`, it may make sense to map Control+EXTRA_F9 to its reverse, `uncomment-region`.

Contrary to intuition, this is not possible via
 
    ;; DO NOT USE - this expression is a counterexample and will not work!
    (global-set-key (kbd "C-s-, 8") 'uncomment-region) 
    
Rather, consider that our Soarer's macros won't clear the Shift modifier till after the first keystroke in the sequence.
The Shift modifier remains active while the first key (`,`) is depressed, and the Shift-modified character corresponding to the `,` key is the `<` character.
Consequently, the keyboard sends a `^<`,`8` ("Control+less than" followed by the digit 8) sequence when you press Control+Shift+EXTRA_F9.
You can bind that sequence to `uncomment-region` via:

    (global-set-key (kbd "C-< 8") 'uncomment-region)  
    
    
    
## Other resources
* [EasyHIDListen](https://github.com/adamhb123/EasyHIDListen)
* [sctools](https://github.com/thentenaar/sctools)
* [sctools prebuilt binaries](https://geekhack.org/index.php?topic=17458.0)
* [Bitten's Model M Restoration Megaguide](https://photos.app.goo.gl/52yArEH55wRpg2aN6)


## Legal disclaimers

This repository contains no code, only metadata and configuration files. 
Artifacts contained in this repository were developed during personal time, not in connection with any form of employment or any employer, current or past.
I, the author, believe that all the contents in this repository are of no commercial interest to anybody, including my employers, current and past.
