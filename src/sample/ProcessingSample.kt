package sample

import processing.core.PApplet

fun main() {
    PApplet.main("sample.ProcessingSample")
}

class ProcessingSample: PApplet() {
    override fun settings() {
        size(300, 300)
    }

    override fun setup() {

    }

    override fun draw() {
        background(200)
    }
}