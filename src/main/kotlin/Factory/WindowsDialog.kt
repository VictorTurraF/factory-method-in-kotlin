package org.example.Factory

import org.example.Buttons.Button
import org.example.Buttons.WindowsButton

class WindowsDialog : Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}