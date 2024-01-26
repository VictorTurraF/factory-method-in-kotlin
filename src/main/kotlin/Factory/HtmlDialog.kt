package org.example.Factory

import org.example.Buttons.Button
import org.example.Buttons.HtmlButton

class HtmlDialog : Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}