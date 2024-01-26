package org.example.Buttons

/**
 * Concrete Product 1
 *
 * HTML button implementation.
 */
class HtmlButton : Button {
    override fun render() {
        println("<button>Test Button</button>")
        this.onClick()
    }

    override fun onClick() {
        println("\"Click! Html Button says - 'Hello World!'\"")
    }
}